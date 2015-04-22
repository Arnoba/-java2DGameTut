import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class game5AnonClass extends JPanel{
	
	public game5AnonClass(){
		KeyListener listener = new KeyListener(){ //creating object aswell as defining keylistener override in one command
			@Override							//Only usuable once and since it has no name called anonyimus class	
			public void keyTyped(KeyEvent e){
			}
			
			@Override
			public void keyPressed(KeyEvent e){
				System.out.println("KeyPressed = " + KeyEvent.getKeyText(e.getKeyCode()));
			}
			@Override
			public void keyReleased(KeyEvent e){
				System.out.println("KeyReleased = " + KeyEvent.getKeyText(e.getKeyCode()));
			}
		};
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Mini Tennis");
		game5AnonClass example = new game5AnonClass();
		frame.add(example);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}