package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Room Management", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        add(titleLabel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(
                new Object[] {"Room ID", "Capacity", "Location", "State"}, 0);

        tableModel.addRow(new Object[] {"R101", 20, "Building A", "Available"});
        tableModel.addRow(new Object[] {"R205", 12, "Building B", "Occupied"});
        tableModel.addRow(new Object[] {"R310", 40, "Building C", "Maintenance"});

        JTable roomTable = new JTable(tableModel);
        roomTable.setFillsViewportHeight(true);
        add(new JScrollPane(roomTable), BorderLayout.CENTER);

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        JTextField roomIdField = new JTextField(7);
        JTextField capacityField = new JTextField(5);
        JTextField locationField = new JTextField(10);
        JComboBox<String> stateBox = new JComboBox<>(
                new String[] {"Available", "Occupied", "Maintenance"});

        JButton addButton = new JButton("Add Room");
        JButton updateButton = new JButton("Update State");
        JButton removeButton = new JButton("Remove");
        JButton backButton = new JButton("Back");

        addButton.addActionListener(event -> tableModel.addRow(new Object[] {
                roomIdField.getText(),
                capacityField.getText(),
                locationField.getText(),
                stateBox.getSelectedItem()
        }));

        updateButton.addActionListener(event -> {
            int selectedRow = roomTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.setValueAt(
                        stateBox.getSelectedItem(), selectedRow, 3);
            }
        });

        removeButton.addActionListener(event -> {
            int selectedRow = roomTable.getSelectedRow();
            if (selectedRow >= 0) {
                tableModel.removeRow(selectedRow);
            }
        });

        backButton.addActionListener(
                event -> mainUI.showPanel(MainUI.ADMIN_DASHBOARD));

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
