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
        panel.setLayout(new BorderLayout());

        // Creating components
        JLabel label1 = new JLabel("TIGER TETRIS!!!");
        // make a label or something to create a line at the top of the screen

        // Adding components to the panel
        panel.add(label1, BorderLayout.NORTH);



        // Adding the panel to the frame
        frame.add(panel);

        // Making the frame visible
        frame.setVisible(true);
    }
}