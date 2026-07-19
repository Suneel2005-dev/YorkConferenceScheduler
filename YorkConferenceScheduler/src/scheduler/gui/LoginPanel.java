package scheduler.gui;

import java.awt.BorderLayout;
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

		JLabel titleLabel = new JLabel("Room Booking System", JLabel.CENTER);
		titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 28f));
		add(titleLabel, BorderLayout.NORTH);

		JPanel formPanel = new JPanel(new GridBagLayout());
		formPanel.setBorder(BorderFactory.createTitledBorder("Login"));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.fill = GridBagConstraints.HORIZONTAL;

		emailField = new JTextField(24);
		passwordField = new JPasswordField(24);
		roleBox = new JComboBox<>(
				new String[] { "Student", "Faculty", "Staff", "Partner", "Administrator", "Chief Event Coordinator" });

		addFormRow(formPanel, constraints, 0, "Email:", emailField);
		addFormRow(formPanel, constraints, 1, "Password:", passwordField);
		addFormRow(formPanel, constraints, 2, "Role:", roleBox);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));

		JButton loginButton = new JButton("Login");
		JButton registerButton = new JButton("Create Account");

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
                        throw new IllegalArgumentException("Invalid Chief Event Coordinator "
                                + "email or password.");
                    }

                    JOptionPane.showMessageDialog(this, "Login successful.", "Login",
                            JOptionPane.INFORMATION_MESSAGE);

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
		formPanel.add(buttonPanel, constraints);

		add(formPanel, BorderLayout.CENTER);
	}

	private void addFormRow(JPanel panel, GridBagConstraints constraints, int row, String labelText,
			java.awt.Component component) {

		constraints.gridx = 0;
		constraints.gridy = row;
		constraints.gridwidth = 1;
		constraints.weightx = 0;

		panel.add(new JLabel(labelText), constraints);

		constraints.gridx = 1;
		constraints.weightx = 1;

		panel.add(component, constraints);
	}
}
