package scheduler.gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainUI extends JFrame {

    private static final long serialVersionUID = 1L;

    public static final String LOGIN = "LOGIN";
    public static final String REGISTRATION = "REGISTRATION";
    public static final String USER_DASHBOARD = "USER_DASHBOARD";
    public static final String ADMIN_DASHBOARD = "ADMIN_DASHBOARD";
    public static final String CHIEF_COORDINATOR_DASHBOARD = "CHIEF_COORDINATOR_DASHBOARD";
    public static final String ROOM_MANAGEMENT = "ROOM_MANAGEMENT";
    public static final String ROOM_BOOKING = "ROOM_BOOKING";
    public static final String MY_BOOKINGS = "MY_BOOKINGS";
    public static final String PAYMENT = "PAYMENT";
    public static final String SENSOR = "SENSOR";

    private final CardLayout cardLayout;
    private final JPanel contentPanel;

    public MainUI() {
        setTitle("Room Booking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 650));
        setLocationRelativeTo(null);

        applySystemLookAndFeel();

        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        contentPanel.add(new LoginPanel(this), LOGIN);
        contentPanel.add(new RegistrationPanel(this), REGISTRATION);
        contentPanel.add(new UserDashboardPanel(this), USER_DASHBOARD);
        contentPanel.add(new AdminDashboardPanel(this), ADMIN_DASHBOARD);
        contentPanel.add(new ChiefCoordinatorDashboardPanel(this), CHIEF_COORDINATOR_DASHBOARD);
        contentPanel.add(new RoomManagementPanel(this), ROOM_MANAGEMENT);
        contentPanel.add(new RoomBookingPanel(this), ROOM_BOOKING);
        contentPanel.add(new MyBookingsPanel(this), MY_BOOKINGS);
        contentPanel.add(new PaymentPanel(this), PAYMENT);
        contentPanel.add(new SensorPanel(this), SENSOR);

        setContentPane(contentPanel);
        showPanel(LOGIN);
        pack();
    }

    public void showPanel(String panelName) {
        cardLayout.show(contentPanel, panelName);
    }

    private void applySystemLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exception) {
            // The application will use Swing's default look and feel.
        }
    }
}
