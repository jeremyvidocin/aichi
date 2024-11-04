package views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FConnexionView extends JFrame {
    private JTextField nomField;
    private JPasswordField passwordField;
    private JButton validerButton;
    private JButton quitterButton;
    private JLabel messageLabel;

    public FConnexionView() {
        setTitle("Connexion");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        nomField = new JTextField();
        nomField.setBounds(100, 20, 150, 20);
        add(nomField);

        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 150, 20);
        add(passwordField);

        validerButton = new JButton("Valider");
        validerButton.setBounds(50, 80, 100, 30);
        add(validerButton);

        quitterButton = new JButton("Quitter");
        quitterButton.setBounds(160, 80, 100, 30);
        add(quitterButton);

        messageLabel = new JLabel();
        messageLabel.setBounds(10, 120, 280, 20);
        add(messageLabel);
    }

    public void addValiderListener(ActionListener listener) {
        validerButton.addActionListener(listener);
    }

    public void addQuitterListener(ActionListener listener) {
        quitterButton.addActionListener(listener);
    }

    public String getNom() {
        return nomField.getText();
    }

    public String getMotDePasse() {
        return new String(passwordField.getPassword());
    }

    public void showMessage(String message) {
        messageLabel.setText(message);
    }

    public void fermerFenetre() {
        dispose();
    }
}
