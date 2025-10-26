import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    // Use generics for type safety
    String[] countries = { "Australia", "Bangladesh", "India", "Japan", "Malaysia" };
    String[] capitals = { "Canberra", "Dhaka", "New Delhi", "Tokyo", "Kuala Lumpur" };
    JComboBox<String> combo = new JComboBox<>(countries);

    public MyFrame() {
        // 1. Setup the main window (JFrame)
        setTitle("Capital Finder");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        setLayout(null);

        combo.setSelectedIndex(2); // Set default to India
        combo.setBounds(100, 80, 200, 30);

        combo.addActionListener(this);

        add(combo);

        // 2. Make the JFrame visible after adding all components
        setVisible(true);
    }

    @Override // Good practice to use this annotation
    public void actionPerformed(ActionEvent e) {
        int i = combo.getSelectedIndex();
        JOptionPane.showMessageDialog(this, "Capital: " + capitals[i]);
    }

    public static void main(String[] args) {
        // It's best practice to create Swing UIs on the Event Dispatch Thread
        new MyFrame();
    }
}