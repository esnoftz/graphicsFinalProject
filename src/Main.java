import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    public static void main(String[] args) {
        // Idea: Have three present boxes on the screen and have the user pick one. Then inside will be a random number of balls. Could call it 100 balls
        // or something. The goal is to fill up the jar with 100 balls in as few tries as possible.
        // To be evil, sometimes some balls will "miss" the jar when being put in. Start out with random colored balls falling
        // and then turn them green when they are accepted into the jar. Ones that turn red will have "missed" or something

        // Creating the frame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        // Creating the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3));

        // Creating components
        JButton button1 = new JButton("#1");
        JButton button2 = new JButton("#2");
        JButton button3 = new JButton("#3");
        JLabel label1 = new JLabel("                  #1");
        JLabel label2 = new JLabel("                  #2");
        JLabel label3 = new JLabel("                  #3");
        ImageIcon open = new ImageIcon("Images/closedPresentPicture.png");
        ImageIcon closed =  new ImageIcon("Images/openPresentPicture.png");
        JLabel openPresPic = new JLabel(open);
        JLabel closedPresPic = new JLabel(closed);

        // Adding components to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label1);
        label1.setVisible(false);
        panel.add(label2);
        label2.setVisible(false);
        panel.add(label3);
        label3.setVisible(false);

        // Adding panel to frame
        frame.add(panel);

        // Making frame visible
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
                label2.setVisible(false);
                label3.setVisible(false);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setVisible(true);
                label1.setVisible(false);
                label3.setVisible(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setVisible(true);
                label1.setVisible(false);
                label2.setVisible(false);
            }
        });

    }
}