import java.awt.*;
import javax.swing.*;
 
public class Main  extends JApplet {
 
    public void init()
    {
        // set size
        setSize(400, 400);
 
        repaint();
    }
 
    // paint the applet
    public void paint(Graphics g)
    {
        // set Color for rectangle
        g.setColor(Color.red);
 
        // draw a ellipse
        g.drawOval(100, 100, 150, 100);
    }
},100,50,15,15);    
    
      g.drawOval(25,205,100,50);    
    
      g.fillOval(145,205,100,50);    
    
      g.drawOval(265,205,50,50);    
    
      g.draw3DRect(25,280,100,50,true);    
    
      g.draw3DRect(145,280,100,50,false);    
    
      g.drawArc(25,345,100,50,25,75);    
    
      g.drawArc(145,345,100,50,125,75);    
   }    
 }  

public class Main {
	public static void main(String[] args) {

	}
}