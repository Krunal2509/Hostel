package Hostel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Register implements ActionListener,ItemListener
{
	JTextField na,ph,em,add,coll;
	Label n,p,e,a,c,t,pl,amt,amt2;
	JButton register,cancel;
	JRadioButton in,sh;
	ButtonGroup g=new ButtonGroup();
	Color color=new Color(227, 223, 208);
	String s="50000";
	JComboBox jcPlan;
	JPanel right;
	Font f;
	int flag=1;
	
	
	Register(JPanel right)
	{
		this.right=right;
		f=new Font("Arial",Font.BOLD,30);
		na=new JTextField("",5);
		ph=new JTextField("",5);
		em=new JTextField("",5);
		add=new JTextField("",5);
		coll=new JTextField("",5);
		
		n=new Label("Name        : ");
		p=new Label("Phone       : ");
		e=new Label("E-mail        : ");
		a=new Label("Address    : ");
		c=new Label("College     : ");
		t=new Label("Type          : ");
		pl=new Label("Plan           : ");
		amt=new Label("Amount     : ");
		amt2=new Label(s);
		
		in=new JRadioButton("Individual",false);
		sh=new JRadioButton("Sharing",true);
		
			
		jcPlan = new JComboBox();
		
		jcPlan.addItem("6-Month");
		jcPlan.addItem("1-Year");
		jcPlan.addItem("2-Year");
		jcPlan.addItem("3-Year");
		jcPlan.addItem("4-Year");
		
		register=new JButton("Register");
		cancel=new JButton("Cancel");
		
		jcPlan.addItemListener(this);
		
		
		register.addActionListener(this);
		cancel.addActionListener(this);
		
		n.setFont(f);
		p.setFont(f);
		e.setFont(f);
		c.setFont(f);
		a.setFont(f);
		t.setFont(f);
		pl.setFont(f);
		amt.setFont(f);
		amt2.setFont(f);
		
		f=new Font("Arial",Font.BOLD,20);
		in.setFont(f);
		sh.setFont(f);
		na.setFont(f);
		ph.setFont(f);
		em.setFont(f);
		add.setFont(f);
		coll.setFont(f);

		
		jcPlan.setFont(f);
		register.setFont(f);
		cancel.setFont(f);
		
		
		
		na.setBounds(550,150,300,40);
		n.setBounds(350,150,170,40);
		ph.setBounds(550,220,300,40);
		p.setBounds(350,220,170,40);
		em.setBounds(550,290,300,40);
		e.setBounds(350,290,170,40);
		add.setBounds(550,360,300,40);
		a.setBounds(350,360,170,40);
		coll.setBounds(550,430,300,40);
		c.setBounds(350,430,170,40);
		t.setBounds(350,500,170,40);
		
		in.setBounds(550,500,150,40);
		sh.setBounds(750,500,150,40);
		
		jcPlan.setBounds(550,560,150,30);
		pl.setBounds(350,550,170,40);
		
		amt.setBounds(350,600,170,40);
		amt2.setBounds(550,600,170,40);
		
		
		register.setBounds(550,700,150,40);
		cancel.setBounds(750,700,150,40);
		
		
		na.setBackground(Color.WHITE);
		ph.setBackground(Color.WHITE);
		em.setBackground(Color.WHITE);
		add.setBackground(Color.WHITE);
		coll.setBackground(Color.WHITE);
		
		in.setBackground(color);
		sh.setBackground(color);
		
		color=new Color(255, 104, 102);
		n.setForeground(color);
		p.setForeground(color);
		e.setForeground(color);
		a.setForeground(color);
		c.setForeground(color);
		t.setForeground(color);
		pl.setForeground(color);
		amt.setForeground(color);
		
		color =new Color(104, 104, 224);
		amt2.setForeground(color);
		
		color=new Color(143, 184, 148);
		register.setBackground(color);
		color=new Color(244, 91, 76);
		cancel.setBackground(color);
		
		in.setFocusPainted(false);
		sh.setFocusPainted(false);
		register.setBorderPainted(false);
		register.setFocusPainted(false);
		cancel.setFocusPainted(false);
		cancel.setBorderPainted(false);
		
		right.add(na);
		right.add(n);
		right.add(ph);
		right.add(p);
		right.add(em);
		right.add(e);
		right.add(add);
		right.add(a);
		right.add(coll);
		right.add(c);
		right.add(t);
		right.add(pl);
		right.add(amt);
		right.add(amt2);
		
		g.add(in);
		g.add(sh);
		right.add(in);
		right.add(sh);
		
		right.add(register);
		right.add(cancel);
		right.add(jcPlan);
		
		in.addActionListener(this);
		sh.addActionListener(this);
		register.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Register"))
		{
			String name = na.getText();
			String phno = ph.getText();
			String mail = em.getText();
			String addr = add.getText();
			String col = coll.getText();
			String type="";
			if(in.isSelected())
			{
				type = "INDIVIDUAL";
			}
			else
			{
				type="SHARING";
			}
			
			String plan = jcPlan.getSelectedItem().toString();
			int amount = Integer.parseInt(amt2.getText());
			
			System.out.print(name+","+phno+","+mail+","+addr+","+col+","+type+","+plan+","+amount);
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.print("\n DRIVER CONNECTED... ");
				Connection con = DriverManager.getConnection
						("localhost:3306/hostel","root","");
				Statement st = con.createStatement();
				
				st.executeUpdate("insert into student values('"+name+"','"+phno+"','"+mail+"','"+addr+"','"+col+"','"+type+"','"+plan+"',"+amount+")");
				
				st.close();
				con.close();
				System.out.print("\n RECORD INSTERTED.... ");
				
				
			}
			catch(Exception eee)
			{
				System.out.print("\n DATABASE ERROR : "+eee.getMessage());
			}
			
			
		}
		else if(e.getActionCommand().equals("Cancel"))
		{
			right.removeAll();
			right.repaint();
			Register r=new Register(right);
		}
		else if(e.getActionCommand().equals("Individual"))
		{
			flag=2;
		}
		else if(e.getActionCommand().equals("Sharing"))
		{
			flag=1;
		}
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
				reset();
	}
	
	public void reset()
	{
		 if(flag==1)
		{
			if((jcPlan.getSelectedItem()).equals("6-Month")) s="50000";
			else if((jcPlan.getSelectedItem()).equals("1-Year")) s="100000";
			else if(jcPlan.getSelectedItem().equals("2-Year")) s="180000";
			else if(jcPlan.getSelectedItem().equals("3-Year")) s="260000";
			else if(jcPlan.getSelectedItem().equals("4-Year")) s="350000";
		}
		else if(flag==2)
		{
			if((jcPlan.getSelectedItem()).equals("6-Month")) s="75000";
			else if((jcPlan.getSelectedItem()).equals("1-Year")) s="140000";
			else if(jcPlan.getSelectedItem().equals("2-Year")) s="250000";
			else if(jcPlan.getSelectedItem().equals("3-Year")) s="400000";
			else if(jcPlan.getSelectedItem().equals("4-Year")) s="550000";
		}
		
		amt2.setText(s);
	}
	
}
