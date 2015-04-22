import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game2 extends JPanel{
	
	@Override
		public void paint(Graphics g){ //takes a Graphic as paramenter Graphics2D is compatible with more methods
			Graphics2D g2d = (Graphics2D) g; //type casts to graphic2D
			g2d.setColor(Color.RED); //sets color to red
			g2d.fillOval(0, 0, 30, 30); //draws a filled circul (x value, y value, heigth, width)
			g2d.drawOval(0, 50, 30, 30);//draw a circle 
			g2d.fillRect(50, 0, 30, 30);
			g2d.drawRect(50, 50, 30, 30);
			
			g2d.draw(new Ellipse2D.Double(0, 100, 30, 30)); //another way of painting create a ellipse2D object with paramenters and call draw method
		}
		
		public static void main(String[] args){
			JFrame frame = new JFrame("Mini Tennis");
			frame.add(new Game2());
			frame.setSize(300, 300);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}