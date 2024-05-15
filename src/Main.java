import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;



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

        // minionPanel
        MyPanel minionPanel = new MyPanel(frame.getWidth(), (frame.getHeight() / 10) * 9, 0, 0);
        minionPanel.setSize(minionPanel.getWidth(), minionPanel.getHeight());
        minionPanel.setLayout(new GridLayout(10, 10));

        // backFromMinionPanel
        MyPanel backFromMinionPanel = new MyPanel(frame.getWidth(), frame.getHeight() / 20, 0, 0);
        backFromMinionPanel.setSize(backFromMinionPanel.getWidth(), backFromMinionPanel.getHeight());

        // winnerPanel
        MyPanel winnerPanel = new MyPanel(frame.getWidth(), frame.getHeight(), 0, 0);
        winnerPanel.setSize(winnerPanel.getWidth(), winnerPanel.getHeight());
        winnerPanel.setLayout(new GridLayout(3, 1));

        // loserPanel
        MyPanel loserPanel = new MyPanel(frame.getWidth(), frame.getHeight(), 0, 0);
        loserPanel.setSize(loserPanel.getWidth(), winnerPanel.getHeight());
        loserPanel.setLayout(new GridLayout(3, 1));



                                        // COMPONENTS
        // introPanel Components
        JLabel titleLabel = new JLabel("             100 Minions");
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
        JLabel instructLabel = new JLabel("Choose a present to find out how many minions you will earn this round! ROUNDS LEFT: " + Minion.roundLimit);
        instructLabel.setFont(new Font("Instructions", 1, 20));

        // afterChoosePanel Components
        JButton playButton = new JButton("PLAY!");
        JLabel afterChooseLabel = new JLabel("");
        afterChooseLabel.setFont(new Font("Result", 1, 20));
        JButton seeMinionsButton = new JButton("See My Minions!");
        JButton newRoundButton = new JButton("New Round");

        // minionPanel Components
        ArrayList<JLabel> minionsArrayList = new ArrayList<JLabel>();
        for(int i = 0; i < 100; i++) {
            minionsArrayList.add(new JLabel());
        }

        // backFromMinionPanel Components
        JButton backFromMinionsButton = new JButton("Back to Round");
        JLabel totalMinionLabel = new JLabel("");

        // winnerPanel Components
        JLabel winnerLabel = new JLabel("YOU WON!!!");
        JLabel winnerLabel2 = new JLabel("");
        JButton playAgainButton = new JButton("Play Again!");

        // loserPanel Components
        JLabel loserLabel = new JLabel("YOU LOST!!!");
        JLabel loserLabel2 = new JLabel("");
        JButton playAgainButton2 = new JButton("Play Again!");



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
        afterChoosePanel.add(seeMinionsButton);
        afterChoosePanel.add(newRoundButton);

        // backFromMinionPanel
        backFromMinionPanel.add(backFromMinionsButton);
        backFromMinionPanel.add(totalMinionLabel);

        // winnerPanel
        winnerPanel.add(winnerLabel);
        winnerPanel.add(winnerLabel2);
        winnerPanel.add(playAgainButton);

        // loserPanel
        loserPanel.add(loserLabel);
        loserPanel.add(loserLabel2);
        loserPanel.add(playAgainButton2);


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

                int roundMinions = ((int)(Math.random() * 15) + 1);
                Minion.addMinions += roundMinions;
                Minion.minionsEarned += roundMinions;
                label1.setText("" + roundMinions);
                //label1.setHorizontalTextPosition(JLabel.CENTER); why doesn't this do anythingggggg???
                label2.setText("" + ((int)(Math.random()* 15) + 1));
                label3.setText("" + ((int)(Math.random()* 15) + 1));

                afterChooseLabel.setText("You have earned " + roundMinions + " minions this round!");
                bigPanel.add(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();

                if(Minion.minionsEarned >= 100) {
                    winnerLabel2.setText("With a final score of " + Minion.minionsEarned + " minions in " + Minion.roundCount + " rounds!");
                    bigPanel.remove(instructPanel);
                    bigPanel.remove(presentPanel);
                    bigPanel.remove(afterChoosePanel);
                    bigPanel.setLayout(new FlowLayout());
                    bigPanel.add(winnerPanel);
                    bigPanel.revalidate();
                    bigPanel.repaint();
                }

                Minion.roundLimit--;
                if((Minion.minionsEarned < 100) && (Minion.roundLimit == 0)) {
                    loserLabel2.setText("You were " + (100 - Minion.minionsEarned) + " minions short of 100 minions!");
                    bigPanel.remove(instructPanel);
                    bigPanel.remove(presentPanel);
                    bigPanel.remove(afterChoosePanel);
                    bigPanel.setLayout(new FlowLayout());
                    bigPanel.add(loserPanel);
                    bigPanel.revalidate();
                    bigPanel.repaint();
                }

                Minion.roundCount++;
                instructLabel.setText("Choose a present to find out how many minions you will earn this round! ROUNDS LEFT: " + Minion.roundLimit);

                System.out.println(Minion.roundCount);

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

                int roundMinions = (int)(Math.random() * 15) + 1;
                Minion.addMinions += roundMinions;
                Minion.minionsEarned += roundMinions;
                label1.setText("" + ((int)(Math.random()* 15) + 1));
                label2.setText("" + roundMinions);
                label3.setText("" + ((int)(Math.random()* 15) + 1));

                afterChooseLabel.setText("You have earned " + roundMinions + " minions this round!");
                bigPanel.add(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();

                if(Minion.minionsEarned >= 100) {
                    winnerLabel2.setText("With a final score of " + Minion.minionsEarned + " minions in " + Minion.roundCount + " rounds!");
                    bigPanel.remove(instructPanel);
                    bigPanel.remove(presentPanel);
                    bigPanel.remove(afterChoosePanel);
                    bigPanel.setLayout(new FlowLayout());
                    bigPanel.add(winnerPanel);
                    bigPanel.revalidate();
                    bigPanel.repaint();
                }

                Minion.roundLimit--;
                if((Minion.minionsEarned < 100) && (Minion.roundLimit == 0)) {
                    loserLabel2.setText("You were " + (100 - Minion.minionsEarned) + " minions short of 100 minions!");
                    bigPanel.remove(instructPanel);
                    bigPanel.remove(presentPanel);
                    bigPanel.remove(afterChoosePanel);
                    bigPanel.setLayout(new FlowLayout());
                    bigPanel.add(loserPanel);
                    bigPanel.revalidate();
                    bigPanel.repaint();
                }

                Minion.roundCount++;
                instructLabel.setText("Choose a present to find out how many minions you will earn this round! ROUNDS LEFT: " + Minion.roundLimit);

                System.out.println(Minion.roundCount);


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

                int roundMinions = (int)(Math.random() * 15) + 1;
                Minion.addMinions += roundMinions;
                Minion.minionsEarned += roundMinions;
                label1.setText("" + ((int)(Math.random()* 15) + 1));
                label2.setText("" + ((int)(Math.random()* 15) + 1));
                label3.setText("" + roundMinions);

                afterChooseLabel.setText("You have earned " + roundMinions + " minions this round!");
                bigPanel.add(afterChoosePanel);
                bigPanel.revalidate();
                bigPanel.repaint();

                if(Minion.minionsEarned >= 100) {
                    winnerLabel2.setText("With a final score of " + Minion.minionsEarned + " minions in " + Minion.roundCount + " rounds!");
                    bigPanel.remove(instructPanel);
                    bigPanel.remove(presentPanel);
                    bigPanel.remove(afterChoosePanel);
                    bigPanel.setLayout(new FlowLayout());
                    bigPanel.add(winnerPanel);
                    bigPanel.revalidate();
                    bigPanel.repaint();
                }

                Minion.roundLimit--;
                if((Minion.minionsEarned < 100) && (Minion.roundLimit == 0)) {
                    loserLabel2.setText("You were " + (100 - Minion.minionsEarned) + " minions short of 100 minions!");
                    bigPanel.remove(instructPanel);
                    bigPanel.remove(presentPanel);
                    bigPanel.remove(afterChoosePanel);
                    bigPanel.setLayout(new FlowLayout());
                    bigPanel.add(loserPanel);
                    bigPanel.revalidate();
                    bigPanel.repaint();
                }

                Minion.roundCount++;
                instructLabel.setText("Choose a present to find out how many minions you will earn this round! ROUNDS LEFT: " + Minion.roundLimit);

                System.out.println(Minion.roundCount);

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

        seeMinionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(Minion.addMinions > 0) {
                    ImageIcon minionIcon = new ImageIcon("Images/minionPicture.png");
                    minionIcon.setImage(minionIcon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                    JLabel singleMinion = new JLabel(minionIcon);
                    minionsArrayList.set(Minion.minionsEarned - Minion.addMinions, singleMinion);
                    Minion.addMinions--;
                }

                for(int i = 0; i < minionsArrayList.size(); i++) {
                    minionPanel.add(minionsArrayList.get(i));
                }

                totalMinionLabel.setText("Total Minions Earned: " + Minion.minionsEarned);

                bigPanel.remove(instructPanel);
                bigPanel.remove(presentPanel);
                bigPanel.remove(afterChoosePanel);
                bigPanel.setLayout(new BorderLayout());
                bigPanel.add(backFromMinionPanel, BorderLayout.PAGE_START);
                bigPanel.add(minionPanel, BorderLayout.CENTER);
                bigPanel.revalidate();
                bigPanel.repaint();
            }
        });

        backFromMinionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minionPanel.removeAll();

                bigPanel.remove(backFromMinionPanel);
                bigPanel.remove(minionPanel);
                bigPanel.setLayout(new GridLayout(3, 1));
                bigPanel.add(instructPanel);
                bigPanel.add(presentPanel);
                bigPanel.revalidate();
                bigPanel.repaint();

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

            }
        });
    }

}