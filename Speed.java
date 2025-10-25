import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Speed implements ActionListener {
    JFrame frame = new JFrame("Speed Controller");
    JLabel label = new JLabel("0");
    JButton p = new JButton("+");
    JButton m = new JButton("-");
    JButton r = new JButton("Reset");

    int count = 0;

    Speed() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);

        label.setBounds(10, 10, 260, 30);
        p.setBounds(10, 50, 80, 30);
        m.setBounds(100, 50, 80, 30);
        r.setBounds(190, 50, 80, 30);

        label.setHorizontalAlignment(JLabel.CENTER);

        p.addActionListener(this);
        m.addActionListener(this);
        r.addActionListener(this);

        frame.add(label);
        frame.add(p);
        frame.add(m);
        frame.add(r);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == p) {
            count++;
        } else if (o == m) {
            count--;
        } else
            count = 0;
        label.setText(String.valueOf(count));
    }
    public static void main(String[] args) {
        new Speed();
    }
}
