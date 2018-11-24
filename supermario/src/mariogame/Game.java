package mariogame;
import java.awt.*;

import javax.swing.*;
public class Game extends Canvas {

    public static final int WIDTH = 270;
    public static final int HEIGHT = WIDTH/10*14;
    public static final int SCALE = 4;

    public static final String TITLE = "Mario";


    public Game() {
        Dimension size = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);


    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame(TITLE);

        frame.add(game);
        frame.pack();
        frame.setResizable(false);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);


        int x = 0;
        int y = 0;
        int xVelocity =


    }