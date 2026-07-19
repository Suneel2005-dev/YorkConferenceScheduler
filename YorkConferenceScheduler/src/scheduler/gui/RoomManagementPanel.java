package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RoomManagementPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private final DefaultTableModel tableModel;

    public RoomManagementPanel(MainUI mainUI) {
        setLayout(new BorderLayout(15, 15));
        setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        setBackground(new Color(240, 244, 248));

        JLabel titleLabel = new JLabel("Room Management Dashboard", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(30, 41, 59));
        add(titleLabel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[] {"Room ID", "Capacity", "Location", "State"}, 0);
        tableModel.addRow(new Object[] {"R101", 20, "Building A", "Available"});
        tableModel.addRow(new Object[] {"R205", 12, "Building B", "Occupied"});
        tableModel.addRow(new Object[] {"R310", 40, "Building C", "Maintenance"});

        JTable roomTable = new JTable(tableModel);
        roomTable.setFillsViewportHeight(true);
        roomTable.setRowHeight(24);
        roomTable.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        
        JScrollPane scrollPane = new JScrollPane(roomTable);
        add(scrollPane, BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 8));
        controls.setOpaque(false);

        JTextField roomIdField = new JTextField(7);
        JTextField capacityField = new JTextField(5);
        JTextField locationField = new JTextField(10);
        JComboBox<String> stateBox = new JComboBox<>(new String[] {"Available", "Occupied", "Maintenance"});

        roomIdField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        capacityField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        locationField.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        stateBox.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        JButton addButton = new JButton("Add Room");
        JButton updateButton = new JButton("Update State");
        JButton removeButton = new JButton("Remove");
        JButton backButton = new JButton("Back");

        addButton.setBackground(new Color(39, 174, 96));
        updateButton.setBackground(new Color(41, 128, 185));
        removeButton.setBackground(new Color(231, 76, 60));
        backButton.setBackground(new Color(142, 68, 173));

        JButton[] buttons = {addButton, updateButton, removeButton, backButton};
        for (JButton btn : buttons) {
            btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            
            // macOS Render Fix
            btn.setOpaque(true);
            btn.setBorderPainted(false);
        }

        addButton.addActionListener(event -> tableModel.addRow(new Object[] {
                roomIdField.getText(),
                capacityField.getText(),
                locationField.getText(),
                stateBox.getSelectedItem()
        }));

        updateButton.addActionListener(event -> {
            int selectedRow = roomTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.setValueAt(stateBox.getSelectedItem(), selectedRow, 3);
            }
        });

        removeButton.addActionListener(event -> {
            int selectedRow = roomTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.removeRow(selectedRow);
            }
        });

        backButton.addActionListener(event -> mainUI.showPanel(MainUI.ADMIN_DASHBOARD));

        controls.add(new JLabel("ID:"));
        controls.add(roomIdField);
        controls.add(new JLabel("Capacity:"));
        controls.add(capacityField);
        controls.add(new JLabel("Location:"));
        controls.add(locationField);
        controls.add(stateBox);
        controls.add(addButton);
        controls.add(updateButton);
        controls.add(removeButton);
        controls.add(backButton);

        add(controls, BorderLayout.SOUTH);
    }
}
