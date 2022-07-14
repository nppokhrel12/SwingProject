package com.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class EmployeeForm extends JFrame {
	private JPanel contentPane;
	private JTextField fname;
	private JTextField lName;
	private JTextField email;
	private JTextField city;
	private JTextField contact;
	private JTextField age;
	private JTextField company;
	private JTextField department;
	private JTextField post;
	private JTextField salary;
	private JTextField search;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {;
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**+
	 * Create the frame.
	 */
	
	public EmployeeForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1467, 715);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 374, 654);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 25, 68, 14);
		panel.add(lblNewLabel);
		
		fname = new JTextField();
		fname.setBounds(83, 22, 86, 20);
		panel.add(fname);
		fname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(179, 25, 64, 14);
		panel.add(lblNewLabel_1);
		
		lName = new JTextField();
		lName.setBounds(242, 22, 122, 20);
		panel.add(lName);
		lName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Country");
		lblNewLabel_2.setBounds(10, 50, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("State");
		lblNewLabel_2_1.setBounds(179, 50, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(10, 75, 46, 14);
		panel.add(lblNewLabel_3);
		
		JComboBox state = new JComboBox();
		state.setModel(new DefaultComboBoxModel(new String[] {"Select State", "state 1", "state 2", "state 3 ", "state 4", "state 5", "state 6", "state 7"}));
		state.setBounds(242, 50, 122, 17);
		panel.add(state);
		
		JComboBox country = new JComboBox();
		country.setModel(new DefaultComboBoxModel(new String[] {"Select Country", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"}));
		country.setBounds(83, 46, 86, 22);
		panel.add(country);
		
		email = new JTextField();
		email.setBounds(83, 72, 86, 20);
		panel.add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("City");
		lblNewLabel_3_1.setBounds(179, 75, 46, 14);
		panel.add(lblNewLabel_3_1);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(242, 72, 122, 20);
		panel.add(city);
		
		JLabel lblNewLabel_3_2 = new JLabel("Contact no.");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_2.setBounds(10, 100, 57, 14);
		panel.add(lblNewLabel_3_2);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(83, 97, 86, 20);
		panel.add(contact);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("gender");
		lblNewLabel_3_1_1.setBounds(179, 100, 46, 14);
		panel.add(lblNewLabel_3_1_1);
		
		JRadioButton male = new JRadioButton("m");
		male.setBounds(242, 96, 38, 23);
		panel.add(male);
		
		JRadioButton female = new JRadioButton("f");
		female.setBounds(280, 96, 29, 23);
		panel.add(female);
		
		JRadioButton other = new JRadioButton("other");
		other.setFont(new Font("Tahoma", Font.PLAIN, 8));
		other.setBounds(311, 96, 53, 23);
		panel.add(other);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("DOB");
		lblNewLabel_3_2_1.setBounds(10, 125, 29, 14);
		panel.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Age");
		lblNewLabel_3_2_1_1.setBounds(179, 125, 29, 14);
		panel.add(lblNewLabel_3_2_1_1);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(242, 122, 122, 20);
		panel.add(age);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("Company");
		lblNewLabel_3_2_1_2.setBounds(10, 150, 57, 14);
		panel.add(lblNewLabel_3_2_1_2);
		
		company = new JTextField();
		company.setColumns(10);
		company.setBounds(83, 147, 86, 20);
		panel.add(company);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("Service Type");
		lblNewLabel_3_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_3_2_1_2_1.setBounds(179, 150, 64, 14);
		panel.add(lblNewLabel_3_2_1_2_1);
		
		JRadioButton permanent = new JRadioButton("Permanent");
		permanent.setFont(new Font("Tahoma", Font.PLAIN, 8));
		permanent.setBounds(242, 146, 67, 23);
		panel.add(permanent);
		
		JRadioButton contract = new JRadioButton("contract");
		contract.setFont(new Font("Tahoma", Font.PLAIN, 7));
		contract.setBounds(311, 146, 53, 23);
		panel.add(contract);
		
		JLabel lblNewLabel_3_2_1_2_2 = new JLabel("Department");
		lblNewLabel_3_2_1_2_2.setBounds(10, 175, 57, 14);
		panel.add(lblNewLabel_3_2_1_2_2);
		
		department = new JTextField();
		department.setColumns(10);
		department.setBounds(83, 172, 86, 20);
		panel.add(department);
		
		JLabel lblNewLabel_3_2_1_2_2_1 = new JLabel("post");
		lblNewLabel_3_2_1_2_2_1.setBounds(179, 175, 57, 14);
		panel.add(lblNewLabel_3_2_1_2_2_1);
		
		post = new JTextField();
		post.setColumns(10);
		post.setBounds(242, 172, 122, 20);
		panel.add(post);
		
		JLabel lblNewLabel_3_2_1_2_2_2 = new JLabel("Join Date");
		lblNewLabel_3_2_1_2_2_2.setBounds(10, 200, 57, 14);
		panel.add(lblNewLabel_3_2_1_2_2_2);
		
		JLabel lblNewLabel_3_2_1_2_2_2_1 = new JLabel("Salary");
		lblNewLabel_3_2_1_2_2_2_1.setBounds(179, 200, 57, 14);
		panel.add(lblNewLabel_3_2_1_2_2_2_1);
		
		salary = new JTextField();
		salary.setColumns(10);
		salary.setBounds(242, 197, 122, 20);
		panel.add(salary);
		
		JDateChooser joindate = new JDateChooser();
		joindate.setBounds(83, 197, 86, 20);
		panel.add(joindate);
		
		search = new JTextField();
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String searchData=search.getText().trim();
				EmployeeService es=new EmployeeServiceImpl();
				List<Employee> emplist= es.search(searchData);
				
				DefaultTableModel tmodel =(DefaultTableModel) table.getModel();
				tmodel.setRowCount(0);//re-set table data 
				for(Employee emp: emplist) {
					 tmodel.addRow(new Object[] {emp.getId(),emp.getAge(),emp.getCity(),emp.getCompany()});
				}
			}
		});
		search.setColumns(10);
		search.setBounds(83, 222, 86, 20);
		panel.add(search);
		
		JLabel lblNewLabel_3_2_1_2_2_2_2 = new JLabel("Search");
		lblNewLabel_3_2_1_2_2_2_2.setBounds(10, 225, 57, 14);
		panel.add(lblNewLabel_3_2_1_2_2_2_2);
		
		JDateChooser dob = new JDateChooser();
		dob.setBounds(83, 122, 86, 20);
		panel.add(dob);
		
		JLabel lblNewLabel_3_2_1_2_2_2_2_1 = new JLabel("Photo");
		lblNewLabel_3_2_1_2_2_2_2_1.setBounds(242, 329, 48, 14);
		panel.add(lblNewLabel_3_2_1_2_2_2_2_1);
		
		Canvas photo = new Canvas();
		photo.setBackground(Color.LIGHT_GRAY);
		photo.setBounds(242, 219, 122, 100);
		panel.add(photo);
		
		JButton upload = new JButton("upload");
		upload.setBounds(290, 325, 74, 26);
		panel.add(upload);
		
		JButton delete = new JButton("Delete ");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(delete, "select data");
				return ;	
				}
				int selectedRow =table.getSelectedRow();
				int id=(int) table.getModel().getValueAt(selectedRow,0);
				EmployeeService emp=new EmployeeServiceImpl();
				if(emp.deleteEmployee(id)) {
					JOptionPane.showMessageDialog(null, "deleted");
					displayData();
					
				}
				else {
					JOptionPane.showMessageDialog(null, "deleted");
				}
				}
		});
		delete.setBounds(10, 253, 99, 23);
		panel.add(delete);
		
		JButton edit = new JButton("Edit");
		edit.setBounds(119, 253, 89, 23);
		panel.add(edit);
		
		JButton print = new JButton("Print");
		print.setBounds(10, 287, 99, 23);
		panel.add(print);
		
		JButton exit = new JButton("Exit");
		exit.setBounds(119, 287, 89, 23);
		panel.add(exit);
		
		JButton addemployee = new JButton("AddEmployee");
		addemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp=new Employee();
			   emp.setAge(Integer.parseInt(age.getText()));
			   emp.setCity(city.getText());
			   emp.setCompany(company.getText());
			   emp.setContact(contact.getText());
			   emp.setCountry(country.getSelectedItem().toString());
			   emp.setDepartment(department.getText());
			   emp.setDob(new Date(dob.getDate().getTime()));
			   emp.setEmail(email.getText());
			   emp.setFname(fname.getText());
			   
			   if(male.isSelected()) {
			   emp.setGender("male");
			   }
			   else if(female.isSelected()) {
				   emp.setGender("female");
			   }
			   else if(other.isSelected()) {
				   emp.setGender("other");
			   }
			   
			   emp.setImage("image");
			   emp.setJoinDate(new Date(joindate.getDate().getTime()));
			   emp.setLname(lName.getText());
			   emp.setPost(post.getSelectedText());
			   emp.setSalary(Integer.parseInt(salary.getText()));
			   emp.setState(state.getSelectedItem().toString());
			   
			   EmployeeService es=new EmployeeServiceImpl();
			   Boolean res=  es.addEmployee(emp);
			   if(res) {
				   JOptionPane.showConfirmDialog(addemployee, "added");
				   displayData();
			   }
			   else {
				   JOptionPane.showConfirmDialog(addemployee, "added failed");
				   
			   }
			   
			   
			   
			   
			}
		});
		addemployee.setFont(new Font("Tahoma", Font.PLAIN, 8));
		addemployee.setBounds(10, 321, 99, 30);
		panel.add(addemployee);
		
		JButton clear = new JButton("ClearForm");
		clear.setFont(new Font("Tahoma", Font.PLAIN, 8));
		clear.setBounds(119, 321, 89, 30);
		panel.add(clear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(394, 11, 1047, 654);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Name", "City", "Post", "Phone no."
			}
		));
		scrollPane.setViewportView(table);
		
		displayData();
	}
	private void displayData() {
		EmployeeService es=new EmployeeServiceImpl();
		List<Employee> empList=es.getAllEmployees();
		DefaultTableModel tmodel =(DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);//re-set table data 
		for(Employee emp: empList) {
			 tmodel.addRow(new Object[] {emp.getId(),emp.getAge(),emp.getCity(),emp.getCompany()});
		}
	}
}
