package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminDashboardPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public AdminDashboardPanel(MainUI mainUI) {
        setLayout(new BorderLayout(25, 25));
        setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));
        setBackground(new Color(240, 244, 248)); 

        JLabel titleLabel = new JLabel("Administrator Dashboard", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
        titleLabel.setForeground(new Color(30, 41, 59));
        add(titleLabel, BorderLayout.NORTH);

        JPanel actionPanel = new JPanel(new GridLayout(2, 2, 25, 25));
        actionPanel.setOpaque(false);

        JButton roomManagementButton = new JButton("Manage Rooms");
        JButton sensorButton = new JButton("Sensor Status");
        JButton bookingsButton = new JButton("View Bookings");
        JButton logoutButton = new JButton("Logout");

        JButton[] buttons = {roomManagementButton, sensorButton, bookingsButton, logoutButton};
        for (JButton btn : buttons) {
            btn.setFont(new Font("Segoe UI", Font.BOLD, 15));
            btn.setFocusPainted(false);
            
            // macOS Render Fix
            btn.setOpaque(true);
            btn.setBorderPainted(false);
            
            if (btn == logoutButton) {
                btn.setBackground(new Color(225, 112, 85)); 
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(new Color(30, 41, 59)); 
                btn.setForeground(Color.WHITE);
            }
        }

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
