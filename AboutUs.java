package Hostel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AboutUs extends JFrame implements AdjustmentListener{
	Color c;
	JLabel l1;
	JTextArea t1,t2,t3;
	JLabel i1,i2,i3;
	Font f;
	Image new1,new2;
	JScrollBar sb;
	
	
	AboutUs(String s)
	{
		super(s);
		c=new Color(227, 223, 208);
		this.getContentPane().setBackground(c);
		setLayout(null);
		aboutUs();
		
	}
	
	void aboutUs()
	{
		
		
		sb=new JScrollBar(1,0,900,0,2000);
		sb.addAdjustmentListener(this);
		sb.setBounds(0,0,30,850);
		sb.setBackground(Color.WHITE);
		sb.setUI(new javax.swing.plaf.basic.BasicScrollBarUI() {
	            @Override
	            protected void configureScrollBarColors() {
	                this.thumbColor = Color.GRAY; // Thumb color
	            }
	        });
		add(sb);
		
		f=new Font("Arial",Font.BOLD,40);
		l1=new JLabel("Hostel Facilities : ");
		l1.setBounds(575,30,350,100);
		l1.setBackground(c);
		l1.setFont(f);
		add(l1);
		
		ImageIcon I1=new ImageIcon("src/Hostel/room.jpeg");
		ImageIcon I2=new ImageIcon("src/Hostel/dinningarea.png");
		
		Image ii1=I1.getImage();
		Image ii2=I2.getImage();
		
		new1=ii1.getScaledInstance(400,300,Image.SCALE_SMOOTH);
		new2=ii2.getScaledInstance(400,300,Image.SCALE_SMOOTH);
		
		i1=new JLabel(new ImageIcon(new1));
		i2=new JLabel(new ImageIcon(new2));
		
		
		i1.setBounds(50,150,400,300);
		i2.setBounds(1000,500,400,300);
		add(i1);
		add(i2);
		
		t1=new JTextArea("In Our Hostel rooms , We are providing Two Persons are sharing the each room  and they have individual beds , table , cupboards etc . ");
		t1.setEditable(false);
		t1.setBounds(600,300,800,100);
		t1.setLineWrap(true);
		t1.setWrapStyleWord(true);
		f=new Font("Arial",Font.BOLD,25);
		t1.setFont(f);
		t1.setBackground(c);
		c=new Color(139, 194, 139);
		t1.setForeground(c);
		add(t1);
		
		t2=new JTextArea("In Our Dinning - Area , We are providing Tables , Fresh Food , also whole area there is a central A.C  etc . ");
		t2.setEditable(false);
		t2.setBounds(100,600,800,100);
		t2.setLineWrap(true);
		t2.setWrapStyleWord(true);
		t2.setFont(f);
		c=new Color(227, 223, 208);
		t2.setBackground(c);
		c=new Color(139, 194, 139);
		t2.setForeground(c);
		add(t2);
		
		
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		
	}
	
}
