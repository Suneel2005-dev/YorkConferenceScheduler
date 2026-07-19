package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class RoomBookingPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public RoomBookingPanel(MainUI mainUI) {
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));
        setBackground(new Color(240, 244, 248));

        JLabel titleLabel = new JLabel("Reserve a Campus Space", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
        titleLabel.setForeground(new Color(192, 57, 43));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(230, 126, 34), 2), 
                "RESERVATION METRICS CONFIGURATION", 0, 0, 
                new Font("Segoe UI", Font.BOLD, 12), new Color(230, 126, 34)));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(12, 12, 12, 12);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JComboBox<String> roomBox = new JComboBox<>(new String[] {"R101", "R205", "R310"});
        JTextField dateField = new JTextField(LocalDate.now().toString(), 15);
        JTextField startTimeField = new JTextField(LocalTime.now().withSecond(0).withNano(0).toString(), 15);
        JSpinner hoursSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));

        java.awt.Component[] fields = {roomBox, dateField, startTimeField, hoursSpinner};
        for(java.awt.Component c : fields) {
            c.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            c.setForeground(new Color(30, 41, 59));
            c.setBackground(Color.WHITE);
        }

        addRow(formPanel, constraints, 0, "Select Target Room:", roomBox);
        addRow(formPanel, constraints, 1, "Reservation Date Target:", dateField);
        addRow(formPanel, constraints, 2, "Scheduled Start Time:", startTimeField);
        addRow(formPanel, constraints, 3, "Booking Duration Hours:", hoursSpinner);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 0));
        buttonPanel.setOpaque(false);
        
        JButton continueButton = new JButton("Proceed to Billing Verification");
        JButton backButton = new JButton("Cancel and Return");

        // Mac background rendering overrides
        continueButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        continueButton.setBackground(new Color(39, 174, 96));
        continueButton.setForeground(Color.WHITE);
        continueButton.setFocusPainted(false);
        continueButton.setOpaque(true);
        continueButton.setBorderPainted(false);

        backButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        backButton.setBackground(new Color(231, 76, 60)); 
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setOpaque(true);
        backButton.setBorderPainted(false);

        continueButton.addActionListener(event -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Room selection saved.",
                    "Booking",
                    JOptionPane.INFORMATION_MESSAGE);
            mainUI.showPanel(MainUI.PAYMENT);
        });

        backButton.addActionListener(event -> mainUI.showPanel(MainUI.USER_DASHBOARD));

        buttonPanel.add(continueButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(25, 10, 10, 10);
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
