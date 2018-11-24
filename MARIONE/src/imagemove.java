

import javax.imageio.ImageIO;import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class imagemove implements ActionListener {

    Image background;
    Image img,background2;


    Graphics graphics;
    private static JButton button;
    JPanel panel = new JPanel();

    public static void main(String[] args) {


        imagemove obj1 = new imagemove();
        imagemove.button = new JButton("START");
        imagemove img = new imagemove();
        img.Gui();
    }

    public void Gui() {

        JFrame frame = new JFrame("RAVI MARIO");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(600, 385));
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        panel.add(imagemove.button);
        frame.setVisible(true);

        button.addActionListener(this);
        frame.add(button);
        graphics = panel.getGraphics();
        //graphics.setColor(Color.magenta);

        background = null;
        img=null;
        try {
            background = ImageIO.read(imagemove.class.getClassLoader().getResource("image/WHu9Z.png"));
            img = ImageIO.read(imagemove.class.getClassLoader().getResource("image/r8fZi.png"));
            background2=ImageIO.read((imagemove.class.getClassLoader().getResource("image/WHu9Z.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  Random random=new Random();


    }

    public void actionPerformed(ActionEvent event) {
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
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            x -= xvel; //changing mario coordinate

             //graphics.clearRect(0, 0, 500, 600);

            // graphics.fillArc(x, y, 20, 20, 0, 360);


            graphics.drawImage(background,xfirstback,yfirstback,null);
            graphics.drawImage(background2,xsecondback,ysecondback,null);
           //graphics.drawImage(background2,xsecondback,ysecondback,null);
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


    }








