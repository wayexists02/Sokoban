package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrameKeyListener implements KeyListener {
	private SokobanManager manager = SokobanManager.getInstance();
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("asdasd");
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP :
			manager.move(KeyCode.UP);
			break;
		case KeyEvent.VK_DOWN :
			manager.move(KeyCode.DOWN);
			break;
		case KeyEvent.VK_RIGHT :
			manager.move(KeyCode.RIGHT);
			break;
		case KeyEvent.VK_LEFT :
			manager.move(KeyCode.LEFT);
			break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
