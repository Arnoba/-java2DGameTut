import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Racquet{
	int x = 0;
	int xa = 0;
	int y = 0; //minor change to change the y positoin of racquet depending on the height of our window
	int width = 60;
	int heigth = 10;
	
	private Game game;
	
	public Racquet(Game game){
		this.game = game;
	}
	
	public void move(){
		if(x + xa > 0 && x + xa < game.getWidth()-60)
			x = x +xa;
	}
	
	public void paint(Graphics2D g){
		y = game.getHeight()-30;
		g.fillRect(x, y, width, heigth);
	}
	
	public void keyReleased(KeyEvent e){
		xa = 0;
	}
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}
	public Rectangle getBounds(){
		return new Rectangle(x,y, width, heigth);
	}
	public int getTopY(){
		return y;
	}
}