import java.awt.*;
import javax.swing.*;

public class AVLRooms extends JFrame {

    Color c;

    AVLRooms(String s) {
        super(s);
        c = new Color(227, 223, 208); 
        this.getContentPane().setBackground(c);

        setTitle("Room Matrix");
        setSize(1000, 900);
        setLayout(new BorderLayout());

        JLabel availableRoomsLabel = new JLabel("Available Rooms ", JLabel.CENTER);
        availableRoomsLabel.setFont(new Font("Arial", Font.BOLD, 50)); 
        availableRoomsLabel.setForeground(Color.GRAY);
        add(availableRoomsLabel, BorderLayout.NORTH); 

        JPanel roomsPanel = new JPanel();
        roomsPanel.setLayout(new GridLayout(5, 5, 5, 5)); 
        roomsPanel.setBackground(Color.WHITE);

        for (int i = 0; i < 25; i++) {
            JPanel block = new JPanel();
            block.setPreferredSize(new Dimension(100, 100)); 
            block.setLayout(new BorderLayout()); 

            if (i % 2 == 0) {
                block.setBackground(Color.BLUE); 
            } else {
                block.setBackground(Color.GRAY); 
            }

            JLabel roomNumberLabel = new JLabel(String.format("%03d", 101 + i), JLabel.CENTER);
            roomNumberLabel.setFont(new Font("Arial", Font.PLAIN, 40));
            roomNumberLabel.setForeground(Color.RED);
            block.add(roomNumberLabel, BorderLayout.CENTER); 

            roomsPanel.add(block);
        }

        add(roomsPanel, BorderLayout.CENTER);

        setVisible(true); 
    }

   
}
