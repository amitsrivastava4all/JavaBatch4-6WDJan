package com.srivastava.games.board;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.srivastava.games.common.GameConstants;

public class Player {
	private int x;
	private int y;
	private int w;
	private int h;
	private int speed;
	private Image img;
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
	
}
