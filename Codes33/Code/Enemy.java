package com.srivastava.games.board;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.srivastava.games.common.GameConstants;

public class Enemy extends Sprite {
	
	public Enemy(int x, int y,String imageName){
		this.y = GameConstants.FLOOR+y;
		this.x = x;
		h = w = 100;
		speed  = -5;
		img = new ImageIcon(Player.class.getResource(imageName)).getImage();
	}
	
	
	public void drawEnemy(Graphics2D g){
		g.drawImage(img, x,y,w,h,null);
	}
	
	

}
