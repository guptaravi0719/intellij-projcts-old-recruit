package MyGame;
import java.awt.*;




import javax.swing.*;

import static java.awt.Color.BLACK;

public class frame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mario Project by Ravi");
        frame.add(new board());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 430);



    frame.setVisible(true);

    }}