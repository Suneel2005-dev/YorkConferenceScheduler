package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import scheduler.user.ChiefEventCoordinator;

public class ChiefCoordinatorDashboardPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    private final JTextField emailField;
    private final JTextField adminIDField;

    public ChiefCoordinatorDashboardPanel(MainUI mainUI) {
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        setBackground(new Color(240, 244, 248));

        JLabel titleLabel = new JLabel("Chief Event Coordinator Dashboard", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(30, 41, 59));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(192, 57, 43), 2), 
                "Generate Administrator Account"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(12, 12, 12, 12);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        emailField = new JTextField(24);
        adminIDField = new JTextField(24);
        
        emailField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        adminIDField.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        addFormRow(formPanel, constraints, 0, "Administrator Email:", emailField);
        addFormRow(formPanel, constraints, 1, "Administrator ID:", adminIDField);

        JButton submitButton = new JButton("Generate Administrator");
        submitButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        submitButton.setBackground(new Color(39, 174, 96)); 
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);
        
        // macOS Render Fix
        submitButton.setOpaque(true);
        submitButton.setBorderPainted(false);

        submitButton.addActionListener(event -> generateAdministrator());

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 1;
        constraints.insets = new Insets(20, 12, 12, 12);
        formPanel.add(submitButton, constraints);

        JButton logoutButton = new JButton("Logout");
        logoutButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        logoutButton.setBackground(new Color(225, 112, 85));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setFocusPainted(false);
        
        // macOS Render Fix
        logoutButton.setOpaque(true);
        logoutButton.setBorderPainted(false);

        logoutButton.addActionListener(event -> {
            emailField.setText("");
            adminIDField.setText("");
            mainUI.showPanel(MainUI.LOGIN);
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.setOpaque(false);
        bottomPanel.add(logoutButton);

        add(formPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void generateAdministrator() {
        String email = emailField.getText().trim();
        String adminID = adminIDField.getText().trim();

        try {
            ChiefEventCoordinator
                    .getInstance()
                    .generateAdminAccount(email, adminID);

            emailField.setText("");
            adminIDField.setText("");

        } catch (IllegalArgumentException | IllegalStateException exception) {
            JOptionPane.showMessageDialog(
                    this,
                    exception.getMessage(),
                    "Administrator Creation Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addFormRow(JPanel panel, GridBagConstraints constraints, int row, String labelText, java.awt.Component component) {
        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        JLabel lbl = new JLabel(labelText);
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbl.setForeground(new Color(71, 85, 105));
        panel.add(lbl, constraints);

        constraints.gridx = 1;
        constraints.weightx = 1;
        panel.add(component, constraints);
    }
}
