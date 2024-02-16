import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    public static void main(String[] args) {
        // Idea: Have three present boxes on the screen and have the user pick one. Then inside will be a random number of balls. Could call it 100 balls
        // or something. The goal is to fill up the jar with 100 balls in as few tries as possible.

        // Creating the frame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        // Creating the panel
        MyPanel panel = new MyPanel();
        MyPanel panel2 = new MyPanel();

        // Creating components
        JButton button1 = new JButton("Click Me!");


        // Adding components to panel
        panel.add(button1);

        // Adding panel to frame
        frame.add(panel);

        // Making frame visible
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //frame.add(panel2);
            }
        });

    }
}