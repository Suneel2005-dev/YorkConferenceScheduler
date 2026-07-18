package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminDashboardPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public AdminDashboardPanel(MainUI mainUI) {
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        JLabel titleLabel = new JLabel("Administrator Dashboard", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 26f));
        add(titleLabel, BorderLayout.NORTH);

        JPanel actionPanel = new JPanel(new GridLayout(2, 2, 20, 20));

        JButton roomManagementButton = new JButton("Manage Rooms");
        JButton sensorButton = new JButton("Sensor Status");
        JButton bookingsButton = new JButton("View Bookings");
        JButton logoutButton = new JButton("Logout");

        roomManagementButton.addActionListener(
                event -> mainUI.showPanel(MainUI.ROOM_MANAGEMENT));
        sensorButton.addActionListener(
                event -> mainUI.showPanel(MainUI.SENSOR));
        bookingsButton.addActionListener(
                event -> mainUI.showPanel(MainUI.MY_BOOKINGS));
        logoutButton.addActionListener(
                event -> mainUI.showPanel(MainUI.LOGIN));

        actionPanel.add(roomManagementButton);
        actionPanel.add(sensorButton);
        actionPanel.add(bookingsButton);
        actionPanel.add(logoutButton);

        add(actionPanel, BorderLayout.CENTER);
    }
}
