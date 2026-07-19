package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyBookingsPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public MyBookingsPanel(MainUI mainUI) {
        setLayout(new BorderLayout(15, 15));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Bookings", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        add(titleLabel, BorderLayout.NORTH);

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[] {
                        "Booking ID", "Room", "Date", "Start", "End",
                        "Checked In", "Status"
                }, 0);

        tableModel.addRow(new Object[] {
                "B1001", "R101", "2026-07-20", "10:00", "12:00",
                "No", "Confirmed"
        });

        JTable bookingTable = new JTable(tableModel);
        bookingTable.setFillsViewportHeight(true);
        add(new JScrollPane(bookingTable), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        JButton checkInButton = new JButton("Check In");
        JButton cancelButton = new JButton("Cancel Booking");
        JButton backButton = new JButton("Back");

        checkInButton.addActionListener(event -> {
            int selectedRow = bookingTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.setValueAt("Yes", selectedRow, 5);
            }
        });

        cancelButton.addActionListener(event -> {
            int selectedRow = bookingTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.setValueAt("Cancelled", selectedRow, 6);
            }
        });

        backButton.addActionListener(
                event -> mainUI.showPanel(MainUI.USER_DASHBOARD));

        buttonPanel.add(checkInButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
