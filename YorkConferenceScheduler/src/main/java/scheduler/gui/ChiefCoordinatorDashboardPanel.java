package scheduler.gui;

import java.awt.BorderLayout;
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

        JLabel titleLabel = new JLabel(
                "Chief Event Coordinator Dashboard",
                JLabel.CENTER);

        titleLabel.setFont(
                titleLabel.getFont().deriveFont(Font.BOLD, 26f));

        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(
                BorderFactory.createTitledBorder(
                        "Generate Administrator Account"));

        GridBagConstraints constraints =
                new GridBagConstraints();

        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        emailField = new JTextField(24);
        adminIDField = new JTextField(24);

        addFormRow(
                formPanel,
                constraints,
                0,
                "Administrator Email:",
                emailField);

        addFormRow(
                formPanel,
                constraints,
                1,
                "Administrator ID:",
                adminIDField);

        JButton submitButton =
                new JButton("Generate Administrator");

        submitButton.addActionListener(event ->
                generateAdministrator());

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.weightx = 1;

        formPanel.add(submitButton, constraints);

        JButton logoutButton = new JButton("Logout");

        logoutButton.addActionListener(event -> {
            emailField.setText("");
            adminIDField.setText("");
            mainUI.showPanel(MainUI.LOGIN);
        });

        JPanel bottomPanel = new JPanel();
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

        } catch (IllegalArgumentException
                | IllegalStateException exception) {

            JOptionPane.showMessageDialog(
                    this,
                    exception.getMessage(),
                    "Administrator Creation Error",
                    JOptionPane.ERROR_MESSAGE);
        }
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
