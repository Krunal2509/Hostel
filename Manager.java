package Hostel;
import javax.swing.*;
import java.awt.*;

public class Manager extends JFrame{
	Color c;
	Manager(String s)
	{
		super(s);
		c=new Color(227, 223, 208);
		this.getContentPane().setBackground(c);
	}
}
