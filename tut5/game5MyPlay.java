import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


@SuppressWarnings("serial")
public class game5MyPlay extends JPanel{
	
	Ball ball = new Ball(this);
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
	}

	public game5MyPlay(){
		KeyListener listener = new KeyListener(){ 
			@Override						
			public void keyTyped(KeyEvent e){
			}
			
			@Override
			public void keyPressed(KeyEvent e){
				System.out.println("KeyPressed = " + KeyEvent.getKeyText(e.getKeyCode()));
				switch (e.getKeyCode()){ //switch statement checking which arror key was pressed and runs its code 
					case KeyEvent.VK_LEFT:
            			ball.moveBallLeft();
            			break;
            		case KeyEvent.VK_RIGHT:
            			ball.moveBallRight();
            			break;
            		case KeyEvent.VK_UP:
            			ball.moveBallUp();
            			break;
            		case KeyEvent.VK_DOWN:
            			ball.moveBallDown();
            			break;
				}
			}
			@Override
			public void keyReleased(KeyEvent e){
				System.out.println("KeyReleased = " + KeyEvent.getKeyText(e.getKeyCode()));
			}
		};
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
		game5MyPlay game = new game5MyPlay(); //create new instance of our game5MyPlay class
		frame.add(game); //add it on our frame
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) { //infinte loop which constantly repaints
			game.repaint();
			Thread.sleep(10);
		}
	}
	
	public class Ball {
		int x = 0;
		int y = 0;
	
		private game5MyPlay game;
	
		public Ball(game5MyPlay game) {
			this.game= game;
		}
	
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

		public void paint(Graphics2D g) {
			g.fillOval(x, y, 30, 30);
		}
	}
}