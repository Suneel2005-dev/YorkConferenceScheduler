package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import scheduler.booking.BookingSystemFacade;
import scheduler.user.User;

public class PaymentPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final DateTimeFormatter DISPLAY_FORMAT =
            DateTimeFormatter.ofPattern(
                    "yyyy-MM-dd HH:mm");

    private final MainUI mainUI;
    private final BookingSystemFacade facade;

    private final JComboBox<String> paymentMethodBox;
    private final JTextField cardholderField;
    private final JTextField cardNumberField;
    private final JTextField expiryField;

    private final JLabel bookingLabel;
    private final JLabel depositLabel;

    private String pendingRoomID;
    private LocalDateTime pendingStartTime;
    private int pendingHours;

    public PaymentPanel(MainUI mainUI) {
        this.mainUI = mainUI;
        facade = BookingSystemFacade.getInstance();

        setLayout(new BorderLayout());

        setBorder(
                BorderFactory.createEmptyBorder(
                        30, 80, 30, 80));

        JLabel titleLabel =
                new JLabel(
                        "Payment",
                        JLabel.CENTER);

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(24f));

        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel =
                new JPanel(new GridBagLayout());

        formPanel.setBorder(
                BorderFactory.createTitledBorder(
                        "Payment Details"));

        GridBagConstraints constraints =
                new GridBagConstraints();

        constraints.insets =
                new Insets(8, 8, 8, 8);

        constraints.fill =
                GridBagConstraints.HORIZONTAL;

        paymentMethodBox =
                new JComboBox<>(
                        new String[] {
                                "Credit Card",
                                "Debit Card",
                                "Institution Billing"
                        });

        cardholderField =
                new JTextField(20);

        cardNumberField =
                new JTextField(20);

        expiryField =
                new JTextField(8);

        bookingLabel =
                new JLabel(
                        "No booking selected.");

        depositLabel =
                new JLabel(
                        "Upfront deposit: $0.00");

        addRow(
                formPanel,
                constraints,
                0,
                "Payment Method:",
                paymentMethodBox);

        addRow(
                formPanel,
                constraints,
                1,
                "Cardholder Name:",
                cardholderField);

        addRow(
                formPanel,
                constraints,
                2,
                "Card / Account Number:",
                cardNumberField);

        addRow(
                formPanel,
                constraints,
                3,
                "Expiry Date:",
                expiryField);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;

        formPanel.add(
                bookingLabel,
                constraints);

        constraints.gridy = 5;

        formPanel.add(
                depositLabel,
                constraints);

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                15,
                                0));

        JButton payButton =
                new JButton(
                        "Pay and Confirm");

        JButton backButton =
                new JButton("Back");

        payButton.addActionListener(event -> {
            try {
                User user =
                        mainUI.getCurrentUser();

                if (user == null) {
                    throw new IllegalStateException(
                            "No user is currently logged in.");
                }

                if (pendingRoomID == null
                        || pendingStartTime == null
                        || pendingHours <= 0) {

                    throw new IllegalStateException(
                            "No booking is waiting "
                                    + "for payment.");
                }

                String paymentMethod =
                        (String) paymentMethodBox
                                .getSelectedItem();

                validatePaymentFields(
                        paymentMethod);

                boolean successful =
                        facade.processBooking(
                                user.getUserID(),
                                pendingRoomID,
                                pendingStartTime,
                                pendingHours,
                                paymentMethod);

                if (!successful) {
                    throw new IllegalStateException(
                            "The booking could not be "
                                    + "completed. The room "
                                    + "may no longer be available.");
                }

                JOptionPane.showMessageDialog(
                        this,
                        "Payment successful. "
                                + "The booking was saved.",
                        "Booking Confirmed",
                        JOptionPane.INFORMATION_MESSAGE);

                clearPaymentFields();
                clearPendingBooking();

                mainUI.showUserBookings();

            } catch (IllegalArgumentException
                    | IllegalStateException exception) {

                JOptionPane.showMessageDialog(
                        this,
                        exception.getMessage(),
                        "Payment Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        backButton.addActionListener(
                event -> mainUI.showPanel(
                        MainUI.ROOM_BOOKING));

        buttonPanel.add(payButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;

        formPanel.add(
                buttonPanel,
                constraints);

        add(formPanel, BorderLayout.CENTER);
    }

    public void setPendingBooking(
            String roomID,
            LocalDateTime startTime,
            int hours) {

        pendingRoomID = roomID;
        pendingStartTime = startTime;
        pendingHours = hours;

        LocalDateTime endTime =
                startTime.plusHours(hours);

        bookingLabel.setText(
                "Room "
                        + roomID
                        + " | "
                        + startTime.format(
                                DISPLAY_FORMAT)
                        + " to "
                        + endTime.format(
                                DISPLAY_FORMAT));

        depositLabel.setText(
                String.format(
                        "Upfront deposit: $%.2f",
                        getHourlyRate(
                                mainUI.getCurrentUser())));
    }

    private void validatePaymentFields(
            String paymentMethod) {

        if (paymentMethod == null) {
            throw new IllegalArgumentException(
                    "Select a payment method.");
        }

        if ("Institution Billing"
                .equalsIgnoreCase(paymentMethod)) {

            if (cardNumberField
                    .getText()
                    .trim()
                    .isEmpty()) {

                throw new IllegalArgumentException(
                        "Enter an institution "
                                + "account number.");
            }

            return;
        }

        if (cardholderField
                .getText()
                .trim()
                .isEmpty()) {

            throw new IllegalArgumentException(
                    "Enter the cardholder name.");
        }

        String cardNumber =
                cardNumberField
                        .getText()
                        .replace(" ", "")
                        .trim();

        if (!cardNumber.matches("\\d{8,19}")) {
            throw new IllegalArgumentException(
                    "Enter a valid card number.");
        }

        if (!expiryField
                .getText()
                .trim()
                .matches("\\d{2}/\\d{2}")) {

            throw new IllegalArgumentException(
                    "Enter the expiry date as MM/YY.");
        }
    }

    private double getHourlyRate(User user) {
        if (user == null
                || user.getAccountType() == null) {

            return 0.0;
        }

        switch (user.getAccountType()
                .toLowerCase()) {

        case "student":
            return 20.0;

        case "faculty":
            return 30.0;

        case "staff":
            return 40.0;

        case "partner":
            return 50.0;

        default:
            return 0.0;
        }
    }

    private void clearPaymentFields() {
        cardholderField.setText("");
        cardNumberField.setText("");
        expiryField.setText("");
    }

    private void clearPendingBooking() {
        pendingRoomID = null;
        pendingStartTime = null;
        pendingHours = 0;

        bookingLabel.setText(
                "No booking selected.");

        depositLabel.setText(
                "Upfront deposit: $0.00");
    }

    private void addRow(
            JPanel panel,
            GridBagConstraints constraints,
            int row,
            String label,
            java.awt.Component component) {

        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.gridwidth = 1;
        constraints.weightx = 0;

        panel.add(
                new JLabel(label),
                constraints);

        constraints.gridx = 1;
        constraints.weightx = 1;

        panel.add(
                component,
                constraints);
    }
}