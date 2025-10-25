import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Convert implements ActionListener {
    JFrame frame = new JFrame("Convert");
    JLabel l1 = new JLabel("Foot");
    JLabel l2 = new JLabel("Inch");
    JTextField foot = new JTextField("0.00");
    JTextField inch = new JTextField("0.00");
    JButton b = new JButton("Convert to inch");

    Convert() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(220, 130));

        l1.setBounds(10, 10, 40, 30);
        foot.setBounds(60, 10, 150, 30);
        b.setBounds(40, 50, 140, 30);
        l2.setBounds(10, 90, 40, 30);
        inch.setBounds(60, 90, 150, 30);

        inch.setEditable(false);
        b.addActionListener(this);
        foot.addActionListener(this);

        panel.add(foot);
        panel.add(l1);
        panel.add(l2);
        panel.add(b);
        panel.add(inch);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            Double d = Double.valueOf(foot.getText());// extremely important conversion
            d *= 12;
            inch.setText(d + "");
            JOptionPane.showMessageDialog(null, "Something");
        }
    }

    public static void main(String[] args) {
        new Convert();
    }
}
