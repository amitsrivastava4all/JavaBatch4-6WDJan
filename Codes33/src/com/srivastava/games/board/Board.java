package com.srivastava.games.board;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.srivastava.games.common.GameConstants;

public class Board extends JPanel implements GameConstants {
	Player player;
	Camera camera;
	public Board(){
		setSize(GWIDTH,GHEIGHT);
		setDoubleBuffered(true);
		//setFocusable(true);
		camera = new Camera();
		loadImage();
		gameLoop();
		player = new Player();
		
		//this.requestFocusInWindow(true);
//		setFocusable(true);
//		setRequestFocusEnabled(true);
//		this.grabFocus();
		//bindEvent();
		
		
	}
	
	
	 void bindEvent(){
		this.setFocusable(true);
		this.requestFocusInWindow();
 this.addKeyListener(new KeyAdapter() {
			
			
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
				camera.right();
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_LEFT){	
					camera.left();
				}
				System.out.println(" Pressed "+e.getKeyCode()+" "+e.getKeyChar());
				
			}
		});
	}
	
	private Timer timer;
	
	private void gameLoop(){
		timer = new Timer(DELAY, (e)->{
			repaint();
		});
		timer.start();
	}
	
	private Image image ;
	void loadImage(){
		try {
			image = ImageIO.read(Board.class.getResource("gboard.jpg")).getSubimage(camera.getX(),0,GWIDTH,GHEIGHT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//image = new  
		//image = new ImageIcon(Board.class.getResource("board.jpg")).getImage();
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D) g;
		drawBackGround(twoD);
		player.drawPlayer(twoD);
		//System.out.println("Paint Call");
	}
	
	private void drawBackGround(Graphics2D g){
		loadImage();
		g.drawImage(image, 0,0,GWIDTH,GHEIGHT ,null);
		//System.out.println("Draw....");
	}
}
