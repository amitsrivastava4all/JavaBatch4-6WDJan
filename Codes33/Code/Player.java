package com.srivastava.games.board;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.srivastava.games.common.GameConstants;

public class Player extends Sprite {
	int ySpeed ;
	boolean isJump ;
	public Player(){
		y = GameConstants.FLOOR;
		x = 100;
		h = w = 100;
		speed  = 1;
		img = new ImageIcon(Player.class.getResource("mario.gif")).getImage();
	}
	public void drawPlayer(Graphics2D g){
		g.drawImage(img, x,y,w,h,null);
	}
	
	public void jump(){
		if(!isJump){
		ySpeed = -25;
		y = y + ySpeed;
		isJump = true;
		}
	}
	public void fall(){
		if(y<=GameConstants.FLOOR){
		speed = 5;	
		ySpeed = ySpeed + GameConstants.GRAVITY;
		y = y + ySpeed;
		x =  x+ speed;
		}
		else
		if(y>=GameConstants.FLOOR){
			isJump = false;
			speed = 1;
		}
	}
	
}
