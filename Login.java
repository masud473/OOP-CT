import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Login implements ActionListener {
    JFrame frame = new JFrame("Login Form");
    JLabel l, p;
    JButton close, submit;
    JTextField login;
    JPasswordField pass;

    Login() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l = new JLabel("Login");
        p = new JLabel("Password");
        close = new JButton("Close");
        submit = new JButton("Submit");
        login = new JTextField();
        pass = new JPasswordField();

        l.setBounds(10, 10, 80, 30);
        p.setBounds(10, 50, 80, 30);
        login.setBounds(100, 10, 160, 30);
        pass.setBounds(100, 50, 160, 30);
        close.setBounds(40, 90, 80, 30);
        submit.setBounds(130, 90, 80, 30);

        close.addActionListener(this);
        submit.addActionListener(this);

        // declare panel and add all to this panel with null layout and finally add
        // panel to frame
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(l);
        panel.add(p);
        panel.add(login);
        panel.add(pass);
        panel.add(close);
        panel.add(submit);

        panel.setPreferredSize(new Dimension(270, 130));

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == submit) {
            String log = login.getText();
            String pas = String.valueOf(pass.getPassword());
            // password check is failing even if it's true
            
            if (log.equals("a")==true && pas.equals("b")==true) {
                JOptionPane.showMessageDialog(null, "Login Successful");

            } else
                JOptionPane.showMessageDialog(null, "Login Failed");
        } else if (o == close) {
            frame.dispose();
        }
        login.setText(null);
        pass.setText(null);
    }

    public static void main(String[] args) {
        new Login();

    }

}
