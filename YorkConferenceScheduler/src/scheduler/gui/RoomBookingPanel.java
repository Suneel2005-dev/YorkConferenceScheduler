package scheduler.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));

        JLabel titleLabel = new JLabel("Book a Room", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Booking Details"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(8, 8, 8, 8);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JComboBox<String> roomBox = new JComboBox<>(
                new String[] {"R101", "R205", "R310"});
        JTextField dateField = new JTextField(LocalDate.now().toString(), 15);
        JTextField startTimeField = new JTextField(
                LocalTime.now().withSecond(0).withNano(0).toString(), 15);
        JSpinner hoursSpinner = new JSpinner(
                new SpinnerNumberModel(1, 1, 12, 1));

        addRow(formPanel, constraints, 0, "Room:", roomBox);
        addRow(formPanel, constraints, 1, "Date:", dateField);
        addRow(formPanel, constraints, 2, "Start Time:", startTimeField);
        addRow(formPanel, constraints, 3, "Hours:", hoursSpinner);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        JButton continueButton = new JButton("Continue to Payment");
        JButton backButton = new JButton("Back");

        continueButton.addActionListener(event -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Room selection saved.",
                    "Booking",
                    JOptionPane.INFORMATION_MESSAGE);
            mainUI.showPanel(MainUI.PAYMENT);
        });

        backButton.addActionListener(
                event -> mainUI.showUserBookings());

        buttonPanel.add(continueButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 4;
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
