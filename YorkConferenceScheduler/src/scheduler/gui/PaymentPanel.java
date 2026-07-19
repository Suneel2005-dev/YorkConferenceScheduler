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
import javax.swing.JTextField;

public class PaymentPanel extends JPanel {

    private static final long serialVersionUID = 1L;

    public PaymentPanel(MainUI mainUI) {
        setLayout(new BorderLayout(20, 20));
        setBorder(BorderFactory.createEmptyBorder(30, 80, 30, 80));
        setBackground(new Color(240, 244, 248));

        JLabel titleLabel = new JLabel("Secure Billing Payment", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(30, 41, 59));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(41, 128, 185), 2), "Payment Details"));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JComboBox<String> paymentMethodBox = new JComboBox<>(new String[] {
                "Credit Card", "Debit Card", "Institution Billing"
        });

        JTextField cardholderField = new JTextField(20);
        JTextField cardNumberField = new JTextField(20);
        JTextField expiryField = new JTextField(8);

        cardholderField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cardNumberField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        expiryField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        paymentMethodBox.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        addRow(formPanel, constraints, 0, "Payment Method:", paymentMethodBox);
        addRow(formPanel, constraints, 1, "Cardholder Name:", cardholderField);
        addRow(formPanel, constraints, 2, "Card / Account Number:", cardNumberField);
        addRow(formPanel, constraints, 3, "Expiry Date:", expiryField);

        JLabel depositLabel = new JLabel("ℹ Upfront deposit notice: One hour's rate fee is charged immediately.");
        depositLabel.setFont(new Font("Segoe UI", Font.ITALIC | Font.BOLD, 12));
        depositLabel.setForeground(new Color(225, 112, 85));
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(15, 10, 10, 10);
        formPanel.add(depositLabel, constraints);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        buttonPanel.setBackground(Color.WHITE);
        
        JButton payButton = new JButton("Pay and Confirm");
        JButton backButton = new JButton("Back");

        payButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        payButton.setBackground(new Color(39, 174, 96));
        payButton.setForeground(Color.WHITE);
        payButton.setFocusPainted(false);

        backButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        backButton.setBackground(new Color(142, 68, 173));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);

        JButton[] actionButtons = {payButton, backButton};
        for (JButton btn : actionButtons) {
            // macOS Render Fix
            btn.setOpaque(true);
            btn.setBorderPainted(false);
        }

        payButton.addActionListener(event -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Payment submitted and booking confirmed.",
                    "Payment",
                    JOptionPane.INFORMATION_MESSAGE);
            mainUI.showPanel(MainUI.MY_BOOKINGS);
        });

        backButton.addActionListener(event -> mainUI.showPanel(MainUI.ROOM_BOOKING));

        buttonPanel.add(payButton);
        buttonPanel.add(backButton);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(20, 10, 10, 10);
        formPanel.add(buttonPanel, constraints);

        add(formPanel, BorderLayout.CENTER);
    }

    private void addRow(JPanel panel, GridBagConstraints constraints, int row, String label, java.awt.Component component) {
        constraints.gridx = 0;
        constraints.gridy = row;
        constraints.gridwidth = 1;
        constraints.weightx = 0;
        JLabel lbl = new JLabel(label);
        lbl.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lbl.setForeground(new Color(71, 85, 105));
        panel.add(lbl, constraints);

        constraints.gridx = 1;
        constraints.weightx = 1;
        panel.add(component, constraints);
    }
}
