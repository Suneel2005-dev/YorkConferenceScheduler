package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Room Sensor Status", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        add(titleLabel, BorderLayout.NORTH);

        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[] {
                        "Sensor ID", "Room ID", "Occupancy",
                        "Last Badge Scan", "Status"
                }, 0);

        tableModel.addRow(new Object[] {
                "S-101", "R101", "Empty", "-", "Online"
        });
        tableModel.addRow(new Object[] {
                "S-205", "R205", "Occupied", "STU-4451", "Online"
        });
        tableModel.addRow(new Object[] {
                "S-310", "R310", "Unknown", "-", "Maintenance"
        });

        JTable sensorTable = new JTable(tableModel);
        sensorTable.setFillsViewportHeight(true);
        add(new JScrollPane(sensorTable), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        JButton refreshButton = new JButton("Refresh");
        JButton simulateButton = new JButton("Simulate Occupancy Change");
        JButton backButton = new JButton("Back");

        refreshButton.addActionListener(event -> sensorTable.repaint());

        simulateButton.addActionListener(event -> {
            int selectedRow = sensorTable.getSelectedRow();
            if (selectedRow >= 0) {
                Object currentValue = tableModel.getValueAt(selectedRow, 2);
                String nextValue = "Occupied".equals(currentValue)
                        ? "Empty"
                        : "Occupied";
                tableModel.setValueAt(nextValue, selectedRow, 2);
            }
        });

        backButton.addActionListener(
                event -> mainUI.showPanel(MainUI.ADMIN_DASHBOARD));

        buttonPanel.add(refreshButton);
        buttonPanel.add(simulateButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
