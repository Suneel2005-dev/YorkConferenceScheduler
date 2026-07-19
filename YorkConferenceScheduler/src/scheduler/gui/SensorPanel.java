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

public class SensorPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public SensorPanel(MainUI mainUI) {
        setLayout(new BorderLayout(15, 15));
        setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        setBackground(new Color(240, 244, 248));

        JLabel titleLabel = new JLabel("Room Sensor Metrics Stream", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(30, 41, 59));
        add(titleLabel, BorderLayout.NORTH);

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[] { "Sensor ID", "Room ID", "Occupancy Status", "Last Badge Scan", "Hardware Health" }, 0);

        tableModel.addRow(new Object[] { "S-101", "R101", "Empty", "-", "Online" });
        tableModel.addRow(new Object[] { "S-205", "R205", "Occupied", "STU-4451", "Online" });
        tableModel.addRow(new Object[] { "S-310", "R310", "Unknown", "-", "Maintenance" });

        JTable sensorTable = new JTable(tableModel);
        sensorTable.setFillsViewportHeight(true);
        sensorTable.setRowHeight(24);
        sensorTable.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        JScrollPane scrollPane = new JScrollPane(sensorTable);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttonPanel.setOpaque(false);

        JButton refreshButton = new JButton("Refresh Stream");
        JButton simulateButton = new JButton("Simulate Occupancy Trigger");
        JButton backButton = new JButton("Back");

        refreshButton.setBackground(new Color(41, 128, 185));
        simulateButton.setBackground(new Color(230, 126, 34)); 
        backButton.setBackground(new Color(142, 68, 173));

        JButton[] buttons = {refreshButton, simulateButton, backButton};
        for (JButton btn : buttons) {
            btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            
            // macOS Render Fix
            btn.setOpaque(true);
            btn.setBorderPainted(false);
        }

        refreshButton.addActionListener(event -> sensorTable.repaint());

        simulateButton.addActionListener(event -> {
            int selectedRow = sensorTable.getSelectedRow();
            if (selectedRow >= 0) {
                Object currentValue = tableModel.getValueAt(selectedRow, 2);
                String nextValue = "Occupied".equals(currentValue) ? "Empty" : "Occupied";
                tableModel.setValueAt(nextValue, selectedRow, 2);
            }
        });

        backButton.addActionListener(event -> mainUI.showPanel(MainUI.ADMIN_DASHBOARD));

        buttonPanel.add(refreshButton);
        buttonPanel.add(simulateButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
