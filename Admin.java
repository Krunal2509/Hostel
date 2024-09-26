package Hostel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin extends JFrame implements ActionListener {
    // Global variables for details
    private String studentName = "John Doe";
    private String phone = "1234567890";
    private String mail = "john@example.com";
    private String address = "123 Main St";
    private String college = "XYZ College";
    private String type = "Student";
    private String plan = "Plan A";
    private String amount = "$1000";

    // Labels for displaying the values
    private JLabel studentNameLabel, phoneLabel, mailLabel, addressLabel, collegeLabel, typeLabel, planLabel, amountLabel;

    // Panels
    Color c;
    private JPanel secondPanel;

    public Admin(String s) {
        super(s);
        c = new Color(227, 223, 208);
        this.getContentPane().setBackground(c);

        setLayout(null); 

        // First Panel Setup
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(null); // No layout manager
        firstPanel.setBounds(0, 0, 300, 900); // Set position and size of first panel
        firstPanel.setBackground(c); // Match the color with the main frame

        // Buttons for first panel
        JButton newButton = new JButton("New");
        JButton showButton = new JButton("Show");
        JButton deleteButton = new JButton("Delete");

        // Setting bounds (x, y, width, height) for buttons
        newButton.setBounds(50, 50, 200, 50); // Position within the first panel
        showButton.setBounds(50, 150, 200, 50);
        deleteButton.setBounds(50, 250, 200, 50);

        // Optional: Set background color or font for the buttons
//        newButton.setBackground(Color.BLUE);
//        showButton.setBackground(Color.GREEN);
//        deleteButton.setBackground(Color.RED);
        newButton.setFont(new Font("Arial",Font.BOLD,30));
        showButton.setFont(new Font("Arial",Font.BOLD,30));
        deleteButton.setFont(new Font("Arial",Font.BOLD,30));
        // Add buttons to first panel
        firstPanel.add(newButton);
        firstPanel.add(showButton);
        firstPanel.add(deleteButton);

        // Second Panel Setup
        secondPanel = new JPanel();
        secondPanel.setLayout(null); // No layout manager for dynamic placement
        secondPanel.setBounds(300, 0, 1200, 900); // Set position and size of second panel
        secondPanel.setBackground(Color.WHITE); // Optional: Set background color

        // Add both panels to the frame
        add(firstPanel);
        add(secondPanel);

        // Add action listeners for the buttons
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNewOptions();
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showShowOptions();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDeleteOptions();
            }
        });

        setSize(1500, 900); // Set size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void showNewOptions() {
        secondPanel.removeAll(); // Clear previous buttons and labels

        // Create buttons
        JButton newStudent = new JButton("New Student");
        JButton newStaff = new JButton("New Staff");
        JButton newManager = new JButton("New Manager");

        // Set bounds for buttons
        newStudent.setBounds(50, 50, 200, 50);
        newStaff.setBounds(350, 50, 200, 50);
        newManager.setBounds(650, 50, 200, 50);

        // Add buttons to second panel
        secondPanel.add(newStudent);
        secondPanel.add(newStaff);
        secondPanel.add(newManager);

        newStudent.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent ae)
        	{
        		try
            	{
            		Class.forName("com.mysql.jdbc.Driver");
            		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","");
            		Statement st = con.createStatement();
            		ResultSet rs = st.executeQuery("select * from student");
            		
            		while(rs.next())
            		{
            			String name = rs.getString(1);
            			String mail = rs.getString("mail");
            			int amount = rs.getInt("amount");
            			
            			System.out.print("\n "+name+" , "+mail+" , "+amount);
            			
            		}
            		
            		rs.close();
            		st.close();
            		con.close();
            		
            		
            		
            		
            		
            	}
            	catch(Exception ee)
            	{
            		System.out.print("\n ERROR : "+ee.getMessage());
            	}
            	
        		
        		
        	}
        	
        });

        // Add labels with updated values
        addDetailsLabels(); // Add the labels without clearing the panel

        secondPanel.revalidate();
        secondPanel.repaint();
    }

    private void showShowOptions() {
        secondPanel.removeAll(); // Clear previous content (if necessary)

        JButton showStudents = new JButton("Show Students");
        JButton showStaff = new JButton("Show Staff");
        JButton showManager = new JButton("Show Manager");

        // Set bounds for buttons
        showStudents.setBounds(50, 50, 200, 50);
        showStaff.setBounds(350, 50, 200, 50);
        showManager.setBounds(650, 50, 200, 50);

        // Add buttons to second panel
        secondPanel.add(showStudents);
        secondPanel.add(showStaff);
        secondPanel.add(showManager);

        // Add labels with updated values
        addDetailsLabels();
        
        showStudents.addActionListener(this);

        secondPanel.revalidate();
        secondPanel.repaint();
    }

    private void showDeleteOptions() {
        secondPanel.removeAll();

        JButton deleteStudent = new JButton("Delete Student");
        JButton deleteStaff = new JButton("Delete Staff");
        JButton deleteManager = new JButton("Delete Manager");

        // Set bounds for buttons
        deleteStudent.setBounds(50, 50, 200, 50);
        deleteStaff.setBounds(350, 50, 200, 50);
        deleteManager.setBounds(650, 50, 200, 50);

        // Add buttons to second panel
        secondPanel.add(deleteStudent);
        secondPanel.add(deleteStaff);
        secondPanel.add(deleteManager);

        // Add labels with updated values
        addDetailsLabels();

        secondPanel.revalidate();
        secondPanel.repaint();
    }

    // Method to add labels for the student, staff, or manager details
    private void addDetailsLabels() {
        // Create labels with global variable values
        studentNameLabel = new JLabel("Student Name: " + studentName);
        phoneLabel = new JLabel("Phone: " + phone);
        mailLabel = new JLabel("Mail: " + mail);
        addressLabel = new JLabel("Address: " + address);
        collegeLabel = new JLabel("College: " + college);
        typeLabel = new JLabel("Type: " + type);
        planLabel = new JLabel("Plan: " + plan);
        amountLabel = new JLabel("Amount: " + amount);

        // Set bounds for each label (below the buttons)
        studentNameLabel.setBounds(50, 150, 300, 30);
        phoneLabel.setBounds(50, 200, 300, 30);
        mailLabel.setBounds(50, 250, 300, 30);
        addressLabel.setBounds(50, 300, 300, 30);
        collegeLabel.setBounds(50, 350, 300, 30);
        typeLabel.setBounds(50, 400, 300, 30);
        planLabel.setBounds(50, 450, 300, 30);
        amountLabel.setBounds(50, 500, 300, 30);

        // Add labels to second panel (after adding buttons)
        secondPanel.add(studentNameLabel);
        secondPanel.add(phoneLabel);
        secondPanel.add(mailLabel);
        secondPanel.add(addressLabel);
        secondPanel.add(collegeLabel);
        secondPanel.add(typeLabel);
        secondPanel.add(planLabel);
        secondPanel.add(amountLabel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    	
    	
    	
    	
    }

  
}
