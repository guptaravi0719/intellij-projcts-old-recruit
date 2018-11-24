import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;



public class marioimage extends JFrame {
    public static  void main(String[] args){
        JFrame frame=new JFrame("Mario game");
        JPanel panel =new JPanel();
        Graphics graphics =panel.getGraphics();

        frame.setPreferredSize(new Dimension(800,600));

        BufferedImage image= null;
        try {
            image = ImageIO.read(new File("images/WHu9Z.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel label = new JLabel(new ImageIcon(image));
        panel.add(label);


        JFrame.setDefaultLookAndFeelDecorated(true);

   frame.add(panel);
   frame.setVisible(true);
   frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
   frame.pack();
try{
    Thread.sleep(50);
}catch(InterruptedException e){
    e.printStackTrace();
        }


        int x=0;
   int y=0;
   int xvel=5;
   int yvel=5;

           while(true){
               try{
                   Thread.sleep(50);

               }catch(InterruptedException e){
                   e.printStackTrace();
               }
               x-=xvel;

               graphics.clearRect(0,0,800,600);
               graphics.drawImage(image,x,y,null);
               if(x<=0){
                   xvel=5;
                   if(x<-600){
                       x=800;
                   }

               }

           }














    }
}
