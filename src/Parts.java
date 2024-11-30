

import java.awt.Color;
import java.awt.Font;

import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.*;
public class Parts extends JFrame implements ActionListener
{
	JPanel top;
	JLabel l,i1;
	JButton b[]=new JButton[6];
	JTextArea t;
	Font f;
	Color c;
	
	Parts(String s)
	{
		super(s);
		
		setLayout(null);
		c=new Color(122, 122, 122);
		this.getContentPane().setBackground(c);
		
		top=new JPanel();		
		
		Top();
		Bottom();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	void Top()
	{
		c=new Color(216, 232, 255);
		
		top.setBounds(0,0,1600,200);		
		top.setLayout(null);		
		top.setBackground(c);		
		add(top);
		
		
		l=new JLabel("Homiee Hostel");		
		f=new Font("Arial",Font.BOLD,50);
		l.setFont(f);				
		l.setBounds(600,20,400,100);		
		c=new Color(0, 122, 122);
		l.setForeground(c);		
		l.setHorizontalAlignment(JLabel.CENTER);
		Border b1= BorderFactory.createLineBorder(Color.BLACK, 0);
		l.setBorder(b1);
		top.add(l);
		
		
		b[0]=new JButton("Admission");
		b[1]=new JButton("Staff");
		b[2]=new JButton("Admin");
		b[3]=new JButton("About-Us");
		b[4]=new JButton("Complain");
		b[5]=new JButton("AVL-Rooms");
		
		f=new Font("Arial",Font.BOLD,20);
		b1= BorderFactory.createLineBorder(Color.BLUE, 0);
		
		c=new Color(216, 232, 255);
		
		for(int i=0;i<6;i++)
		{
		b[i].setBounds(200*(i+1),150,160,40);
		b[i].setBackground(c);
		b[i].setFont(f);
		b[i].setBorderPainted(false);		
		b[i].setFocusPainted(false);		
		b[i].setContentAreaFilled(false);		
		top.add(b[i]);
		b[i].addActionListener(this);
		}
		
		
	}
	
	void Bottom()
	{
		i1=new JLabel(new ImageIcon("src/HostelImage.png"));
		i1.setBounds(100,300,600,600);
		add(i1);
		
		f=new Font("Arial",Font.BOLD,30);
		t=new JTextArea(" This is our Front-View of Hostel . ");
		t.setEditable(false);
		t.setBounds(900,500,800,100);
		t.setFont(f);
		c=new Color(122, 122, 122);
		t.setBackground(c);
		t.setForeground(Color.WHITE);
		add(t);
		
		f=new Font("Arial",Font.BOLD,25);
		t=new JTextArea(" Address : Homiee hostel at saffron tower, near SevenSeas mall , fatehganj , Vadodara ");
		t.setEditable(false);
		t.setLineWrap(true);
		t.setWrapStyleWord(true);
		t.setBounds(900,650,600,100);
		t.setFont(f);
		c=new Color(122, 122, 122);
		t.setBackground(c);
		t.setForeground(Color.WHITE);
		add(t);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Admission"))
		{
			
			Admission a=new Admission("Admission");
			a.setLocation(200,100);
			a.setSize(1500,900);
			a.setVisible(true);
		}
		else if(e.getActionCommand().equals("Staff"))
		{
			Staff a=new Staff("Staff");
			a.setLocation(200,100);
			a.setSize(1500,900);
			a.setVisible(true);
		}
		else if(e.getActionCommand().equals("Admin"))
		{
			Admin a=new Admin("Admin");
			a.setLocation(200,100);
			a.setSize(1500,900);
			a.setVisible(true);
		}
		else if(e.getActionCommand().equals("About-Us"))
		{
			AboutUs a=new AboutUs("AboutUs");
			a.setLocation(200,100);
			a.setSize(1500,900);
			a.setVisible(true);
		}
		else if(e.getActionCommand().equals("Complain"))
		{
			Complain a=new Complain("Complain");
			a.setLocation(200,100);
			a.setSize(1500,900);
			a.setVisible(true);
		}
		else if(e.getActionCommand().equals("AVL-Rooms"))
		{
			AVLRooms a=new AVLRooms("Available Rooms");
			a.setLocation(200,100);
			a.setSize(1500,900);
			a.setVisible(true);
		}
		
	}
		
	
}
