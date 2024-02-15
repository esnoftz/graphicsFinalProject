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
        panel.setLayout(new GridLayout(2, 1));

        // Creating components
        JLabel label1 = new JLabel("Welcome to Tiger Ball!");
        Font font1 = new Font();

        JButton button1 = new JButton("START");

        // Adding components to the panel
        panel.add(label1);
        panel.add(button1);



        // Adding the panel to the frame
        frame.add(panel);

        // Making the frame visible
        frame.setVisible(true);
    }
}