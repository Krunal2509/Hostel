package Hostel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Admission extends JFrame implements ActionListener
{
	Color c;
	JButton b[]=new JButton[3];
	Label l;
	JPanel left,right;
	Font f;
	
	Admission(String s)
	{
		super(s);
		c=new Color(227, 223, 208);
		this.getContentPane().setBackground(c);
		setLayout(null);
		admission();
	}
	
	void admission()
	{
		b[0]=new JButton("Register");
		b[1]=new JButton("My Profile");
		b[2]=new JButton("Fees");
		
		left=new JPanel();
		right=new JPanel();
		
		left.setLayout(null);
		right.setLayout(null);
		
		left.setBounds(0,0,200,900);
		right.setBounds(200,0,1300,900);
		
		right.setBackground(c);
		
		c=new Color(255, 255, 211);
		left.setBackground(c);
		add(left);
		add(right);
		
		f=new Font("Arial",Font.BOLD,20);
		for(int i=0;i<b.length;i++)
		{
			b[i].setBounds(30,150*(i+1),140,50);
			b[i].setBorderPainted(false);
			b[i].setFocusPainted(false);
			b[i].setBackground(c);
			b[i].setFont(f);
			left.add(b[i]);
			b[i].addActionListener(this);
		}
		
		Register r=new Register(right);		

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Register"))
		{
			right.removeAll();
			right.repaint();
			Register r=new Register(right);		
			
		}
		else if(e.getActionCommand().equals("My Profile"))
		{
			right.removeAll();
			right.repaint();
			MyProfile p=new MyProfile(right);
			
		}
	}
	
}
