package scheduler.gui;

import java.time.LocalDateTime;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import scheduler.user.User;

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
    private final MyBookingsPanel myBookingsPanel;
    private final PaymentPanel paymentPanel;

    private User currentUser;

    public MainUI() {
        setTitle("Room Booking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1000, 650));
        setLocationRelativeTo(null);

        applySystemLookAndFeel();

        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        myBookingsPanel = new MyBookingsPanel(this);
        paymentPanel = new PaymentPanel(this);

        contentPanel.add(new LoginPanel(this), LOGIN);
        contentPanel.add(new RegistrationPanel(this), REGISTRATION);
        contentPanel.add(new UserDashboardPanel(this), USER_DASHBOARD);
        contentPanel.add(new AdminDashboardPanel(this), ADMIN_DASHBOARD);
        contentPanel.add(new ChiefCoordinatorDashboardPanel(this), CHIEF_COORDINATOR_DASHBOARD);
        contentPanel.add(new RoomManagementPanel(this), ROOM_MANAGEMENT);
        contentPanel.add(new RoomBookingPanel(this), ROOM_BOOKING);
        contentPanel.add(myBookingsPanel, MY_BOOKINGS);
        contentPanel.add(paymentPanel, PAYMENT);
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

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void showUserBookings() {
        myBookingsPanel.setAdministratorMode(false);
        showPanel(MY_BOOKINGS);
    }

    public void showAdministratorBookings() {
        myBookingsPanel.setAdministratorMode(true);
        showPanel(MY_BOOKINGS);
    }

    public void showPaymentPanel(
            String roomID,
            LocalDateTime startTime,
            int hours) {

        paymentPanel.setPendingBooking(
                roomID,
                startTime,
                hours);

        showPanel(PAYMENT);
    }

    public void logout() {
        currentUser = null;
        showPanel(LOGIN);
    }
}
