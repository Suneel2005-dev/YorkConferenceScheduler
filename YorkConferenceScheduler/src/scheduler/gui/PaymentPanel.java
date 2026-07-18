package gui;

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
import javax.swing.JTextField;

public class PaymentPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public PaymentPanel(MainUI mainUI) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));

        JLabel titleLabel = new JLabel("Payment", JLabel.CENTER);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Payment Details"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(8, 8, 8, 8);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JComboBox<String> paymentMethodBox = new JComboBox<>(new String[] {
                "Credit Card", "Debit Card", "Institution Billing"
        });

        JTextField cardholderField = new JTextField(20);
        JTextField cardNumberField = new JTextField(20);
        JTextField expiryField = new JTextField(8);

        addRow(formPanel, constraints, 0, "Payment Method:",
                paymentMethodBox);
        addRow(formPanel, constraints, 1, "Cardholder Name:",
                cardholderField);
        addRow(formPanel, constraints, 2, "Card / Account Number:",
                cardNumberField);
        addRow(formPanel, constraints, 3, "Expiry Date:", expiryField);

        JLabel depositLabel = new JLabel("Upfront deposit: one hour's fee");
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        formPanel.add(depositLabel, constraints);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        JButton payButton = new JButton("Pay and Confirm");
        JButton backButton = new JButton("Back");

        payButton.addActionListener(event -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Payment submitted and booking confirmed.",
                    "Payment",
                    JOptionPane.INFORMATION_MESSAGE);
            mainUI.showPanel(MainUI.MY_BOOKINGS);
        });

        backButton.addActionListener(
                event -> mainUI.showPanel(MainUI.ROOM_BOOKING));

        buttonPanel.add(payButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 5;
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
