import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AVLRooms extends JFrame {

    private final Color availableColor = new Color(34, 139, 34); // Green for available
    private final Color occupiedColor = new Color(220, 20, 60); // Red for occupied
    private final Color hoverColor = new Color(135, 206, 250); // Light Blue for hover effect

    AVLRooms(String title) {
        super(title);
        getContentPane().setBackground(new Color(227, 223, 208));

        setTitle("Room Matrix");
        setSize(1000, 900);
        setLayout(new BorderLayout());

        JLabel availableRoomsLabel = new JLabel("Room Availability", JLabel.CENTER);
        availableRoomsLabel.setFont(new Font("Arial", Font.BOLD, 50));
        availableRoomsLabel.setForeground(Color.DARK_GRAY);
        add(availableRoomsLabel, BorderLayout.NORTH);

        JPanel roomsPanel = new JPanel();
        roomsPanel.setLayout(new GridLayout(5, 5, 10, 10));
        roomsPanel.setBackground(Color.WHITE);

        for (int i = 0; i < 25; i++) {
            JPanel block = createRoomBlock(101 + i);
            roomsPanel.add(block);
        }

        add(roomsPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createRoomBlock(int roomNumber) {
        JPanel block = new JPanel();
        block.setPreferredSize(new Dimension(150, 150));
        block.setLayout(new BorderLayout());
        block.setBackground(Math.random() < 0.5 ? availableColor : occupiedColor);

        JLabel roomNumberLabel = new JLabel(String.format("Room %03d", roomNumber), JLabel.CENTER);
        roomNumberLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        roomNumberLabel.setForeground(Color.WHITE);
        block.add(roomNumberLabel, BorderLayout.CENTER);

        block.setToolTipText(block.getBackground() == availableColor ? "Available" : "Occupied");

        block.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                block.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                block.setBackground(block.getToolTipText().equals("Available") ? availableColor : occupiedColor);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                String status = block.getToolTipText().equals("Available") ? "Occupied" : "Available";
                block.setToolTipText(status);
                block.setBackground(status.equals("Available") ? availableColor : occupiedColor);
            }
        });

        return block;
    }

   
}
