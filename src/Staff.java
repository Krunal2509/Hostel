import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class Staff extends JFrame {
    Color c;

    Staff(String s) {
        super(s);
        c = new Color(227, 223, 208);
        this.getContentPane().setBackground(c);
        this.setSize(400, 600);
        this.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String imagePath = "src/User.png"; 

        // Image and Text Area 1
        JPanel rowPanel1 = new JPanel(new BorderLayout());
        rowPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel imageLabel1 = new JLabel(new ImageIcon(imagePath));
        imageLabel1.setPreferredSize(new Dimension(100, 100));
        imageLabel1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel1.add(imageLabel1, BorderLayout.WEST);

        JTextPane textPane1 = new JTextPane();
        textPane1.setEditable(false);
        textPane1.setBackground(null);
        textPane1.setBorder(null);

        StyledDocument doc1 = textPane1.getStyledDocument();
        Style defaultStyle = StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);

        Style nameStyle1 = textPane1.addStyle("nameStyle", defaultStyle);
        StyleConstants.setFontSize(nameStyle1, 25);
        StyleConstants.setBold(nameStyle1, true);

        Style designationStyle1 = textPane1.addStyle("designationStyle", defaultStyle);
        StyleConstants.setFontSize(designationStyle1, 17);

        try {
            doc1.insertString(doc1.getLength(), "\tJohn Doe\n", nameStyle1);  
            doc1.insertString(doc1.getLength(), "\tSoftware Engineer", designationStyle1); 
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        rowPanel1.add(new JScrollPane(textPane1), BorderLayout.CENTER);
        mainPanel.add(rowPanel1);

        // Image and Text Area 2
        JPanel rowPanel2 = new JPanel(new BorderLayout());
        rowPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel imageLabel2 = new JLabel(new ImageIcon(imagePath));
        imageLabel2.setPreferredSize(new Dimension(100, 100));
        imageLabel2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel2.add(imageLabel2, BorderLayout.WEST);

        JTextPane textPane2 = new JTextPane();
        textPane2.setEditable(false);
        textPane2.setBackground(null);
        textPane2.setBorder(null);

        StyledDocument doc2 = textPane2.getStyledDocument();
        Style nameStyle2 = textPane2.addStyle("nameStyle", defaultStyle);
        StyleConstants.setFontSize(nameStyle2, 25);
        StyleConstants.setBold(nameStyle2, true);

        Style designationStyle2 = textPane2.addStyle("designationStyle", defaultStyle);
        StyleConstants.setFontSize(designationStyle2, 17);

        try {
            doc2.insertString(doc2.getLength(), "\tJane Smith\n", nameStyle2);  
            doc2.insertString(doc2.getLength(), "\tData Analyst", designationStyle2);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        rowPanel2.add(new JScrollPane(textPane2), BorderLayout.CENTER);
        mainPanel.add(rowPanel2);

        // Image and Text Area 3
        JPanel rowPanel3 = new JPanel(new BorderLayout());
        rowPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel imageLabel3 = new JLabel(new ImageIcon(imagePath));
        imageLabel3.setPreferredSize(new Dimension(100, 100));
        imageLabel3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel3.add(imageLabel3, BorderLayout.WEST);

        JTextPane textPane3 = new JTextPane();
        textPane3.setEditable(false);
        textPane3.setBackground(null);
        textPane3.setBorder(null);

        StyledDocument doc3 = textPane3.getStyledDocument();
        Style nameStyle3 = textPane3.addStyle("nameStyle", defaultStyle);
        StyleConstants.setFontSize(nameStyle3, 25);
        StyleConstants.setBold(nameStyle3, true);

        Style designationStyle3 = textPane3.addStyle("designationStyle", defaultStyle);
        StyleConstants.setFontSize(designationStyle3, 17);

        try {
            doc3.insertString(doc3.getLength(), "\tMichael Brown\n", nameStyle3);  
            doc3.insertString(doc3.getLength(), "\tProject Manager", designationStyle3);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        rowPanel3.add(new JScrollPane(textPane3), BorderLayout.CENTER);
        mainPanel.add(rowPanel3);

        // Image and Text Area 4
        JPanel rowPanel4 = new JPanel(new BorderLayout());
        rowPanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel imageLabel4 = new JLabel(new ImageIcon(imagePath));
        imageLabel4.setPreferredSize(new Dimension(100, 100));
        imageLabel4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel4.add(imageLabel4, BorderLayout.WEST);

        JTextPane textPane4 = new JTextPane();
        textPane4.setEditable(false);
        textPane4.setBackground(null);
        textPane4.setBorder(null);

        StyledDocument doc4 = textPane4.getStyledDocument();
        Style nameStyle4 = textPane4.addStyle("nameStyle", defaultStyle);
        StyleConstants.setFontSize(nameStyle4, 25);
        StyleConstants.setBold(nameStyle4, true);

        Style designationStyle4 = textPane4.addStyle("designationStyle", defaultStyle);
        StyleConstants.setFontSize(designationStyle4, 17);

        try {
            doc4.insertString(doc4.getLength(), "\tSarah White\n", nameStyle4);  
            doc4.insertString(doc4.getLength(), "\tHR Specialist", designationStyle4);
            
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        rowPanel4.add(new JScrollPane(textPane4), BorderLayout.CENTER);
        mainPanel.add(rowPanel4);

        // Image and Text Area 5
        JPanel rowPanel5 = new JPanel(new BorderLayout());
        rowPanel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel imageLabel5 = new JLabel(new ImageIcon(imagePath));
        imageLabel5.setPreferredSize(new Dimension(100, 100));
        imageLabel5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel5.add(imageLabel5, BorderLayout.WEST);

        JTextPane textPane5 = new JTextPane();
        textPane5.setEditable(false);
        textPane5.setBackground(null);
        textPane5.setBorder(null);

        StyledDocument doc5 = textPane5.getStyledDocument();
        Style nameStyle5 = textPane5.addStyle("nameStyle", defaultStyle);
        StyleConstants.setFontSize(nameStyle5, 25);
        StyleConstants.setBold(nameStyle5, true);

        Style designationStyle5 = textPane5.addStyle("designationStyle", defaultStyle);
        StyleConstants.setFontSize(designationStyle5, 17);

        try {
            doc5.insertString(doc5.getLength(), "\tDavid Green\n", nameStyle5);  
            doc5.insertString(doc5.getLength(), "\tMarketing Director", designationStyle5); 
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        rowPanel5.add(new JScrollPane(textPane5), BorderLayout.CENTER);
        mainPanel.add(rowPanel5);

        // Image and Text Area 6
        JPanel rowPanel6 = new JPanel(new BorderLayout());
        rowPanel6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel imageLabel6 = new JLabel(new ImageIcon(imagePath));
        imageLabel6.setPreferredSize(new Dimension(100, 100));
        imageLabel6.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        rowPanel6.add(imageLabel6, BorderLayout.WEST);

        JTextPane textPane6 = new JTextPane();
        textPane6.setEditable(false);
        textPane6.setBackground(null);
        textPane6.setBorder(null);

        StyledDocument doc6 = textPane6.getStyledDocument();
        Style nameStyle6 = textPane6.addStyle("nameStyle", defaultStyle);
        StyleConstants.setFontSize(nameStyle6, 25);
        StyleConstants.setBold(nameStyle6, true);

        Style designationStyle6 = textPane6.addStyle("designationStyle", defaultStyle);
        StyleConstants.setFontSize(designationStyle6, 17);

        try {
            doc6.insertString(doc6.getLength(), "\tLaura Black\n", nameStyle6); 
            doc6.insertString(doc6.getLength(), "\tUX Designer", designationStyle6); 
            
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

        rowPanel6.add(new JScrollPane(textPane6), BorderLayout.CENTER);
        mainPanel.add(rowPanel6);

        this.add(new JScrollPane(mainPanel), BorderLayout.CENTER);
        this.setVisible(true);
    }

    
}
