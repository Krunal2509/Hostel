

import javax.swing.*;
import java.awt.*;

public class Complain extends JFrame {
    private CustomImagePanel imagePanel;
    private JLabel labelText;

    // Constructor to initialize the frame
    public Complain(String title) {
        super(title);
        initializeComponents();
        configureFrame();
    }

    // Method to initialize components
    private void initializeComponents() {
        // Create the custom image panel with the desired opacity (50%)
        imagePanel = new CustomImagePanel(new ImageIcon("src/Hostel/a.jpg").getImage(), 0.5f);
        imagePanel.setLayout(null);  // Absolute layout to place text label
        
        // Set bounds and styles for the text label
        imagePanel.setBounds(0, 0, 1300, 900);
        labelText = new JLabel("My project");
        labelText.setBounds(500, 300, 400, 200);
        labelText.setFont(new Font("Arial", Font.BOLD, 50));
        labelText.setForeground(Color.WHITE);  // Set text color for visibility
        labelText.setOpaque(true);
        labelText.setBackground(Color.RED);  // Set background color to red

        // Add the text label on top of the image panel
        imagePanel.add(labelText);

        // Add the custom image panel to the frame
        add(imagePanel);
    }

    // Method to configure frame properties
    private void configureFrame() {
        setLayout(null);
        setSize(1300, 900);  // Set preferred size
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the frame on screen
    }

 
}

// Custom JPanel to draw an image with opacity
class CustomImagePanel extends JPanel {
    private Image image;
    private float opacity;

    // Constructor to initialize the image and opacity
    public CustomImagePanel(Image image, float opacity) {
        this.image = image;
        this.opacity = opacity;
        setOpaque(false);  // Ensure the panel itself is transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            Graphics2D g2d = (Graphics2D) g.create();

            // Set the opacity for the image
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));

            // Draw the image with the specified opacity
            g2d.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            g2d.dispose();  // Clean up
        }
    }
}
