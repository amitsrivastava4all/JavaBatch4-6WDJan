package com.srivastava.games.board;

import java.awt.Color;
import java.awt.Font;
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
	Enemy dragon;
	Enemy dragon2;
	Hurdle hurdles [] = new Hurdle[5];
	Fruit fruits [] = new Fruit[5];
	
	private void prepareFruits(){
		String fruit = "fruit.png";
		int pos = GWIDTH - 300;
		for(int i = 0 ; i<fruits.length ; i++){
			fruit = i%2==0?"fruit.png":"fruit2.png";
			fruits[i] = new Fruit(pos, fruit);
			pos +=300;
			
		}
	}
	
	private void prepareHurdles(){
		String fire = "fire.gif";
		int pos = GWIDTH - 500;
		for(int i = 0 ; i<hurdles.length ; i++){
			
			hurdles[i] = new Hurdle(pos, fire);
			pos +=500;
			
		}
	}
	
	public Board(){
		setSize(GWIDTH,GHEIGHT);
		setDoubleBuffered(true);
		//setFocusable(true);
		camera = new Camera();
		loadImage();
		gameLoop();
		player = new Player();
		dragon = new Enemy(GWIDTH,0,"dragon.gif");
		dragon2 = new Enemy(GWIDTH+400,10, "dragon2.gif");
		prepareFruits();
		prepareHurdles();
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
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					player.jump();
					
				}
				
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
				camera.right();
				// fruit right
				for(Fruit fruit: fruits){
					fruit.right();
				}
				
				
				for(Hurdle hurdle: hurdles){
					hurdle.right();
				}
				
				}
				else
				if(e.getKeyCode()==KeyEvent.VK_LEFT){	
					camera.left();
					for(Fruit fruit: fruits){
						fruit.left();
					}
					
					
					for(Hurdle hurdle: hurdles){
						hurdle.left();
					}
				}
				System.out.println(" Pressed "+e.getKeyCode()+" "+e.getKeyChar());
				
			}
		});
	}
	
	private Timer timer;
	
	public boolean checkCollision(Player player , Enemy enemy){
		int xDistance = Math.abs(enemy.getX() - player.getX());
		int yDistance = Math.abs(enemy.getY() - player.getY());
		return xDistance<=(player.getW()-50) && yDistance<=(player.getH()-50);
	}
	
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
	
	private void gameOver(Graphics2D twoD){
		String message = "Game Over";
		twoD.setColor(Color.RED);
		twoD.setFont(new Font("Arial",Font.BOLD,32));
		twoD.drawString(message, GWIDTH/2-message.length(), GHEIGHT/2);
		timer.stop();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D) g;
		drawBackGround(twoD);
		player.drawPlayer(twoD);
		dragon.drawEnemy(twoD);
		dragon.move();
		dragon2.drawEnemy(twoD);
		dragon2.move();
		player.fall();
		if(checkCollision(player,dragon)||checkCollision(player,dragon2)){
			gameOver(twoD);
		}
		
		//System.out.println("Paint Call");
		
		//Print Fruits
		for(Fruit fruit:fruits){
			fruit.drawFruit(twoD);
		}
		
		
		// Print Hurdles
		for(Hurdle hurdle : hurdles){
			hurdle.drawHurdle(twoD);
		}
	}
	
	
	
	private void drawBackGround(Graphics2D g){
		loadImage();
		g.drawImage(image, 0,0,GWIDTH,GHEIGHT ,null);
		//System.out.println("Draw....");
	}
}
