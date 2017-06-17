package com.srivastava.games.board;

import com.srivastava.games.common.GameConstants;

public class Camera {
	private int x;
	private int speed = GameConstants.CAMERA_SPEED;
	public void moveCamera(){
		x = x + speed;
	}
	public void left(){
		speed = -GameConstants.CAMERA_SPEED;
		moveCamera();
	}
	public void right(){
		speed = GameConstants.CAMERA_SPEED;
		moveCamera();
	}
	public int getX(){
		return x;
	}
	

}
