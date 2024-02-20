package parcial;

import javax.swing.*;

public class LoginWindow extends JFrame {

    String name = "Marco"; // default name for login window
    String password = "1234"; // default password for login window

    public LoginWindow() {
        // JFrame default
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 300);
        setVisible(true);

        // Create the main JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Create the components
        JLabel nameLbl = new JLabel("Name");
        JTextField nameField = new JTextField();
        JLabel passLbl = new JLabel("Password");
        JPasswordField passField = new JPasswordField();

        // Create the buttons
        JButton accept = getAccept(nameField, passField);

        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(e -> {
            dispose();
            System.exit(0);
        });

        // Add the components to the JPanel
        panel.add(nameLbl);
        nameLbl.setBounds(10, 10, 100, 20);
        panel.add(nameField);
        nameField.setBounds(100, 10, 100, 20);
        panel.add(passLbl);
        passLbl.setBounds(10, 40, 100, 20);
        panel.add(passField);
        passField.setBounds(100, 40, 100, 20);
        panel.add(accept);
        accept.setBounds(10, 100, 100, 20);
        panel.add(cancel);
        cancel.setBounds(120, 100, 100, 20);

        // Add the JPanel to the JFrame
        add(panel);
    }

    private JButton getAccept(JTextField nameField, JPasswordField passField) {
        JButton accept = new JButton("Accept");
        accept.addActionListener(e -> {
            // Check if the credentials are the defined before
            if ( name.equals(nameField.getText()) && password.equals(new String(passField.getPassword())) ){
                SwingUtilities.invokeLater(Window::new);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid credentials. Please Retry.",
                        "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
                nameField.setText("");
                passField.setText("");
            }
        });
        return accept;
    }
}
