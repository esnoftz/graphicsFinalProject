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
       // panel.setLayout(new GridLayout(2, 3));

        // Creating components
        ImageIcon closed = new ImageIcon("Images/closedPresentPicture.png");
        closed.setImage(closed.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        ImageIcon open =  new ImageIcon("Images/openPresentPicture.png");
        open.setImage(open.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton button1 = new JButton(closed);
        JButton button2 = new JButton(closed);
        JButton button3 = new JButton(closed);
        JLabel label1 = new JLabel();

        // Adding components to panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label1);
        label1.setVisible(false);

        // Adding panel to frame
        frame.add(panel);

        // Making frame visible
        frame.setVisible(true);


        // Action listeners
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
                button1.setIcon(open);
                button2.setIcon(closed);
                button3.setIcon(closed);
                button2.setVisible(false);
                button3.setVisible(false);
                //button1.setEnabled(false);
                label1.setText("" + ((int)(Math.random()* 10) + 1));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
                button2.setIcon(open);
                button1.setIcon(closed);
                button3.setIcon(closed);
                button1.setVisible(false);
                button3.setVisible(false);
                label1.setText("" + ((int)(Math.random()* 10) + 1));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);
                button3.setIcon(open);
                button1.setIcon(closed);
                button2.setIcon(closed);
                button1.setVisible(false);
                button2.setVisible(false);
                label1.setText("" + ((int)(Math.random()* 10) + 1));
            }
        });

    }
}