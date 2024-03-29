import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private int width;
    private int height;
    private int xPos;
    private int yPos;

    public MyPanel() {
        this.setBackground(Color.RED);
    }

    public MyPanel(int width, int height, int x, int y) {
        //this.setSize(width, height);
        this.width = width;
        this.height = height;
        xPos = x;
        yPos = y;
        //this.setBackground(Color.BLUE);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }



}
