package com.srivastava.games.board;

import java.awt.Graphics2D;

import javax.swing.ImageIcon;

import com.srivastava.games.common.GameConstants;

public class Fruit extends Sprite {
	public Fruit(int x, String imageName){
		y = GameConstants.FLOOR;
		this.x = x;
		h = w = 100;
		speed  = 0;
		img = new ImageIcon(Player.class.getResource(imageName)).getImage();
	
	}
	public void drawFruit(Graphics2D g){
		g.drawImage(img, x,y,w,h,null);
	}
	public void left(){
		speed = GameConstants.CAMERA_SPEED;
		move();
		
	}
	public void right(){
		speed = -GameConstants.CAMERA_SPEED;
		move();
		
	}
}
