package MyGame;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class mario {
    Graphics g;

    int x, xvel, yvel, y,xfirstback,xsecondback;
    Image img2=null;
          //  Image img3=null;

    public mario() {
        try {
            img2 = ImageIO.read(board.class.getClassLoader().getResource("MyGame/image/Zxfbi.png"));
           //img3=ImageIO.read(board.class.getClassLoader().getResource("MyGame/image/r8fZi.png"));
        } catch (IOException ev) {
            ev.printStackTrace(); }
      //  ImageIcon i = new ImageIcon("");
      //  img2 = i.getImage();
        x = 50;
        y = 285;
         xfirstback=0;
      xsecondback=600;

    }

    public void move() {
        // x = x +xvel;
        y+=yvel;
        xfirstback-=xvel;
        xsecondback-=xvel;
    }

    public int getxback1(){
        return xfirstback; }
public int getxsecondback(){
        return xsecondback;
    }
    public int getX() { //bcz we cant acces theese non static variable
        return x; }

    public int gety() {
        return y; }

    public Image getImage() {
        return img2;

    }
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
    //    if (key == KeyEvent.VK_LEFT)
            //xvel = -2;

        if(key==KeyEvent.VK_SPACE)
            y=230;



        if (key == KeyEvent.VK_RIGHT){

            xvel=2;
            if(xfirstback<=0){

            } }}
        public void keyReleased(KeyEvent e){

         int key=e.getKeyCode();
          if(key==KeyEvent.VK_LEFT)
             xvel=0;
            if(key== KeyEvent.VK_SPACE)
                y = 285;
            if(key==KeyEvent.VK_RIGHT)
                xvel=0;//bcz when i release key then i m not moving anymore




}}