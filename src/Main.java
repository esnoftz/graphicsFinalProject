import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
    public static void main(String[] args) {
                                        // FRAME
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        frame.setResizable(false);



                                        // PANELS
        // introPanel
        JPanel introPanel = new JPanel();
        introPanel.setLayout(new GridLayout(3, 1));

        // bigPanel
        JPanel bigPanel = new JPanel();
        bigPanel.setLayout(new GridLayout(3, 1));

        // presentPanel
        MyPanel presentPanel = new MyPanel(frame.getWidth(), 200, 0, 0);
        presentPanel.setLayout(new GridLayout(2, 3));
        presentPanel.setSize(presentPanel.getWidth(), presentPanel.getHeight());

        // instructPanel
        MyPanel instructPanel = new MyPanel(frame.getWidth(), 35, 0, 0);
        instructPanel.setSize(instructPanel.getWidth(), instructPanel.getHeight());

        // afterChoosePanel
        MyPanel afterChoosePanel = new MyPanel(frame.getWidth(), 300, 0, 0);
        afterChoosePanel.setSize(afterChoosePanel.getWidth(), afterChoosePanel.getHeight());
        afterChoosePanel.setLayout(new GridLayout(3, 1));



                                        // COMPONENTS
        // introPanel Components
        JLabel titleLabel = new JLabel("               100 Minions");
        titleLabel.setFont(new Font("Title", 1, 70));
        JButton instructionsButton = new JButton("Instructions");

        // presentPanel Components
        ImageIcon closed = new ImageIcon("Images/closedPresentPicture.png");
        closed.setImage(closed.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        ImageIcon open =  new ImageIcon("Images/openPresentPicture.png");
        open.setImage(open.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JButton present1 = new JButton(closed);
        JButton present2 = new JButton(closed);
        JButton present3 = new JButton(closed);
        present1.setBackground(Color.BLACK);
        present2.setBackground(Color.BLACK);
        present3.setBackground(Color.BLACK);
        JLabel label1 = new JLabel("");
        JLabel label2 = new JLabel("");
        JLabel label3 = new JLabel("");

        // instructPanel Components
        JLabel instructLabel = new JLabel("Choose a present to find out how many minions you will earn this round!");
        instructLabel.setFont(new Font("Instructions", 1, 20));

        // afterChoosePanel Components
        JButton playButton = new JButton("PLAY!");
        JLabel afterChooseLabel = new JLabel("");
        afterChooseLabel.setFont(new Font("Result", 1, 20));
        JButton resultButton = new JButton("See My Minions!");
        JButton newRoundButton = new JButton("New Round");



                                // ADDING COMPONENTS TO PANEL
        // introPanel
        introPanel.add(titleLabel);
        introPanel.add(instructionsButton);
        introPanel.add(playButton);

        // bigPanel
        bigPanel.add(instructPanel);
        bigPanel.add(presentPanel);

        // presentPanel
        presentPanel.add(present1);
        presentPanel.add(present2);
        presentPanel.add(present3);
        presentPanel.add(label1);
        presentPanel.add(label2);
        presentPanel.add(label3);

        // instructPanel
        instructPanel.add(instructLabel);

        // afterChoosePanel
        afterChoosePanel.add(afterChooseLabel);
        afterChoosePanel.add(resultButton);
        afterChoosePanel.add(newRoundButton);



                        // ADDING PANELS TO FRAME / MAKING FRAME VISIBLE
        frame.add(introPanel);
        frame.setVisible(true);



                                        // ACTION LISTENERS
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(introPanel);
                frame.add(bigPanel);
                frame.revalidate();
                frame.repaint();
            }
        });

        present1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);

                present1.setIcon(open);
                present2.setIcon(closed);
                present3.setIcon(closed);

                present1.setEnabled(false);
                present2.setEnabled(false);
                present3.setEnabled(false);

                present1.setBackground(Color.YELLOW);

                int roundMinions = ((int)(Math.random() * 10) + 1);
                label1.setText("" + roundMinions);
                //label1.setHorizontalTextPosition(JLabel.CENTER); why doesn't this do anythingggggg???
                label2.setText("" + ((int)(Math.random()* 10) + 1));
                label3.setText("" + ((int)(Math.random()* 10) + 1));

                afterChooseLabel.setText("You have earned " + roundMinions + " minions this round!");
                bigPanel.add(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();
            }
        });

        present2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);

                present2.setIcon(open);
                present1.setIcon(closed);
                present3.setIcon(closed);

                present1.setEnabled(false);
                present2.setEnabled(false);
                present3.setEnabled(false);

                present2.setBackground(Color.YELLOW);

                int roundMinions = (int)(Math.random() * 10) + 1;
                label1.setText("" + ((int)(Math.random()* 10) + 1));
                label2.setText("" + roundMinions);
                label3.setText("" + ((int)(Math.random()* 10) + 1));

                afterChooseLabel.setText("You have earned " + roundMinions + " minions this round!");
                bigPanel.add(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();
            }
        });

        present3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setVisible(true);

                present3.setIcon(open);
                present1.setIcon(closed);
                present2.setIcon(closed);

                present1.setEnabled(false);
                present2.setEnabled(false);
                present3.setEnabled(false);

                present3.setBackground(Color.YELLOW);

                int roundMinions = (int)(Math.random() * 10) + 1;
                label1.setText("" + ((int)(Math.random()* 10) + 1));
                label2.setText("" + ((int)(Math.random()* 10) + 1));
                label3.setText("" + roundMinions);

                afterChooseLabel.setText("You have earned " + roundMinions + " minions this round!");
                bigPanel.add(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();
            }
        });

        newRoundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                present1.setEnabled(true);
                present2.setEnabled(true);
                present3.setEnabled(true);

                present1.setIcon(closed);
                present2.setIcon(closed);
                present3.setIcon(closed);

                present1.setBackground(Color.BLACK);
                present2.setBackground(Color.BLACK);
                present3.setBackground(Color.BLACK);

                label1.setText("");
                label2.setText("");
                label3.setText("");

                bigPanel.remove(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();
            }
        });
    }

}