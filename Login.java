package bankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("ATM Login");
        setLayout(null);

        // Left Panel (Welcome Back)
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(91, 33, 182));
        leftPanel.setBounds(0, 0, 300, 480);
        leftPanel.setLayout(null);
        add(leftPanel);

        JLabel welcomeLabel = new JLabel("Welcome Back!");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        welcomeLabel.setBounds(40, 120, 220, 30);
        leftPanel.add(welcomeLabel);

        JLabel infoLabel = new JLabel("Enter your personal details");
        infoLabel.setForeground(Color.WHITE);
        infoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        infoLabel.setBounds(40, 160, 220, 20);
        leftPanel.add(infoLabel);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(75, 220, 150, 35);
        signUp.setBackground(Color.WHITE);
        signUp.setForeground(new Color(91, 33, 182));
        signUp.setFont(new Font("SansSerif", Font.BOLD, 14));
        signUp.addActionListener(this);
        leftPanel.add(signUp);

        // Right Panel (Login Form)
        JLabel loginTitle = new JLabel("Sign In");
        loginTitle.setFont(new Font("SansSerif", Font.BOLD, 28));
        loginTitle.setBounds(400, 60, 200, 40);
        add(loginTitle);

        JLabel cardNoLabel = new JLabel("Card Number");
        cardNoLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        cardNoLabel.setBounds(350, 140, 200, 20);
        add(cardNoLabel);

        cardTextField = new JTextField();
        cardTextField.setBounds(350, 165, 300, 30);
        cardTextField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(cardTextField);

        JLabel pinLabel = new JLabel("PIN");
        pinLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        pinLabel.setBounds(350, 215, 200, 20);
        add(pinLabel);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350, 240, 300, 30);
        pinTextField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(350, 300, 300, 35);
        login.setBackground(new Color(91, 33, 182));
        login.setForeground(Color.WHITE);
        login.setFont(new Font("SansSerif", Font.BOLD, 14));
        login.addActionListener(this);
        add(login);

        getContentPane().setBackground(Color.WHITE);
        setSize(700, 480);
        setLocation(350, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "SELECT * FROM login WHERE cardnumber = '" + cardnumber + "' AND pinnumber = '" + pinnumber + "'";
            try {
				ResultSet rs = conn.s.executeQuery(query);
				if (rs.next()) {
					setVisible(false);
					new Transaction(pinnumber).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid card no or pin");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
        } else if (ae.getSource() == signUp) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
