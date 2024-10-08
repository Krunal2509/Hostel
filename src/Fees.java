
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class Fees implements ActionListener
{
	int totalFees=40000,paidFees=0,payableFees=40000;
	String name="YOUR NAME",semester="SEMESTER";
	JLabel totalfees,paidfees,payablefees,image,na,s;
	JButton receipt,pay;
	Font f=new Font("Arial",Font.BOLD,30);
	Color color;
	JPanel top,bottom;
	Fees(JPanel right)
	{
		top=new JPanel();
		bottom=new JPanel();
	
		top.setBounds(0,0,1300,300);
		bottom.setBounds(0,300,1300,600);
		
		Top();
		Bottom();
		
		color=new Color(255, 157, 133);
		top.setBackground(color);
		color =new Color(228, 213, 200);
		bottom.setBackground(color);
		
		
		right.add(top);
		right.add(bottom);
	}
	
	void Top()
	{
		image=new JLabel(new ImageIcon("src/User2.png"));
		image.setBounds(350,50,200,200);
		
		na=new JLabel("Name  : "+name);
		s=new JLabel("Semester  : "+semester);
		
		na.setBounds(600,70,500,50);
		s.setBounds(600,170,500,50);
		
		na.setFont(f);
		s.setFont(f);
		
		top.add(image);
		top.add(na);
		top.add(s);
	}
	
	void Bottom()
	{
		totalfees=new JLabel("Total Fees To Pay           : 		"+totalFees);
		paidfees=new JLabel("Total Fees Paid               :		"+paidFees);
		payablefees=new JLabel("Remaining Fees To Pay : 		"+payableFees);
		
		receipt=new JButton("Receipt");
		pay=new JButton("Pay");
		
		totalfees.setBounds(400,100,600,50);
		paidfees.setBounds(400,200,600,50);
		payablefees.setBounds(400,300,600,50);
		
		receipt.setBounds(450,450,150,50);
		pay.setBounds(650,450,150,50);
		
		color=new Color(227, 223, 208);
		receipt.setBackground(color);
		pay.setBackground(color);
		color=new Color(0, 67, 186);
		receipt.setForeground(color);
		pay.setForeground(color);
		
		receipt.setBorderPainted(false);
		receipt.setFocusPainted(false);
		pay.setBorderPainted(false);
		pay.setFocusPainted(false);
		
		
		totalfees.setFont(f);
		paidfees.setFont(f);
		payablefees.setFont(f);
		receipt.setFont(f);
		pay.setFont(f);
		
		receipt.addActionListener(this);
		pay.addActionListener(this);
		
		bottom.add(totalfees);
		bottom.add(paidfees);
		bottom.add(payablefees);
		bottom.add(receipt);
		bottom.add(pay);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Pay"))
		{
			try {
			Desktop.getDesktop().browse(new URI("https://pay.google.com/about/"));
			}catch(Exception eee) {}
		}
	}
}
