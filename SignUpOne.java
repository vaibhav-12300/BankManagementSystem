package bankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class SignUpOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField,fnameTextField,dobTextField,emailTextField,cityTextField,pinTextField,stateTextField,adrssTextField;
	JButton next;
	JRadioButton male,female,other,married,unmarried;
	JDateChooser datechoser;
	
	SignUpOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formno = new JLabel("Application form no "+random);
		formno.setFont(new Font("Raleway",Font.BOLD,38)); 
		formno.setBounds(200,20,600,50);
		add(formno); 
		
		JLabel personalDetails = new JLabel("Page 1 : Personal Details ");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22)); 
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name = new JLabel("Name ");
		name.setFont(new Font("Raleway",Font.BOLD,20)); 
		name.setBounds(100,140,100,30);
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD,20));
		nameTextField.setBounds(300,140,400,30);
		add(nameTextField);
		
		JLabel fname = new JLabel("Father Name ");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD,20));
		fnameTextField.setBounds(300,190,400,30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("DOB ");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,100,30);
		add(dob);
		
		datechoser = new JDateChooser();
		datechoser.setBounds(300,240,400,30);
		add(datechoser);
		
		JLabel gender = new JLabel("Gender ");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,100,30);
		add(gender);
		
		male = new JRadioButton("Male");
		male.setBackground(Color.white);
		male.setBounds(300,290,60,30);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450,290,100,30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		
		JLabel email = new JLabel("Email Adress ");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD,20));
		emailTextField.setBounds(300,340,400,30);
		add(emailTextField);
		
		JLabel marital = new JLabel("Marital Status ");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		married = new JRadioButton("Married");
		married.setBackground(Color.white);
		married.setBounds(300,390,100,30);
		add(married);
		
		unmarried = new JRadioButton("UnMarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		other = new JRadioButton("Other");
		other.setBounds(630,390,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		JLabel adress = new JLabel("Address ");
		adress.setFont(new Font("Raleway",Font.BOLD,20));
		adress.setBounds(100,440,200,30);
		add(adress);
		
		adrssTextField = new JTextField();
		adrssTextField.setFont(new Font("Raleway", Font.BOLD,20));
		adrssTextField.setBounds(300,440,400,30);
		add(adrssTextField);
		
		JLabel city = new JLabel("City ");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD,20));
		cityTextField.setBounds(300,490,400,30);
		add(cityTextField);
		
		JLabel state = new JLabel("State ");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD,20));
		stateTextField.setBounds(300,540,400,30);
		add(stateTextField);
		
		JLabel pinCode = new JLabel("Pin Code ");
		pinCode.setFont(new Font("Raleway",Font.BOLD,20));
		pinCode.setBounds(100,590,200,30);
		add(pinCode);
		
		pinTextField = new JTextField();
		pinTextField.setFont(new Font("Raleway", Font.BOLD,20));
		pinTextField.setBounds(300,590,400,30);
		add(pinTextField);
		
		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String formno = ""+random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField)datechoser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if (male.isSelected()) {
			gender = "Male";
		}else if (female.isSelected()) {
			gender = "Female";
		}
		String email = emailTextField.getText();
		String marital = null;
		if (married.isSelected()) {
			marital = "Married";
		}else if (unmarried.isSelected()) {
			marital = "Unmarried";
		}else if (other.isSelected()) {
			marital = "other";
		}
		String adress = adrssTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String pin = pinTextField.getText();
		
		try {
			if (name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+adress+"','"+city+"','"+pin+"','"+state+"')";
				c.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null, "Submitted Successfully");
				
				setVisible(false);
				new SignUpTwo(formno).setVisible(true);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new SignUpOne();
	}

}
