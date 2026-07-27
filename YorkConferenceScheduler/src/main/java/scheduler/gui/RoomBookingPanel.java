package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import scheduler.booking.BookingSystemFacade;
import scheduler.room.Room;

public class RoomBookingPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final BookingSystemFacade facade;
    private final JComboBox<String> roomBox;

    public RoomBookingPanel(MainUI mainUI) {
        facade = BookingSystemFacade.getInstance();

        setLayout(new BorderLayout());
        setBorder(
                BorderFactory.createEmptyBorder(
                        30, 80, 30, 80));

        JLabel titleLabel =
                new JLabel(
                        "Book a Room",
                        JLabel.CENTER);

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(24f));

        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel =
                new JPanel(new GridBagLayout());

        formPanel.setBorder(
                BorderFactory.createTitledBorder(
                        "Booking Details"));

        GridBagConstraints constraints =
                new GridBagConstraints();

        constraints.insets =
                new Insets(8, 8, 8, 8);

        constraints.fill =
                GridBagConstraints.HORIZONTAL;

        roomBox = new JComboBox<>();
        loadRooms();

        JTextField dateField =
                new JTextField(
                        LocalDate.now()
                                .plusDays(1)
                                .toString(),
                        15);

        JTextField startTimeField =
                new JTextField("09:00", 15);

        JSpinner hoursSpinner =
                new JSpinner(
                        new SpinnerNumberModel(
                                1,
                                1,
                                12,
                                1));

        addRow(
                formPanel,
                constraints,
                0,
                "Room:",
                roomBox);

        addRow(
                formPanel,
                constraints,
                1,
                "Date (yyyy-MM-dd):",
                dateField);

        addRow(
                formPanel,
                constraints,
                2,
                "Start Time (HH:mm):",
                startTimeField);

        addRow(
                formPanel,
                constraints,
                3,
                "Hours:",
                hoursSpinner);

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                15,
                                0));

        JButton continueButton =
                new JButton(
                        "Continue to Payment");

        JButton refreshButton =
                new JButton("Refresh Rooms");

        JButton backButton =
                new JButton("Back");

        continueButton.addActionListener(event -> {
            try {
                if (mainUI.getCurrentUser() == null) {
                    throw new IllegalStateException(
                            "You must be logged in "
                                    + "to create a booking.");
                }

                String roomID =
                        (String) roomBox.getSelectedItem();

                if (roomID == null
                        || roomID.isBlank()) {

                    throw new IllegalArgumentException(
                            "Select an available room.");
                }

                LocalDate date =
                        LocalDate.parse(
                                dateField
                                        .getText()
                                        .trim());

                LocalTime startTime =
                        LocalTime.parse(
                                startTimeField
                                        .getText()
                                        .trim());

                LocalDateTime bookingStart =
                        LocalDateTime.of(
                                date,
                                startTime);

                int hours =
                        (Integer) hoursSpinner
                                .getValue();

                if (bookingStart.isBefore(
                        LocalDateTime.now())) {

                    throw new IllegalArgumentException(
                            "The booking cannot "
                                    + "start in the past.");
                }

                LocalDateTime bookingEnd =
                        bookingStart.plusHours(hours);

                if (!facade
                        .getBookingManager()
                        .isRoomAvailable(
                                roomID,
                                bookingStart,
                                bookingEnd)) {

                    throw new IllegalArgumentException(
                            "The room is unavailable "
                                    + "during that time.");
                }

                mainUI.showPaymentPanel(
                        roomID,
                        bookingStart,
                        hours);

            } catch (DateTimeParseException exception) {
                JOptionPane.showMessageDialog(
                        this,
                        "Enter the date as yyyy-MM-dd "
                                + "and the time as HH:mm.",
                        "Invalid Date or Time",
                        JOptionPane.ERROR_MESSAGE);

            } catch (IllegalArgumentException
                    | IllegalStateException exception) {

                JOptionPane.showMessageDialog(
                        this,
                        exception.getMessage(),
                        "Booking Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        refreshButton.addActionListener(
                event -> loadRooms());

        backButton.addActionListener(
                event -> mainUI.showPanel(
                        MainUI.USER_DASHBOARD));

        buttonPanel.add(continueButton);
        buttonPanel.add(refreshButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;

        formPanel.add(
                buttonPanel,
                constraints);

        add(formPanel, BorderLayout.CENTER);
    }

    public void loadRooms() {
        roomBox.removeAllItems();

        Map<String, Room> rooms =
                facade.getRooms();

        for (Room room : rooms.values()) {
            if (room.isMaintenance()) {
                continue;
            }

            if ("disabled".equalsIgnoreCase(
                    room.getStatus())) {

                continue;
            }

            roomBox.addItem(
                    room.getRoomID());
        }
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