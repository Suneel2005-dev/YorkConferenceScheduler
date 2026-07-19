package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import scheduler.booking.BookingSystemFacade;
import scheduler.room.Room;

public class RoomManagementPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final BookingSystemFacade facade;
    private final DefaultTableModel tableModel;
    private final JTable roomTable;

    public RoomManagementPanel(MainUI mainUI) {
        facade = BookingSystemFacade.getInstance();

        setLayout(new BorderLayout(15, 15));
        setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20));

        JLabel titleLabel =
                new JLabel("Room Management", JLabel.CENTER);

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(24f));

        add(titleLabel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(
                new Object[] {
                        "Room ID",
                        "Capacity",
                        "Building",
                        "Room",
                        "Occupied",
                        "Maintenance",
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

        roomTable = new JTable(tableModel);
        roomTable.setFillsViewportHeight(true);

        add(
                new JScrollPane(roomTable),
                BorderLayout.CENTER);

        JPanel controls =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                10,
                                5));

        JTextField roomIDField =
                new JTextField(7);

        JTextField capacityField =
                new JTextField(5);

        JTextField buildingField =
                new JTextField(10);

        JTextField roomNumberField =
                new JTextField(6);

        JComboBox<String> stateBox =
                new JComboBox<>(
                        new String[] {
                                "Available",
                                "Occupied",
                                "Maintenance"
                        });

        JButton addButton =
                new JButton("Add Room");

        JButton updateButton =
                new JButton("Update State");

        JButton removeButton =
                new JButton("Remove");

        JButton refreshButton =
                new JButton("Refresh");

        JButton backButton =
                new JButton("Back");

        addButton.addActionListener(event -> {
            try {
                String roomID =
                        roomIDField.getText().trim();

                int capacity = Integer.parseInt(
                        capacityField.getText().trim());

                String building =
                        buildingField.getText().trim();

                String roomNumber =
                        roomNumberField.getText().trim();

                String state =
                        (String) stateBox.getSelectedItem();

                boolean occupied =
                        "Occupied".equals(state);

                boolean maintenance =
                        "Maintenance".equals(state);

                Room room = new Room(
                        roomID,
                        capacity,
                        building,
                        roomNumber,
                        occupied,
                        maintenance,
                        maintenance
                                ? "disabled"
                                : "enabled");

                if (!facade.addRoom(room)) {
                    throw new IllegalArgumentException(
                            "A room with this ID already exists.");
                }

                loadRooms();

                roomIDField.setText("");
                capacityField.setText("");
                buildingField.setText("");
                roomNumberField.setText("");

            } catch (NumberFormatException exception) {
                showError(
                        "Capacity must be a whole number.");

            } catch (IllegalArgumentException
                    | IllegalStateException exception) {

                showError(exception.getMessage());
            }
        });

        updateButton.addActionListener(event -> {
            int selectedRow =
                    roomTable.getSelectedRow();

            if (selectedRow < 0) {
                showError("Select a room first.");
                return;
            }

            String roomID =
                    tableModel.getValueAt(
                            selectedRow,
                            0).toString();

            String state =
                    (String) stateBox.getSelectedItem();

            if (!facade.updateRoomState(
                    roomID,
                    state)) {

                showError(
                        "The room state could not be updated.");
                return;
            }

            loadRooms();
        });

        removeButton.addActionListener(event -> {
            int selectedRow =
                    roomTable.getSelectedRow();

            if (selectedRow < 0) {
                showError("Select a room first.");
                return;
            }

            String roomID =
                    tableModel.getValueAt(
                            selectedRow,
                            0).toString();

            if (!facade.removeRoom(roomID)) {
                showError(
                        "The room could not be removed. "
                                + "It may have an active booking.");
                return;
            }

            loadRooms();
        });

        refreshButton.addActionListener(
                event -> loadRooms());

        backButton.addActionListener(
                event -> mainUI.showPanel(
                        MainUI.ADMIN_DASHBOARD));

        controls.add(new JLabel("ID:"));
        controls.add(roomIDField);

        controls.add(new JLabel("Capacity:"));
        controls.add(capacityField);

        controls.add(new JLabel("Building:"));
        controls.add(buildingField);

        controls.add(new JLabel("Room:"));
        controls.add(roomNumberField);

        controls.add(stateBox);
        controls.add(addButton);
        controls.add(updateButton);
        controls.add(removeButton);
        controls.add(refreshButton);
        controls.add(backButton);

        add(controls, BorderLayout.SOUTH);

        addComponentListener(
                new ComponentAdapter() {
                    @Override
                    public void componentShown(
                            ComponentEvent event) {

                        loadRooms();
                    }
                });

        loadRooms();
    }

    private void loadRooms() {
        tableModel.setRowCount(0);

        for (Room room
                : facade.getRooms().values()) {

            tableModel.addRow(new Object[] {
                    room.getRoomID(),
                    room.getCapacity(),
                    room.getBuilding(),
                    room.getRoomNumber(),
                    room.isOccupied()
                            ? "Yes"
                            : "No",
                    room.isMaintenance()
                            ? "Yes"
                            : "No",
                    room.getStatus()
            });
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(
                this,
                message,
                "Room Management Error",
                JOptionPane.ERROR_MESSAGE);
    }
}
