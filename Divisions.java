import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class Divisions implements ActionListener {
    JFrame frame = new JFrame("Divisions");
    JLabel label = new JLabel("Rajshahi");
    JButton next = new JButton("Next");
    JButton prev = new JButton("Prev");
    String arr[] = { "Barishal", "Chattogram", "Dhaka", "Khulna", "Rajshahi", "Rangpur", "Mymensingh", "Sylhet" };
    int index = 4;

    Divisions() {
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setBounds(10, 10, 200, 30);
        label.setBackground(Color.red);
        label.setOpaque(true);
        next.setBounds(10, 50, 95, 30);
        prev.setBounds(115, 50, 95, 30);

        next.addActionListener(this);
        prev.addActionListener(this);

        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.add(next);
        frame.add(prev);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == next) {
            index = (index + 1) % 8;

        } else if (o == prev) {
            index--;
            if (index == -1) {
                index = 7;
            }

        }
        label.setText(arr[index]);
    }
    public static void main(String[] args) {
        new Divisions();
    }
}
