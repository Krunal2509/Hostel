import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Staff extends JFrame {

    public Staff(String title) {
        super(title);

        Color backgroundColor = new Color(227, 223, 208);
        this.getContentPane().setBackground(backgroundColor);

        this.setSize(400, 600);
        this.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        mainPanel.add(createStaffRow("Prasoon Jha", "Founder", "src/p.jpg"));
        mainPanel.add(createStaffRow("Krunal Sojitra", "Manager", "src/k.jpg"));
        mainPanel.add(createStaffRow("Kalp Shah", "CEO", "src/kalp.jpg"));
        mainPanel.add(createStaffRow("Pratham Parikh", "HR Specialist", "src/prat.jpg"));
        mainPanel.add(createStaffRow("Hardik", "Marketing", "src/h.jpg"));
        mainPanel.add(createStaffRow("Afzal Surti", "Relationship Manager", "src/af.jpg"));

        this.add(new JScrollPane(mainPanel), BorderLayout.CENTER);
    }

    private JPanel createStaffRow(String name, String designation, String imagePath) {
        JPanel rowPanel = new JPanel(new BorderLayout());
        rowPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        ImageIcon icon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setPreferredSize(new Dimension(100, 100));
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel.add(imageLabel, BorderLayout.WEST);

        JPanel textPanel = new JPanel(new GridLayout(2, 1));
        textPanel.add(new JLabel(name));
        textPanel.add(new JLabel(designation));
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rowPanel.add(textPanel, BorderLayout.CENTER);

        return rowPanel;
    }
}
