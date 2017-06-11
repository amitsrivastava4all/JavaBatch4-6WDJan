import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants {
	Ball ball;
	Timer timer;
	Ball balls[] = new Ball[MAX_BALL];
	Board(){
		setBackground(Color.BLACK);
		setSize(GWIDTH, GHEIGHT);
		prepareBalls();
		//ball = new Ball(10,100);
		bindEvents();
		gameLoop();
		
	}
	int mousex,mousey;
	private void bindEvents(){
		this.setFocusable(true);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				mousex = e.getX();
				mousey = e.getY();
				repaint();
				//System.out.println("X is "+x+" and y is "+y);
			}
		});
	}
	
	private void prepareBalls(){
		for(int i = 0; i<MAX_BALL ; i++){
			ball = new Ball(Util.getRandomNo(500),Util.getRandomNo(500));
			balls[i]=ball;
			//System.out.println(Util.getRandomNo(100));
		}
	}
	
	private void gameLoop(){
		ActionListener l = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ee){
				//repaint();
			}
		};
		timer = new Timer(DELAY,l);
		timer.start();
	}
	
	private void drawBall(Graphics g){
		for(Ball b : balls){
			if(b.isVisible()){
			g.setColor(b.getColor());
			g.fillOval(b.getX(),b.getY(),b.getW(),b.getH());
			b.move();
			}
		}
	}
	
	
	private void printScore(Graphics g){
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Arial",Font.BOLD,32));
		g.drawString("Score is ", 700, 100);
	}
	
	private void checkCollsion(){
		for(int i = 0; i<balls.length-1; i++){
			for(int j = i + 1 ; j<balls.length; j++){
				if(balls[i].isVisible() && isCollision(balls[i], balls[j])){
					balls[i].setVisible(false);
					balls[j].setVisible(false);
					System.out.println(" i "+ i + " J is "+j);
					break;
				}
			}
		}
	}
	
	
	
	private boolean isCollision(Ball one, Ball two){
		int ballWidth = one.getW();
		int radius = one.getW()/2;
		int firstBallX = one.getX() + radius;
		int firstBallY  = one.getY() + radius;
		int secondBallX = two.getX() + radius ;
		int secondBallY = two.getY() + radius;
		return Point2D.distance(firstBallX, firstBallY, secondBallX, secondBallY)<=ballWidth;
		
		
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		g.fillOval(mousex,mousey,50,50);
		//drawBall(g);
		//checkCollsion();
		//printScore(g);
		//g.fillOval(ball.getX(),ball.getY(),ball.getW(),ball.getH());
		//ball.move();
		//g.drawRect(100, 100, 500, 500);
		// Logic for Painting
	}

}
