import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game3MyPlay extends JPanel {
	
	int x = 0;
	int y = 0;
	
	private void moveBallLeft(){
		x--;
	}
	private void moveBallRight(){
		x++;
	}
	private void moveBallDown(){
		y++;
	}
	private void moveBallUp(){
		y--;
	}
	private int xPosition(){
		return x;
	}
	private int yPosition(){
		return y;
	}
	
	@Override
		public void paint(Graphics g){
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.fillOval(x,y, 30, 30);
		}
		
		public static void main(String[] args) throws InterruptedException{
			JFrame frame = new JFrame("Mini Tennis");
			Game3MyPlay game = new Game3MyPlay();
			frame.add(game);
			frame.setSize(300, 400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			while(true){
				while(game.xPosition()<255){ // move ball to right edge of screen
					game.moveBallRight();
					game.repaint();
					Thread.sleep(10);
				}
				while(game.yPosition()<335){ //move ball to bottom edge of screen
					game.moveBallDown();
					game.repaint();
					Thread.sleep(10);
				}
				while(game.xPosition()>0){ //move ball to left edge of screen
					game.moveBallLeft();
					game.repaint();
					Thread.sleep(10);
				}
				while(game.yPosition()>0){ //move ball to top edge of screen
					game.moveBallUp();
					game.repaint();
					Thread.sleep(10);
				}
				while(game.xPosition()<255){
					game.moveBallRight();
					game.moveBallDown();
					game.repaint();
					Thread.sleep(10);
				}
				while(game.yPosition()>0){
					game.moveBallLeft();
					game.moveBallUp();
					game.repaint();
					Thread.sleep(10);
				}
			}
		}
}