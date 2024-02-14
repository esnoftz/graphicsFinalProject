import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        // Creating the frame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        // Creating the panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(236, 88, 0));

        // Creating components
        JLabel label1 = new JLabel("Welcome to Tiger Ball!");
        JButton button1 = new JButton("START");

        // Adding components to the panel
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 1;
        gc.gridy = 2;
        panel.add(label1, gc);

        gc.gridx = 2;
        gc.gridy = 3;
        panel.add(button1, gc);



        // Adding the panel to the frame
        frame.add(panel);

        // Making the frame visible
        frame.setVisible(true);
    }
}