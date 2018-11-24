import javax.imageio.ImageIO;import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class imagemove implements KeyListener {
int code;
    public static void main(String[] args) {

imagemove obj =new imagemove();

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
        //graphics.setColor(Color.magenta);
         Image  background=null;
        try {
            background=ImageIO.read(imagemove.class.getClassLoader().getResource("image/WHu9Z.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image img=null;

        try {
            img= ImageIO.read(imagemove.class.getClassLoader().getResource("image/r8fZi.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
      //  Random random=new Random();
        int x=0;  //mario coordinates initial

        int y =285; //mario coordinate from top
        int xvel = 5;
        int yvel = 5;

        while (true) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            x -= xvel;
            graphics.clearRect(0, 0, 500, 600);

           // graphics.fillArc(x, y, 20, 20, 0, 360);
             graphics.drawImage(img,x,y,null);

            graphics.drawImage(background,0,0,null);

             if(x<=0)
             {
                 x=800;


            }
            
        }


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        code=e.getKeyCode();
        System.out.println(code);

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
