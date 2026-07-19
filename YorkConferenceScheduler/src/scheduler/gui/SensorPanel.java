package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import scheduler.booking.BookingSystemFacade;
import scheduler.room.Room;
import scheduler.sensor.HardwareSensor;

public class SensorPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final BookingSystemFacade facade;
    private final DefaultTableModel tableModel;
    private final JTable sensorTable;

    public SensorPanel(MainUI mainUI) {
        facade = BookingSystemFacade.getInstance();

        setLayout(new BorderLayout(15, 15));
        setBorder(
                BorderFactory.createEmptyBorder(
                        20, 20, 20, 20));

        JLabel titleLabel =
                new JLabel(
                        "Room Sensor Status",
                        JLabel.CENTER);

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(24f));

        add(titleLabel, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(
                new Object[] {
                        "Sensor ID",
                        "Room ID",
                        "Occupancy",
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

        sensorTable = new JTable(tableModel);
        sensorTable.setFillsViewportHeight(true);

        add(
                new JScrollPane(sensorTable),
                BorderLayout.CENTER);

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                10,
                                5));

        JButton refreshButton =
                new JButton("Refresh");

        JButton simulateButton =
                new JButton(
                        "Simulate Occupancy Change");

        JButton backButton =
                new JButton("Back");

        refreshButton.addActionListener(
                event -> loadSensors());

        simulateButton.addActionListener(event -> {
            int selectedRow =
                    sensorTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Select a room first.",
                        "Sensor Error",
                        JOptionPane.ERROR_MESSAGE);

                return;
            }

            String roomID =
                    tableModel.getValueAt(
                            selectedRow,
                            1).toString();

            Room room = facade.getRoom(roomID);

            if (room == null) {
                return;
            }

            HardwareSensor sensor =
                    new HardwareSensor(
                            "S-" + roomID,
                            roomID);

            sensor.attach(
                    facade.getBookingManager());

            sensor.detectOccupancy(
                    !room.isOccupied());

            loadSensors();
        });

        backButton.addActionListener(
                event -> mainUI.showPanel(
                        MainUI.ADMIN_DASHBOARD));

        buttonPanel.add(refreshButton);
        buttonPanel.add(simulateButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);

        addComponentListener(
                new ComponentAdapter() {
                    @Override
                    public void componentShown(
                            ComponentEvent event) {

                        loadSensors();
                    }
                });

        loadSensors();
    }

    private void loadSensors() {
        tableModel.setRowCount(0);

        for (Room room
                : facade.getRooms().values()) {

            tableModel.addRow(new Object[] {
                    "S-" + room.getRoomID(),
                    room.getRoomID(),
                    room.isOccupied()
                            ? "Occupied"
                            : "Empty",
                    room.isMaintenance()
                            ? "Yes"
                            : "No",
                    room.getStatus()
            });
        }
    }
}
