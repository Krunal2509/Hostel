import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin extends JFrame implements ActionListener {
    private String studentName = "John Doe";
    private String phone = "1234567890";
    private String mail = "john@example.com";
    private String address = "123 Main St";
    private String college = "XYZ College";
    private String type = "Student";
    private String plan = "Plan A";
    private String amount = "$1000";

    private JLabel studentNameLabel, phoneLabel, mailLabel, addressLabel, collegeLabel, typeLabel, planLabel, amountLabel;

    Color c;
    private JPanel secondPanel;

    public Admin(String s) {
        super(s);
        c = new Color(227, 223, 208);
        this.getContentPane().setBackground(c);

        setLayout(null);

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(null);
        firstPanel.setBounds(0, 0, 300, 900);
        firstPanel.setBackground(c);

        JButton newButton = new JButton("New");
        JButton showButton = new JButton("Show");
        JButton deleteButton = new JButton("Delete");

        newButton.setBounds(50, 50, 200, 50);
        showButton.setBounds(50, 150, 200, 50);
        deleteButton.setBounds(50, 250, 200, 50);

        newButton.setFont(new Font("Arial", Font.BOLD, 30));
        showButton.setFont(new Font("Arial", Font.BOLD, 30));
        deleteButton.setFont(new Font("Arial", Font.BOLD, 30));

        firstPanel.add(newButton);
        firstPanel.add(showButton);
        firstPanel.add(deleteButton);

        secondPanel = new JPanel();
        secondPanel.setLayout(null);
        secondPanel.setBounds(300, 0, 1200, 900);
        secondPanel.setBackground(Color.WHITE);

        add(firstPanel);
        add(secondPanel);

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

        setSize(1500, 900);
    }

    private void showNewOptions() {
        secondPanel.removeAll();

        JButton newStudent = new JButton("New Student");
        JButton newStaff = new JButton("New Staff");
        JButton newManager = new JButton("New Manager");

        newStudent.setBounds(50, 50, 200, 50);
        newStaff.setBounds(350, 50, 200, 50);
        newManager.setBounds(650, 50, 200, 50);

        secondPanel.add(newStudent);
        secondPanel.add(newStaff);
        secondPanel.add(newManager);

        newStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
//                try {
//                    Class.forName("com.mysql.jdbc.Driver");
//                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "");
//                    Statement st = con.createStatement();
//                    ResultSet rs = st.executeQuery("select * from student");
//
//                    while (rs.next()) {
//                        String name = rs.getString(1);
//                        String mail = rs.getString("mail");
//                        int amount = rs.getInt("amount");
//
//                        System.out.print("\n " + name + " , " + mail + " , " + amount);
//                    }
//
//                    rs.close();
//                    st.close();
//                    con.close();
//
//                } catch (Exception ee) {
//                    System.out.print("\n ERROR : " + ee.getMessage());
//                }
            }
        });

        addDetailsLabels();

        secondPanel.revalidate();
        secondPanel.repaint();
    }

    private void showShowOptions() {
        secondPanel.removeAll();

        JButton showStudents = new JButton("Show Students");
        JButton showStaff = new JButton("Show Staff");
        JButton showManager = new JButton("Show Manager");

        showStudents.setBounds(50, 50, 200, 50);
        showStaff.setBounds(350, 50, 200, 50);
        showManager.setBounds(650, 50, 200, 50);

        secondPanel.add(showStudents);
        secondPanel.add(showStaff);
        secondPanel.add(showManager);

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

        deleteStudent.setBounds(50, 50, 200, 50);
        deleteStaff.setBounds(350, 50, 200, 50);
        deleteManager.setBounds(650, 50, 200, 50);

        secondPanel.add(deleteStudent);
        secondPanel.add(deleteStaff);
        secondPanel.add(deleteManager);

        addDetailsLabels();

        secondPanel.revalidate();
        secondPanel.repaint();
    }

    private void addDetailsLabels() {
        studentNameLabel = new JLabel("Student Name: " + studentName);
        phoneLabel = new JLabel("Phone: " + phone);
        mailLabel = new JLabel("Mail: " + mail);
        addressLabel = new JLabel("Address: " + address);
        collegeLabel = new JLabel("College: " + college);
        typeLabel = new JLabel("Type: " + type);
        planLabel = new JLabel("Plan: " + plan);
        amountLabel = new JLabel("Amount: " + amount);

        studentNameLabel.setBounds(50, 150, 300, 30);
        phoneLabel.setBounds(50, 200, 300, 30);
        mailLabel.setBounds(50, 250, 300, 30);
        addressLabel.setBounds(50, 300, 300, 30);
        collegeLabel.setBounds(50, 350, 300, 30);
        typeLabel.setBounds(50, 400, 300, 30);
        planLabel.setBounds(50, 450, 300, 30);
        amountLabel.setBounds(50, 500, 300, 30);

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
