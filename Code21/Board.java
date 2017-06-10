import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	Ball ball;
	Timer timer;
	Board(){
		setBackground(Color.BLACK);
		setSize(GWIDTH, GHEIGHT);
		ball = new Ball(10,100);
		gameLoop();
		
	}
	
	private void gameLoop(){
		ActionListener l = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ee){
				repaint();
			}
		};
		timer = new Timer(DELAY,l);
		timer.start();
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.RED);
		g.fillOval(ball.getX(),ball.getY(),ball.getW(),ball.getH());
		ball.move();
		//g.drawRect(100, 100, 500, 500);
		// Logic for Painting
	}

}
