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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public RegistrationPanel(MainUI mainUI) {
		setLayout(new BorderLayout(20, 20));
		setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));
		setBackground(new Color(240, 244, 248));

		JLabel titleLabel = new JLabel("Create System Profile", JLabel.CENTER);
		titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		titleLabel.setForeground(new Color(192, 57, 43));
		add(titleLabel, BorderLayout.NORTH);

		JPanel formPanel = new JPanel(new GridBagLayout());
		formPanel.setBackground(Color.WHITE);
		formPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(new Color(41, 128, 185), 2), 
				"REGISTRATION INFORMATION", 0, 0, 
				new Font("Segoe UI", Font.BOLD, 12), new Color(41, 128, 185)));

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.insets = new Insets(8, 12, 8, 12);
		constraints.fill = GridBagConstraints.HORIZONTAL;

		JTextField userIdField = new JTextField(22);
		JTextField emailField = new JTextField(22);
		JTextField organizationIdField = new JTextField(22);
		JPasswordField passwordField = new JPasswordField(22);
		JPasswordField confirmPasswordField = new JPasswordField(22);
		JComboBox<String> accountTypeBox = new JComboBox<>(new String[] { "Student", "Faculty", "Staff", "Partner" });

		java.awt.Component[] components = {userIdField, emailField, organizationIdField, passwordField, confirmPasswordField, accountTypeBox};
		for(java.awt.Component c : components) {
			c.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			c.setForeground(new Color(30, 41, 59)); 
			c.setBackground(Color.WHITE);
		}

		addRow(formPanel, constraints, 0, "Choose User ID:", userIdField);
		addRow(formPanel, constraints, 1, "Email Address:", emailField);
		addRow(formPanel, constraints, 2, "Student / Org Number:", organizationIdField);
		addRow(formPanel, constraints, 3, "Account Profile Type:", accountTypeBox);
		addRow(formPanel, constraints, 4, "Account Password:", passwordField);
		addRow(formPanel, constraints, 5, "Confirm Password:", confirmPasswordField);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 0));
		buttonPanel.setOpaque(false);
		
		JButton createButton = new JButton("Register Profile Account");
		JButton backButton = new JButton("Return to Login");

		// Mac background rendering overrides
		createButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		createButton.setBackground(new Color(39, 174, 96));
		createButton.setForeground(Color.WHITE);
		createButton.setFocusPainted(false);
		createButton.setOpaque(true);
		createButton.setBorderPainted(false);

		backButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		backButton.setBackground(new Color(142, 68, 173)); 
		backButton.setForeground(Color.WHITE);
		backButton.setFocusPainted(false);
		backButton.setOpaque(true);
		backButton.setBorderPainted(false);

		createButton.addActionListener(event -> {
			try {
				String userID = userIdField.getText().trim();
				String email = emailField.getText().trim();
				String organizationID = organizationIdField.getText().trim();
				String password = new String(passwordField.getPassword());
				String confirmPassword = new String(confirmPasswordField.getPassword());

				if (!password.equals(confirmPassword)) {
					throw new IllegalArgumentException("Passwords do not match.");
				}

				java.util.Map<String, Object> details = new java.util.HashMap<>();
				details.put("userID", userID);
				details.put("email", email);
				details.put("password", password);
				details.put("orgID", organizationID);

				scheduler.user.UserFactory factory = new scheduler.user.UserFactory();
				factory.createUser(accountTypeBox.getSelectedItem().toString(), details);

				JOptionPane.showMessageDialog(this, "Account created successfully!", "Registration",
						JOptionPane.INFORMATION_MESSAGE);
				mainUI.showPanel(MainUI.LOGIN);

			} catch (IllegalArgumentException ex) {
				JOptionPane.showMessageDialog(this, ex.getMessage(), "Registration Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		backButton.addActionListener(event -> mainUI.showPanel(MainUI.LOGIN));

		buttonPanel.add(createButton);
		buttonPanel.add(backButton);

		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(20, 12, 12, 12);
		formPanel.add(buttonPanel, constraints);

		add(formPanel, BorderLayout.CENTER);
	}

	private void addRow(JPanel panel, GridBagConstraints constraints, int row, String label, java.awt.Component component) {
		constraints.gridx = 0;
		constraints.gridy = row;
		constraints.gridwidth = 1;
		constraints.weightx = 0;
		JLabel lbl = new JLabel(label);
		lbl.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lbl.setForeground(new Color(44, 62, 80));
		panel.add(lbl, constraints);

		constraints.gridx = 1;
		constraints.weightx = 1;
		panel.add(component, constraints);
	}
}
