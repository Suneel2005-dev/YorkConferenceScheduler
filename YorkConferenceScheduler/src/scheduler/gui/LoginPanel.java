package gui;

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
        roleBox = new JComboBox<>(new String[] {
                "Student", "Faculty", "Staff", "Partner", "Administrator",
                "Chief Event Coordinator"
        });

        addFormRow(formPanel, constraints, 0, "Email:", emailField);
        addFormRow(formPanel, constraints, 1, "Password:", passwordField);
        addFormRow(formPanel, constraints, 2, "Role:", roleBox);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Create Account");

        loginButton.addActionListener(event -> {
            String selectedRole = (String) roleBox.getSelectedItem();

            if ("Administrator".equals(selectedRole)
                    || "Chief Event Coordinator".equals(selectedRole)) {
                mainUI.showPanel(MainUI.ADMIN_DASHBOARD);
            } else {
                mainUI.showPanel(MainUI.USER_DASHBOARD);
            }
        });

        registerButton.addActionListener(
                event -> mainUI.showPanel(MainUI.REGISTRATION));

        buttonPanel.add(loginButton);
        buttonPanel.add(registerButton);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        formPanel.add(buttonPanel, constraints);

        add(formPanel, BorderLayout.CENTER);
    }

    private void addFormRow(
            JPanel panel,
            GridBagConstraints constraints,
            int row,
            String labelText,
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
