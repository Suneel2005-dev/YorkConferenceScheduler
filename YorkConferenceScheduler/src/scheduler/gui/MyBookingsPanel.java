package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
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
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        setBackground(new Color(240, 244, 248));

        JLabel titleLabel = new JLabel("Your Bookings Registry", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(30, 41, 59));
        add(titleLabel, BorderLayout.NORTH);

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[] { "Booking ID", "Room", "Date", "Start", "End", "Checked In", "Status" }, 0);

        tableModel.addRow(new Object[] { "B1001", "R101", "2026-07-20", "10:00", "12:00", "No", "Confirmed" });

        JTable bookingTable = new JTable(tableModel);
        bookingTable.setFillsViewportHeight(true);
        bookingTable.setRowHeight(25);
        bookingTable.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        
        JScrollPane scrollPane = new JScrollPane(bookingTable);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setOpaque(false);

        JButton checkInButton = new JButton("Check In");
        JButton cancelButton = new JButton("Cancel Booking");
        JButton backButton = new JButton("Back");

        checkInButton.setBackground(new Color(39, 174, 96));
        checkInButton.setForeground(Color.WHITE);
        cancelButton.setBackground(new Color(231, 76, 60));
        cancelButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(142, 68, 173));
        backButton.setForeground(Color.WHITE);

        JButton[] buttons = {checkInButton, cancelButton, backButton};
        for (JButton btn : buttons) {
            btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
            btn.setFocusPainted(false);
            
            // macOS Render Fix
            btn.setOpaque(true);
            btn.setBorderPainted(false);
        }

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

        backButton.addActionListener(event -> mainUI.showPanel(MainUI.USER_DASHBOARD));

        buttonPanel.add(checkInButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
