import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Complain extends JFrame {

    public Complain(String title) {
        super(title);

        setTitle("Feedback and Complaint Form");
        setSize(1000, 900); 
        setLayout(new BorderLayout()); 

        JPanel feedbackPanel = new JPanel();
        feedbackPanel.setLayout(new BorderLayout()); 
        feedbackPanel.setBackground(Color.GREEN);

        JLabel feedbackLabel = new JLabel("Feedback", JLabel.CENTER);
        feedbackLabel.setFont(new Font("Arial", Font.BOLD, 40));
        feedbackPanel.add(feedbackLabel, BorderLayout.NORTH);

        JTextArea feedbackArea = new JTextArea();
        feedbackArea.setPreferredSize(new Dimension(500, 300)); 
        feedbackArea.setFont(new Font("Arial", Font.PLAIN, 25)); 
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);
        feedbackArea.setBackground(Color.GRAY);
        feedbackArea.setForeground(Color.WHITE);
        feedbackPanel.add(new JScrollPane(feedbackArea), BorderLayout.CENTER); 

        JButton feedbackSubmitButton = new JButton("Submit");
        feedbackSubmitButton.setPreferredSize(new Dimension(150, 70)); 
        feedbackSubmitButton.setFont(new Font("Arial", Font.BOLD, 30)); 
        feedbackSubmitButton.setBackground(new Color(116, 157, 114));
        feedbackSubmitButton.setForeground(new Color(218, 206, 137)); 
        feedbackSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedbackArea.setText("");
            }
        });
        JPanel feedbackButtonPanel = new JPanel();
        feedbackButtonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        feedbackButtonPanel.setBackground(Color.LIGHT_GRAY);
        feedbackButtonPanel.add(feedbackSubmitButton);
        feedbackPanel.add(feedbackButtonPanel, BorderLayout.SOUTH); 

        add(feedbackPanel, BorderLayout.NORTH);

        JPanel complaintPanel = new JPanel();
        complaintPanel.setLayout(new BorderLayout()); 
        complaintPanel.setBackground(new Color(215, 163, 163));

        JLabel complaintLabel = new JLabel("Complaint", JLabel.CENTER);
        complaintLabel.setFont(new Font("Arial", Font.BOLD, 40));
        complaintPanel.add(complaintLabel, BorderLayout.NORTH);

        JTextArea complaintArea = new JTextArea();
        complaintArea.setPreferredSize(new Dimension(500, 200)); 
        complaintArea.setFont(new Font("Arial", Font.PLAIN, 25)); 
        complaintArea.setLineWrap(true);
        complaintArea.setWrapStyleWord(true);
        complaintArea.setBackground(Color.GRAY);
        complaintPanel.add(new JScrollPane(complaintArea), BorderLayout.CENTER); 

        JButton complaintSubmitButton = new JButton("Submit");
        complaintSubmitButton.setPreferredSize(new Dimension(150, 70)); 
        complaintSubmitButton.setFont(new Font("Arial", Font.BOLD, 30)); 
        complaintSubmitButton.setBackground(new Color(116, 157, 114));
        complaintSubmitButton.setForeground(new Color(218, 206, 137)); 
        complaintSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                complaintArea.setText("");
            }
        });
        JPanel complaintButtonPanel = new JPanel();
        complaintButtonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        complaintButtonPanel.setBackground(Color.LIGHT_GRAY);
        complaintButtonPanel.add(complaintSubmitButton);
        complaintPanel.add(complaintButtonPanel, BorderLayout.SOUTH); 

        add(complaintPanel, BorderLayout.CENTER);

        setVisible(true); 
    }

   
}
