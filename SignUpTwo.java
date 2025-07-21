package bankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;


public class SignUpTwo extends JFrame implements ActionListener{
	
	JTextField pan,adhar;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
	JDateChooser datechoser;
	JComboBox religion,catogary,income,education,occupation;
	String formno;
	
	SignUpTwo(String formno){
		this.formno = formno;
		setLayout(null);
		
		JLabel personalDetails = new JLabel("Page 2 :");
		personalDetails.setFont(new Font("Raleway",Font.BOLD,22)); 
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name = new JLabel("Religion ");
		name.setFont(new Font("Raleway",Font.BOLD,20)); 
		name.setBounds(100,140,100,30);
		add(name);
		
		String valreligion[] = {"Select","Hindu","Muslim","Sikh","Critchen","Other"};
		religion = new JComboBox(valreligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel fname = new JLabel("Catogary");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		String valcatogary[] = {"Select","General","OBC","SC","ST","Other"};
		catogary = new JComboBox(valcatogary);
		catogary.setBounds(300,190,400,30);
		catogary.setBackground(Color.WHITE);
		add(catogary);
		
		JLabel dob = new JLabel("Income ");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,100,30);
		add(dob);
		
		String incomecatogary[] = {"Select","Null","< 1.50.000","< 2.50.000","< 5.00.000","Upto 10.00.000"};
		income = new JComboBox(incomecatogary);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel gender = new JLabel("Educational ");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,150,30);
		add(gender);
		
		JLabel email = new JLabel("Qualification ");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,320,200,30);
		add(email);
		
		String educationcatogary[] = {"Select","Non-Graguate","Graduate","Post-Graduate","Diploma","Other"};
		education = new JComboBox(educationcatogary);
		education.setBounds(300,315,400,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel marital = new JLabel("Occupation ");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		String occupationcatogary[] = {"Select","Salried","Self-Employee","Bussiness","Student","Other"};
		occupation = new JComboBox(occupationcatogary);
		occupation.setBounds(300,390,400,30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel adress = new JLabel("Pan no ");
		adress.setFont(new Font("Raleway",Font.BOLD,20));
		adress.setBounds(100,440,200,30);
		add(adress);
		
		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD,20));
		pan.setBounds(300,440,400,30);
		add(pan);
		
		JLabel city = new JLabel("Adhar no ");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,490,200,30);
		add(city);
		
		adhar = new JTextField();
		adhar.setFont(new Font("Raleway", Font.BOLD,20));
		adhar.setBounds(300,490,400,30);
		add(adhar);
		
		JLabel state = new JLabel("Sinior Citizen ");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		syes = new JRadioButton("Yes");
		syes.setBackground(Color.white);
		syes.setBounds(300,540,100,30);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(450,540,100,30);
		sno.setBackground(Color.white);
		add(sno);
		
		ButtonGroup sinior = new ButtonGroup();
		sinior.add(syes);
		sinior.add(sno);
		
		JLabel pinCode = new JLabel("Existing Account ");
		pinCode.setFont(new Font("Raleway",Font.BOLD,20));
		pinCode.setBounds(100,590,200,30);
		add(pinCode);
		
		eyes = new JRadioButton("Yes");
		eyes.setBackground(Color.white);
		eyes.setBounds(300,590,100,30);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.white);
		add(eno);
		
		ButtonGroup existinggroup = new ButtonGroup();
		existinggroup.add(eyes);
		existinggroup.add(eno);
		
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
	
	/**
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		String sreligion = (String) religion.getSelectedItem();
		String scatogary = (String) catogary.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seduaction = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String siniorcitizen = null;
		if (syes.isSelected()) {
			siniorcitizen = "Yes";
		}else if (sno.isSelected()) {
			siniorcitizen = "No";
		}
		String existingaccount = null;
		if (syes.isSelected()) {
			existingaccount = "Yes";
		}else if (sno.isSelected()) {
			existingaccount = "No";
		}
		String span = pan.getText();
		String sadhar = adhar.getText();
		
		if (sreligion.equals("Select") || scatogary.equals("Select") || sincome.equals("Select") ||
			    seduaction.equals("Select") || soccupation.equals("Select") ||
			    span.equals("") || sadhar.equals("") ||
			    siniorcitizen == null || existingaccount == null) {

			    JOptionPane.showMessageDialog(null, "All fields are required.");
			    return;
		}
		// Convert to uppercase (for consistency)
		span = span.toUpperCase();
		pan.setText(span);

		// PAN Validation
		if (span.equals("")) {
		    pan.setBorder(new LineBorder(Color.RED, 2));
		    JOptionPane.showMessageDialog(null, "PAN number is required.");
		    return;
		} else if (!span.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
		    pan.setBorder(new LineBorder(Color.RED, 2));
		    JOptionPane.showMessageDialog(null, "Invalid PAN number. Format: ABCDE1234F");
		    return;
		} else {
		    pan.setBorder(new LineBorder(Color.GREEN, 2)); // ✅ Valid PAN
		}

		// Aadhaar Format: 12 digits (e.g., 123412341234)
		if (sadhar.equals("")) {
		    adhar.setBorder(new LineBorder(Color.RED, 2));
		    JOptionPane.showMessageDialog(null, "Aadhaar number is required.");
		    return;
		} else if (!sadhar.matches("\\d{12}")) {
		    adhar.setBorder(new LineBorder(Color.RED, 2));
		    JOptionPane.showMessageDialog(null, "Invalid Aadhaar number. Must be 12 digits.");
		    return;
		} else {
		    adhar.setBorder(new LineBorder(Color.GREEN, 2)); // ✅ Valid Aadhaar
		}

		
		try {
			Conn c = new Conn();
			String query = "insert into signup2 values('"+formno+"','"+sreligion+"','"+sincome+"','"+scatogary+"','"+seduaction+"','"+soccupation+"','"+span+"','"+sadhar+"','"+siniorcitizen+"','"+existingaccount+"')";
			c.s.executeUpdate(query);
			
			JOptionPane.showMessageDialog(null, "Submitted Successfully");
			
			setVisible(false);
			new SignupThree(formno).setVisible(true);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new SignUpTwo("");
	}

}
