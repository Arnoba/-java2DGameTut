import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class game5 extends JPanel{
	
	public game5(){
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Mini Tennnis");
		game5 keyboardExample = new game5();
		frame.add(keyboardExample);
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e){
		}
			
		@Override
		public void keyPressed(KeyEvent e){
			System.out.println("keyPressed = " + KeyEvent.getKeyText(e.getKeyCode()));
		}
			
		@Override
		public void keyReleased(KeyEvent e){
			System.out.println("keyReleased = " +KeyEvent.getKeyText(e.getKeyCode()));
		}	
	}
}