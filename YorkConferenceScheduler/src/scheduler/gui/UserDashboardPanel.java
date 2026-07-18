package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserDashboardPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public UserDashboardPanel(MainUI mainUI) {
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        JLabel titleLabel = new JLabel("User Dashboard", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 26f));
        add(titleLabel, BorderLayout.NORTH);

        JPanel actionPanel = new JPanel(new GridLayout(2, 2, 20, 20));

        JButton bookRoomButton = new JButton("Book a Room");
        JButton myBookingsButton = new JButton("My Bookings");
        JButton paymentButton = new JButton("Payments");
        JButton logoutButton = new JButton("Logout");

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
