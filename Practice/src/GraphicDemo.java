

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GraphicDemo extends JFrame {

    // The constructor follows:
    public GraphicDemo() {
        setTitle("GraphicsDemo with Kilobolt");
        setSize(800, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
public void paint(Graphics g){

}

    // All classes need a main method, so we create that here too!
    public static void main(String args[]) {
        // We will create a GraphicsDemo object in the main method like so:
        // This should be familar, as we used this to create Random objects and
        // Thread objects:
        GraphicDemo demo = new GraphicDemo();

    }

}

