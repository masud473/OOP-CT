import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fare implements ActionListener {
    JFrame frame = new JFrame("Fare Calculator");
    JLabel source = new JLabel("Source");
    JLabel dest = new JLabel("Destination");
    JCheckBox AC = new JCheckBox("AC");
    JTextField fare = new JTextField("Fare: 0");
    String arr[] = { "Rajshahi", "Iswardi", "Ullapara", "Tangail", "Dhaka" };
    int val[] = { 0, 50, 100, 150, 230 };
    JComboBox src = new JComboBox<>(arr);
    JComboBox dst = new JComboBox<>(arr);

    Fare() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 400);

        source.setBounds(10, 10, 100, 30);
        dest.setBounds(120, 10, 100, 30);
        src.setBounds(10, 50, 100, 30);
        dst.setBounds(120, 50, 100, 30);
        AC.setBounds(10, 90, 100, 30);
        fare.setBounds(120, 90, 100, 30);

        AC.addActionListener(this);
        src.addActionListener(this);
        dst.addActionListener(this);
        fare.setEditable(false);

        frame.add(source);
        frame.add(dest);
        frame.add(src);
        frame.add(dst);
        frame.add(AC);
        frame.add(fare);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Fare();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cost = 0;
        int a = src.getSelectedIndex();
        int b = dst.getSelectedIndex();
        cost = val[a] - val[b];
        if (AC.isSelected()) {
            cost *= 1.5;
        }
        cost *= 3;
        if (cost < 0) {
            cost = -cost;
        }
        fare.setText("Fare: " + cost);
    }
}
