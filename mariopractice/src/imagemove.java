import javax.imageio.ImageIO;import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

public class imagemove implements KeyListener {
    private static JButton button;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        imagemove.button = new JButton("START");
        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(600, 385));
        frame.add(panel);
        panel.add(imagemove.button);
        frame.pack();
        frame.setVisible(true);



        try {
            Thread.sleep(30);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Graphics graphics = panel.getGraphics();
        //graphics.setColor(Color.magenta);
        Image  background=null;     //first background include
        Image background2=null; //second background incude
        Image img=null;
        try {
            background=ImageIO.read(imagemove.class.getClassLoader().getResource("image/WHu9Z.png"));
            background2=ImageIO.read(imagemove.class.getClassLoader().getResource("image/WHu9Z - Copy.png"));
            img= ImageIO.read(imagemove.class.getClassLoader().getResource("image/r8fZi.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        //  Random random=new Random();
        int x=0;  //mario coordinates initial

         int y=285; //mario coordinate from top

        int yfirstback =0;
        int xfirstback  =0;              //background
        int xsecondback  =-600;   //background
        int ysecondback =0;   //background

        int xvel = 5;
        int yvel = 5;



        while (true) {
            try {
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            x -= xvel; //changing mario coordinate

          // graphics.clearRect(0, 0, 500, 600);

            // graphics.fillArc(x, y, 20, 20, 0, 360);


            graphics.drawImage(background,xfirstback,yfirstback,null);
            graphics.drawImage(background2,xsecondback,ysecondback,null);
            graphics.drawImage(img,x,y,null);


          xfirstback += xvel;
         if(xfirstback>0){
               xsecondback+=xvel;

           }
           if(xsecondback>=600&&xsecondback==0){
               xfirstback=-600;
           }


            if(x<=0)
            {
                x=600;


            }

        }


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    } }

