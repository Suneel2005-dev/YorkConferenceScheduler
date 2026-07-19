package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import scheduler.user.User;
import scheduler.user.UserFactory;
import scheduler.user.ChiefEventCoordinator;
import scheduler.user.Administrator;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private final JTextField emailField;
	private final JPasswordField passwordField;
	private final JComboBox<String> roleBox;

	public LoginPanel(MainUI mainUI) {
		setLayout(new BorderLayout(20, 20));
		setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));
		setBackground(new Color(240, 244, 248)); 

		JLabel titleLabel = new JLabel("YorkU Room Booking System", JLabel.CENTER);
		titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		titleLabel.setForeground(new Color(192, 57, 43)); 
		add(titleLabel, BorderLayout.NORTH);

		JPanel formPanel = new JPanel(new GridBagLayout());
		formPanel.setBackground(Color.WHITE); 
		formPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(new Color(192, 57, 43), 2), 
				"SECURE ACCESS GATEWAY", 0, 0, 
				new Font("Segoe UI", Font.BOLD, 12), new Color(192, 57, 43)));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(12, 12, 12, 12);
		constraints.fill = GridBagConstraints.HORIZONTAL;

		emailField = new JTextField(24);
		passwordField = new JPasswordField(24);
		roleBox = new JComboBox<>(
				new String[] { "Student", "Faculty", "Staff", "Partner", "Administrator", "Chief Event Coordinator" });

		emailField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		emailField.setForeground(new Color(30, 41, 59));
		emailField.setBackground(Color.WHITE);
		
		passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		passwordField.setForeground(new Color(30, 41, 59));
		passwordField.setBackground(Color.WHITE);
		
		roleBox.setFont(new Font("Segoe UI", Font.BOLD, 14));
		roleBox.setForeground(new Color(30, 41, 59));
		roleBox.setBackground(Color.WHITE);

		addFormRow(formPanel, constraints, 0, "Email Address:", emailField);
		addFormRow(formPanel, constraints, 1, "Password:", passwordField);
		addFormRow(formPanel, constraints, 2, "Account Profile Role:", roleBox);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 0));
		buttonPanel.setOpaque(false);

		JButton loginButton = new JButton("Sign In");
		JButton registerButton = new JButton("Create New Account");

		// --- MAC BUTTON FIX APPLIED HERE ---
		loginButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		loginButton.setBackground(new Color(39, 174, 96)); // Bold Emerald Green
		loginButton.setForeground(Color.WHITE); 
		loginButton.setOpaque(true);
		loginButton.setBorderPainted(false); // Overrides the transparent Aqua system look on Mac

		registerButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		registerButton.setBackground(new Color(41, 128, 185)); // Vibrant Sky Blue
		registerButton.setForeground(Color.WHITE); 
		registerButton.setOpaque(true);
		registerButton.setBorderPainted(false); // Overrides the transparent Aqua system look on Mac
		// ------------------------------------

		loginButton.addActionListener(event -> {
			String email = emailField.getText().trim();
			String password = new String(passwordField.getPassword());
			String selectedRole = (String) roleBox.getSelectedItem();

			try {
				if (email.isEmpty() || password.isEmpty()) {
					throw new IllegalArgumentException("Email and password are required.");
				}

				if ("Chief Event Coordinator".equals(selectedRole)) {
                    ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
                    if (!coordinator.authenticate(email, password)) {
                        throw new IllegalArgumentException("Invalid Chief Event Coordinator email or password.");
                    }
                    JOptionPane.showMessageDialog(this, "Login successful.", "Login", JOptionPane.INFORMATION_MESSAGE);
                    emailField.setText("");
                    passwordField.setText("");
                    mainUI.showPanel(MainUI.CHIEF_COORDINATOR_DASHBOARD);
                    return;
                }

                if ("Administrator".equals(selectedRole)) {
                    Administrator administrator = Administrator.authenticate(email, password);
                    if (administrator == null) {
                        throw new IllegalArgumentException("Invalid administrator email or password.");
                    }
                    JOptionPane.showMessageDialog(this, "Administrator login successful.", "Login", JOptionPane.INFORMATION_MESSAGE);
                    emailField.setText("");
                    passwordField.setText("");
                    mainUI.showPanel(MainUI.ADMIN_DASHBOARD);
                    return;
                }

				UserFactory factory = new UserFactory();
				User user = factory.getUserByEmail(email);

				if (user == null || !user.checkPassword(password)) {
					throw new IllegalArgumentException("Invalid email or password.");
				}
				if (!user.getAccountType().equalsIgnoreCase(selectedRole)) {
					throw new IllegalArgumentException("The selected role does not match this account.");
				}
				if (!user.isVerified()) {
					throw new IllegalArgumentException("This university account has not been verified.");
				}

				JOptionPane.showMessageDialog(this, "Login successful.", "Login", JOptionPane.INFORMATION_MESSAGE);
				mainUI.showPanel(MainUI.USER_DASHBOARD);

			} catch (IllegalArgumentException | IllegalStateException exception) {
                JOptionPane.showMessageDialog(this, exception.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
            }
		});

		registerButton.addActionListener(event -> mainUI.showPanel(MainUI.REGISTRATION));

		buttonPanel.add(loginButton);
		buttonPanel.add(registerButton);

		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(25, 12, 12, 12);
		formPanel.add(buttonPanel, constraints);

		add(formPanel, BorderLayout.CENTER);
	}

	private void addFormRow(JPanel panel, GridBagConstraints constraints, int row, String labelText, java.awt.Component component) {
		constraints.gridx = 0;
		constraints.gridy = row;
		constraints.gridwidth = 1;
		constraints.weightx = 0;
		JLabel lbl = new JLabel(labelText);
		lbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lbl.setForeground(new Color(44, 62, 80)); 
		panel.add(lbl, constraints);

		constraints.gridx = 1;
		constraints.weightx = 1;
		panel.add(component, constraints);
	}
}
