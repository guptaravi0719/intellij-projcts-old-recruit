import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Game extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 600));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        try {
            Thread.sleep(30);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Graphics graphics = panel.getGraphics();
        graphics.setColor(Color.magenta);
        Image img=null;

        try {
            img= ImageIO.read(Game.class.getClassLoader().getResource("images/float.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//int X=0;
      //  int Y=0;
        int x = 0;
        int y = 0;
        int xvel = 5;
        int yvel = 5;

        while (true) {
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x += xvel;
            y += yvel;
            graphics.clearRect(0, 0, 500, 600);

            graphics.fillArc(x, y, 60, 60, 0, 360);
          //  graphics.drawImage(img,X,Y,null);

            if (x > 440) {
                xvel = -5;
            }
            if (x <= 0) {
                xvel = 5;
            }
            if (y > 540) {
                yvel = -5;
            }
            if (y <= 0) {
                yvel=+5;
            }
        }


    }


}

