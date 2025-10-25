import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Capital implements ActionListener {
    JFrame frame = new JFrame("Capital");
    JCheckBox a = new JCheckBox("Bangladesh");
    JCheckBox b = new JCheckBox("India");
    JCheckBox c = new JCheckBox("USA");
    JButton cap = new JButton("Show Capital");
    JButton clr = new JButton("Clear");
    JLabel label = new JLabel("");
    ButtonGroup bp = new ButtonGroup();

    Capital() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null);

        a.setBounds(10, 10, 150, 30);
        b.setBounds(170, 10, 150, 30);
        c.setBounds(330, 10, 150, 30);
        cap.setBounds(10, 50, 150, 30);
        clr.setBounds(170, 50, 100, 30);
        label.setBounds(10, 90, 150, 30);

        bp.add(a);
        bp.add(b);
        bp.add(c);

        cap.addActionListener(this);
        clr.addActionListener(this);

        frame.add(a);
        frame.add(b);
        frame.add(c);
        frame.add(cap);
        frame.add(clr);
        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = "";
        Object o = e.getSource();
        if (o == clr) {
            bp.clearSelection();

        } else if (o == cap) {
            if (a.isSelected()) {
                s += "Dhaka ";
            }
            if (b.isSelected()) {
                s += "Delhi ";
            }
            if (c.isSelected()) {
                s += "Washington ";
            }

        }
        label.setText(s);
    }

    public static void main(String[] args) {
        new Capital();
    }
}
