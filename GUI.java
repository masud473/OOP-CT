import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {
    static JButton button1 = new JButton("Submit");

    static JButton button2 = new JButton("Cancel");
    static JPasswordField pass = new JPasswordField();
    JTextField text = new JTextField();

    GUI() {
        JFrame frame = new JFrame("Something");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(Color.lightGray);// get the content pane and then set bg
        ImageIcon icon = new ImageIcon("image.png");
        frame.setIconImage(icon.getImage());

        JLabel label = new JLabel();// fix
        label.setLayout(null);
        label.setForeground(Color.blue);
        label.setBounds(10, 10, 220, 130);
        label.setHorizontalAlignment(JLabel.CENTER);// text position is still controled by alignment

        label.setVerticalAlignment(JLabel.TOP);// it is at vertical center by default
        label.setBackground(Color.white);
        label.setOpaque(true);// needed to activate the background

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);// sets cursortype

        // textfield

        text.setBackground(Color.white);
        text.setEditable(true);// decides whether I can type here
        text.setBounds(10, 10, 200, 30);
        text.setForeground(Color.blue);
        text.setCursor(cursor);
        label.add(text);

        pass.setBackground(Color.white);
        pass.setForeground(Color.CYAN);
        pass.setBounds(10, 50, 200, 30);
        pass.setEchoChar('*');
        pass.setCursor(cursor);
        label.add(pass);

        button1.setBounds(10, 90, 95, 30);
        button1.addActionListener(this);
        label.add(button1);

        button2.setBounds(115, 90, 95, 30);
        button2.setFocusable(false);
        button2.addActionListener(this);
        label.add(button2);
        button1.setFocusable(false);
        frame.add(label);

        // radio button
        // JRadioButton b1 = new JRadioButton("Male");
        // JRadioButton b2 = new JRadioButton("Female");
        // JRadioButton b3 = new JRadioButton("Other");
        // b1.setBounds(10, 10, 100, 30);
        // b2.setBounds(10, 50, 100, 30);
        // b3.setBounds(10, 90, 100, 30);
        // ButtonGroup b = new ButtonGroup();
        // b.add(b1);
        // b.add(b2);
        // b.add(b3);

        // frame.add(b1);
        // frame.add(b2);
        // frame.add(b3);

        // checkboxes
        // JCheckBox b1 = new JCheckBox("Male");
        // JCheckBox b2 = new JCheckBox("Female");
        // JCheckBox b3 = new JCheckBox("Other");

        // b1.setBounds(10, 10, 100, 30);
        // b2.setBounds(120, 10, 100, 30);
        // b3.setBounds(230, 10, 100, 30);

        // frame.add(b1);
        // frame.add(b2);
        // frame.add(b3);

        // Table
        // String data[][] = { { "Farhan", "2303011" }, { "Shehryar", "2303049" }, {
        // "Hamza", "2303025" } };
        // String column[] = { "NAME", "ROLL" };
        // JTable table = new JTable(data, column);
        // table.setBounds(10, 10, 300, 100);
        // table.setFont(new Font("Callibri",Font.ITALIC,15));
        // frame.add(table);

        // JComboBox
        // String arr[] = { "Choose your option", "C++", "Java", "Python", "C#" };
        // JComboBox box = new JComboBox<>(arr);
        // box.setBounds(10, 10, 200, 30);
        // box.setFocusable(false);
        // box.setFont(new Font("Arial", Font.PLAIN, 16));
        // box.setSelectedIndex(0);

        // frame.add(box);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == button1) {
            JOptionPane.showMessageDialog(null, "Submitted");
            text.setText("");
            pass.setText("");
            // give me a message

        }

    }
}
