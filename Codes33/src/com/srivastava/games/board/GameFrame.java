package com.srivastava.games.board;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.srivastava.games.common.GameConstants;

public class GameFrame extends JFrame implements GameConstants {
	public GameFrame(){
		setResizable(false);
		setSize(GWIDTH, GHEIGHT);
		setLocationRelativeTo(null);
setTitle("Game-2017");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		

	}
	
	public void loadBoard(){
		Board board = new Board();
		this.add(board);
		board.bindEvent();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();
		obj.loadBoard();

	}

}
