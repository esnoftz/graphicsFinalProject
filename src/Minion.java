import javax.swing.*;
import java.util.ArrayList;

public class Minion {
    public static int minionsEarned = 0;
    public static int addMinions = 0;
    public static int roundCount = 0;
    public static int roundLimit = (int)(Math.random() * 6) + 10;

    public static ArrayList<JLabel> minionsArrayList = new ArrayList<JLabel>();



    public Minion() {

    }
}
