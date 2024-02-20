package parcial;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JFrame {

    ArrayList<JButton> buttonNames = new ArrayList<>();
    ArrayList<JButton> buttonsMenu = new ArrayList<>();

    int n = 0;

    public Window() {
        // Default JFrame values
        setTitle("Practice Exam");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 300);

        // Create the main JPanel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());

        // Create the secondary JPanels
        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        southPanel.setLayout(new FlowLayout());

        // Create the buttons and add them to the JPanel
        createButtons(northPanel,3);
        createButtons(southPanel,3);

        // Add the secondary JPanel to the main
        add(buttonPanel);
        buttonPanel.add(northPanel, BorderLayout.NORTH);
        buttonPanel.add(southPanel, BorderLayout.SOUTH);

        // Create the JMenuBar
        createJMenuBar();


    }

    /**
     * Create the Buttons and add them to the JPanel, also change the configuration and add the listener to the buttons
     * @param panel Panel to use
     */
    public void createButtons(JPanel panel,int x) {
        int j = n;
        x+=n;
        for (int i = j; i < x; i++) {
            n++;
            JButton button = new JButton("Button " + n);
            panel.add(button);
            buttonNames.add(button);
            // Change the config of the button
            configButton(button);
            // Add button listener to the buttons
            addButtonListener(button);
        }
    }

    /**
     * Create the JMenuBar and add them to the JPanel, also create the buttons and change the configuration and add the listener to the buttons
     */
    public void createJMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Buttons");
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Create the buttons and add them to the JPanel
        for (JButton ignored : buttonNames) {
            JButton button1 = new JButton("Menu " + (buttonsMenu.size()+1));
            buttonsMenu.add(button1);
            menu.add(button1);
            addButtonListener(button1);
        }
    }

    /**
     * Add the button listener to the buttons, opening a new Window
     * @param button Button to add the listener
     */
    public void addButtonListener(JButton button) {
        button.addActionListener(e -> processButton(button));
    }

    /**
     * Change the configuration of the Button
     * @param button button to change the configuration
     */
    public void configButton(JButton button) {
        button.setBackground(new Color(135, 206, 250));
        button.setForeground(Color.black);
    }

    /**
     * Create a new Window with button pressed text and close button
     * @param button button to add the listener
     */
    public void processButton(JButton button) {
        // New JFrame with components
        JFrame frame = new JFrame("B");
        JLabel label = new JLabel(button.getText() + " pressed!");
        JButton nButton = new JButton("Close");

        nButton.addActionListener(e -> frame.dispose());

        // Set frame layout and add components
        frame.setLayout(new BorderLayout());
        frame.setBounds(300,300,200,100);
        frame.add(label,BorderLayout.CENTER);
        frame.add(nButton,BorderLayout.SOUTH);
        frame.setVisible(true);

    }

}
