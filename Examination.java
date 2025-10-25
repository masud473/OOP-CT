import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Examination implements ActionListener {
    JFrame frame = new JFrame("Examination");
    JTextField t = new JTextField();
    JButton b = new JButton("OK");
    JLabel l = new JLabel();

    Examination() {
        frame.setLayout(new GridLayout(3, 1, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // set sizes of elements
        t.setPreferredSize(new Dimension(100, 30));
        b.setPreferredSize(new Dimension(100, 30));
        l.setPreferredSize(new Dimension(100, 30));
        
        

        b.addActionListener(this);

        frame.add(t);
        frame.add(b);
        frame.add(l);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            // TODO Auto-generated method stub
            l.setText(t.getText());
        }
    }

    public static void main(String[] args) {
        new Examination();
    }
}
