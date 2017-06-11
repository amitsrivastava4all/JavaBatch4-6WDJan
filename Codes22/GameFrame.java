import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;


public class GameFrame extends JFrame implements GameConstants {

	GameFrame(){
		setSize(GWIDTH, GHEIGHT);
		setTitle("Game-2017");
		setVisible(true);
		setLocationRelativeTo(null);
		Board board = new Board();
		this.add(board);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();
		Toolkit.getDefaultToolkit().sync();
		
	}

}
