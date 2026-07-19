package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));

        JLabel titleLabel = new JLabel("Create Account", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Account Information"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(8, 8, 8, 8);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JTextField userIdField = new JTextField(22);
        JTextField emailField = new JTextField(22);
        JTextField organizationIdField = new JTextField(22);
        JPasswordField passwordField = new JPasswordField(22);
        JPasswordField confirmPasswordField = new JPasswordField(22);
        JComboBox<String> accountTypeBox = new JComboBox<>(
                new String[] {"Student", "Faculty", "Staff", "Partner"});

        addRow(formPanel, constraints, 0, "User ID:", userIdField);
        addRow(formPanel, constraints, 1, "Email:", emailField);
        addRow(formPanel, constraints, 2, "Organization ID:",
                organizationIdField);
        addRow(formPanel, constraints, 3, "Account Type:", accountTypeBox);
        addRow(formPanel, constraints, 4, "Password:", passwordField);
        addRow(formPanel, constraints, 5, "Confirm Password:",
                confirmPasswordField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        JButton createButton = new JButton("Register");
        JButton backButton = new JButton("Back");

        createButton.addActionListener(event -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Account registration submitted.",
                    "Registration",
                    JOptionPane.INFORMATION_MESSAGE);
            mainUI.showPanel(MainUI.LOGIN);
        });

        backButton.addActionListener(event -> mainUI.showPanel(MainUI.LOGIN));

        buttonPanel.add(createButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        formPanel.add(buttonPanel, constraints);

        add(formPanel, BorderLayout.CENTER);
    }

    private void addRow(
            JPanel panel,
            GridBagConstraints constraints,
            int row,
            String label,
            java.awt.Component component) {

        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        panel.add(new JLabel(label), constraints);

        constraints.gridx = 1;
        constraints.weightx = 1;
        panel.add(component, constraints);
    }
}
