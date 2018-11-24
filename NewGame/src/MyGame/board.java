package MyGame;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class board  extends JPanel implements ActionListener {
    mario p  ;
    Image imgback1=null,imgback2=null;
    Timer time;  //to update frame bcz character is moving


    public board() {
      addKeyListener(new Actionlistner());//passing object of actionlistener method below
      setFocusable(true);
      p = new mario();//calls mario constructor

      try {
          imgback1 = ImageIO.read(board.class.getClassLoader().getResource("MyGame/image/WHu9Z.png"));
          imgback2= ImageIO.read(board.class.getClassLoader().getResource("MyGame/image/WHu9Z.png"));
      } catch (IOException ev) {
          ev.printStackTrace();
      }
    //  Image i = new Image("MyGame/image/r8fZi.png");
//
    //  img = i.getImage();
           time = new Timer(5, this);
           time.start();


  }
    public void actionPerformed(ActionEvent e) {
      p.move();
      repaint();
           }
           public void paint(Graphics g) {
      super.paint(g);
      //  Graphics2D g2 = (Graphics2D) g;

          g.drawImage(imgback1,p.getxback1(),0,null);//make same object of graphic class only
          g.drawImage(imgback2,p.getxsecondback(),0,null);
          g.drawImage(p.getImage(),p.getX(),p.gety(),null);
    }
public class Actionlistner extends KeyAdapter{

      public void keyReleased(KeyEvent e){
          p.keyReleased(e);
      }
      public void keyPressed(KeyEvent e){
       p.keyPressed(e);

      }
}

}







