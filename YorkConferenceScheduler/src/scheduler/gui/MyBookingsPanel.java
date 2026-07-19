package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import scheduler.booking.Booking;
import scheduler.booking.BookingSystemFacade;

public class MyBookingsPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private static final DateTimeFormatter DATE_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static final DateTimeFormatter TIME_FORMAT =
            DateTimeFormatter.ofPattern("HH:mm");

    private final MainUI mainUI;
    private final BookingSystemFacade facade;
    private final DefaultTableModel tableModel;
    private final JTable bookingTable;

    private boolean administratorMode;

    public MyBookingsPanel(MainUI mainUI) {
        this.mainUI = mainUI;
        facade = BookingSystemFacade.getInstance();

        setLayout(new BorderLayout(15, 15));
        setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20));

        JLabel titleLabel =
                new JLabel("Bookings", JLabel.CENTER);

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(24f));

        add(titleLabel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(
                new Object[] {
                        "Booking ID",
                        "User ID",
                        "Room",
                        "Date",
                        "Start",
                        "End",
                        "Checked In",
                        "Status"
                },
                0) {

            private static final long serialVersionUID = 1L;

            @Override
            public boolean isCellEditable(
                    int row,
                    int column) {

                return false;
            }
        };

        bookingTable = new JTable(tableModel);
        bookingTable.setFillsViewportHeight(true);

        add(
                new JScrollPane(bookingTable),
                BorderLayout.CENTER);

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                10,
                                5));

        JButton cancelButton =
                new JButton("Cancel Booking");

        JButton refreshButton =
                new JButton("Refresh");

        JButton backButton =
                new JButton("Back");

        cancelButton.addActionListener(event -> {
            int selectedRow =
                    bookingTable.getSelectedRow();

            if (selectedRow < 0) {
                showError("Select a booking first.");
                return;
            }

            String bookingID =
                    tableModel.getValueAt(
                            selectedRow,
                            0).toString();

            if (!facade.cancelBookingByID(bookingID)) {
                showError(
                        "The booking could not be cancelled.");
                return;
            }

            loadBookings();
        });

        refreshButton.addActionListener(
                event -> loadBookings());

        backButton.addActionListener(event -> {
            if (administratorMode) {
                mainUI.showPanel(
                        MainUI.ADMIN_DASHBOARD);
            } else {
                mainUI.showPanel(
                        MainUI.USER_DASHBOARD);
            }
        });

        buttonPanel.add(cancelButton);
        buttonPanel.add(refreshButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);

        addComponentListener(
                new ComponentAdapter() {
                    @Override
                    public void componentShown(
                            ComponentEvent event) {

                        loadBookings();
                    }
                });
    }

    public void setAdministratorMode(
            boolean administratorMode) {

        this.administratorMode =
                administratorMode;

        loadBookings();
    }

    private void loadBookings() {
        tableModel.setRowCount(0);

        for (Booking booking
                : facade.getBookings()) {

            if (!administratorMode
                    && mainUI.getCurrentUser() != null
                    && !booking.getUser()
                            .getUserID()
                            .equalsIgnoreCase(
                                    mainUI
                                            .getCurrentUser()
                                            .getUserID())) {

                continue;
            }

            String status;

            if (booking.isCancelled()) {
                status = "Cancelled";
            } else if (booking.isDepositForfeited()) {
                status = "Deposit Forfeited";
            } else {
                status = "Confirmed";
            }

            tableModel.addRow(new Object[] {
                    booking.getBookingID(),
                    booking.getUser().getUserID(),
                    booking.getRoom().getRoomID(),
                    booking.getStartTime()
                            .format(DATE_FORMAT),
                    booking.getStartTime()
                            .format(TIME_FORMAT),
                    booking.getEndTime()
                            .format(TIME_FORMAT),
                    booking.isCheckedIn()
                            ? "Yes"
                            : "No",
                    status
            });
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(
                this,
                message,
                "Booking Error",
                JOptionPane.ERROR_MESSAGE);
    }
}