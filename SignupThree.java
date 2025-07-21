package bankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	
	SignupThree(String formno){
		this.formno = formno;
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3 Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type = new JLabel("Account type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1 = new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBounds(100,180,150,30);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposite Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBounds(350,180,250,30);
		add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBounds(100,220,150,30);
		add(r3);
		
		r4 = new JRadioButton("Reccuring Deposite Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBounds(350,220,250,30);
		add(r4);
		
		ButtonGroup typegroup = new ButtonGroup();
		typegroup.add(r1);
		typegroup.add(r2);
		typegroup.add(r3);
		typegroup.add(r4);
		
		JLabel card = new JLabel("Card No :");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100,300,200,30);
		add(card);
		
		JLabel number = new JLabel("XXXX-XXXX-XXXX-4545");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330,300,300,30);
		add(number);
		
		JLabel carddetail = new JLabel("Your 16 digit card no");
		carddetail.setFont(new Font("Raleway",Font.BOLD,12));
		carddetail.setBounds(100,330,300,20);
		add(carddetail);
		
		JLabel pin = new JLabel("PIN :");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100,370,200,30);
		add(pin);
		
		JLabel pindetail = new JLabel("Your 4 digit pin no");
		pindetail.setFont(new Font("Raleway",Font.BOLD,12));
		pindetail.setBounds(100,400,300,20);
		add(pindetail);
		
		JLabel pnumber = new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pnumber.setBounds(330,370,300,30);
		add(pnumber);
		
		JLabel services = new JLabel("Service Required");
		services.setFont(new Font("Raleway",Font.BOLD,22));
		services.setBounds(330,450,300,30);
		add(services);
		
		c1 = new JCheckBox("ATM Card");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100,500,200,30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350,500,200,30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100,550,200,30);
		add(c3);
		
		c4 = new JCheckBox("Email & Alerts");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350,550,200,30);
		add(c4);
		
		c5 = new JCheckBox("Check Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100,600,200,30);
		add(c5);
		
		c6 = new JCheckBox("Estatement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350,600,200,30);
		add(c6);
		
		c7 = new JCheckBox("I hereby  declares that the above entered details are coreect to the best of my knowledge");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway",Font.BOLD,16));
		c7.setBounds(100,680,600,30);
		add(c7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBounds(420,730,100,30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBounds(250,730,100,30);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {
			String accountType = null;
			if (r1.isSelected()) {
				accountType = "Saving Account";
			}else if (r2.isSelected()) {
				accountType = "Fixed Deposite Account";
			}else if (r3.isSelected()) {
				accountType = "Current Account";
			}else if (r4.isSelected()) {
				accountType = "Reccuring Deposite Account";
			}
			
			Random random = new Random();
			long cardPrefix = 5040936000000000L; // 16-digit starting pattern
			long uniqueSuffix = Math.abs(random.nextLong() % 1000000L); // 6 digits
			String cardnumber = String.valueOf(cardPrefix + uniqueSuffix); // Always 16 digits

			
			String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			if (c1.isSelected()) {
				facility = "ATM Card";
			}else if (c2.isSelected()) {
				facility = "Internet Banking";
			}else if(c3.isSelected()) {
				facility = "Email & Alerts";
			}else if (c4.isSelected()) {
				facility = "Cheque Book";
			}else if (c5.isSelected()) {
				facility = "E-statment";
			}
			
			try {
				if (accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account type is required");
				}else {
					Conn conn = new Conn();
					String query1 = "Insert into signupThree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2 = "Insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					JOptionPane.showMessageDialog(null, "Card number "+cardnumber +"\nPin no "+pinnumber);
					
					setVisible(false);
					new SignupThree(formno).setVisible(true);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if (ae.getSource() == cancel) {
			
		}
	}
	
	public static void main(String[] args) {
		new SignupThree("");
	}
}
