package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserDashboardPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public UserDashboardPanel(MainUI mainUI) {
        setLayout(new BorderLayout(25, 25));
        setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));
        setBackground(new Color(240, 244, 248)); // Deep background canvas canvas color tint

        JLabel titleLabel = new JLabel("User Dashboard", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titleLabel.setForeground(new Color(30, 41, 59)); // Deep scannable charcoal
        add(titleLabel, BorderLayout.NORTH);

        JPanel actionPanel = new JPanel(new GridLayout(2, 2, 25, 25));
        actionPanel.setOpaque(false);

        JButton bookRoomButton = new JButton("Book a Room");
        JButton myBookingsButton = new JButton("My Bookings");
        JButton paymentButton = new JButton("Payments");
        JButton logoutButton = new JButton("Logout");

        // Uniform styling loop with explicit macOS background overrides
        JButton[] gridButtons = {bookRoomButton, myBookingsButton, paymentButton, logoutButton};
        for (JButton btn : gridButtons) {
            btn.setFont(new Font("Segoe UI", Font.BOLD, 16));
            btn.setFocusPainted(false);
            
            // --- MACOS RENDERING CORRECTION RULES ---
            btn.setOpaque(true);
            btn.setBorderPainted(false);
            // ----------------------------------------
            
            if (btn == logoutButton) {
                btn.setBackground(new Color(225, 112, 85)); // Soft warning coral red
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(new Color(30, 41, 59)); // Deep structural slate black
                btn.setForeground(Color.WHITE);
            }
        }

        bookRoomButton.addActionListener(
                event -> mainUI.showPanel(MainUI.ROOM_BOOKING));
        myBookingsButton.addActionListener(
                event -> mainUI.showPanel(MainUI.MY_BOOKINGS));
        paymentButton.addActionListener(
                event -> mainUI.showPanel(MainUI.PAYMENT));
        logoutButton.addActionListener(
                event -> mainUI.showPanel(MainUI.LOGIN));

        actionPanel.add(bookRoomButton);
        actionPanel.add(myBookingsButton);
        actionPanel.add(paymentButton);
        actionPanel.add(logoutButton);

        add(actionPanel, BorderLayout.CENTER);
    }
}
