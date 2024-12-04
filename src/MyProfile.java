
import javax.swing.*;
import java.awt.*;

public class MyProfile {
	
	JPanel top,bottom,right;
	
	
	Color c;
	MyProfile(JPanel right)
	{
		this.right=right;
		top=new JPanel();
		bottom=new JPanel();
		
		top.setBounds(0,0,1300,300);
		bottom.setBounds(0,305,1300,600);
		
		c=new Color(120, 209, 120);
		top.setBackground(c);
		c=new Color(169, 241, 169);
		bottom.setBackground(c);
		
		right.add(top);
		right.add(bottom);
		
		topPortion();
		bottomPortion();
		
	}
	
	void topPortion()
	{
		JLabel na=new JLabel("YOUR NAME");
		na.setBounds(200,100,300,100);
		na.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,35));
		na.setBackground(new Color(120, 209, 120));
		top.add(na);
		
		JLabel l=new JLabel(new ImageIcon("src/assets/User.png"));
		l.setBounds(1000,50,200,200);
		top.add(l);
		
		
	}
	

	
	void bottomPortion()
	{
		Font f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
		Color c=new Color(169, 241, 169);
		
		JLabel na=new JLabel("=>   YOUR NAME    : vialnva");
		na.setBounds(50,30,500,50);
		na.setFont(f);
		na.setBackground(c);
		
		JLabel ph=new JLabel("=>   YOUR PHONE  : 5169416");
		ph.setBounds(50,100,500,50);
		ph.setFont(f);
		ph.setBackground(c);
		
		JLabel t=new JLabel("=>   ROOM TYPE   : sharing");
		t.setBounds(50,170,500,50);
		t.setFont(f);
		t.setBackground(c);
		
		
		JLabel a=new JLabel("=>   ADDRESS       : voeranvnlanvfvanlfvea");
		a.setBounds(50,250,500,50);
		a.setFont(f);
		a.setBackground(c);
		
		
		JLabel e=new JLabel("=>   E-MAIL           : kjsavnfan@gmail.com");
		e.setBounds(50,320,500,50);
		e.setFont(f);
		e.setBackground(c);
		
		
		
		
		bottom.add(na);
		bottom.add(ph);
		bottom.add(t);
		bottom.add(a);
		bottom.add(e);
		
		
	}
	

}

	
	
	