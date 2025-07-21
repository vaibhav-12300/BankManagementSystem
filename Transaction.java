package bankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transaction extends JFrame implements ActionListener{
	
	JButton deposite,withdraw,ministatement,pinchange,fastcash,balanceenqury,exit;
	String pinnumber;
	
	public Transaction(String pinnumber) {
		this.pinnumber = pinnumber;
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(235,300,700,35);
		add(image);
		
		JLabel text = new JLabel("Please select your Transaction");
		text.setBounds(215,300,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		deposite = new JButton("Deposite");
		deposite.setBounds(170,415,150,30);
		deposite.addActionListener(this);
		image.add(deposite);
		
		withdraw = new JButton("Cash Withdraw");
		withdraw.setBounds(355,415,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		fastcash = new JButton("Fast cash");
		fastcash.setBounds(355,450,150,30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement = new JButton("Mini Statement");
		ministatement.setBounds(355,450,150,30);
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange = new JButton("Pin Change");
		pinchange.setBounds(170,450,150,30);
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balanceenqury = new JButton("Balanace enquiry");
		balanceenqury.setBounds(355,485,150,30);
		balanceenqury.addActionListener(this);
		image.add(balanceenqury);
		
		exit = new JButton("Exit");
		exit.setBounds(355,520,150,30);
		exit.addActionListener(this);
		image.add(exit);

		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == exit) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Transaction("");
	}
}
