package com.srivastava.games.board;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class GameSplashScreen extends JWindow {

	private JPanel contentPane;
	private Timer timer ;
	JLabel lblNewLabel_1 = new JLabel("GAME - 2017");
	JProgressBar progressBar = new JProgressBar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameSplashScreen frame = new GameSplashScreen();
					frame.setVisible(true);
					frame.doAnimation();
	}
	boolean isVisible = false;
	int color = 1;
	Color colorValue;
	int progressValue = 1;
	void doAnimation(){
		timer = new Timer(10,(e)->{
			if(progressValue>=100){
				timer.stop();
				MainScreen ms = new MainScreen();
				ms.setVisible(true);
				GameSplashScreen.this.setVisible(false);
				
			}
			progressBar.setValue(progressValue);
			progressValue++;
			if(isVisible){
				switch(color){
				case 1:
					colorValue = Color.RED;
				break;	
				case 2:
					colorValue = Color.GREEN;
				break;
				case 3:
					colorValue = Color.YELLOW;
				break;
				case 4:
					colorValue = Color.BLUE;
				break;
				case 5:
					colorValue = Color.ORANGE;
				break;
				case 6:
					colorValue = Color.BLACK;
				break;
				case 7:
					colorValue = Color.WHITE;
				break;
				}
				color++;
				if(color>=7){
					color = 1;
				}
				lblNewLabel_1.setForeground(colorValue);
			}
			lblNewLabel_1.setVisible(isVisible);
			isVisible = !isVisible;
		});
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public GameSplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 398);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBackground(new Color(102, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GameSplashScreen.class.getResource("/com/srivastava/games/board/giphy.gif")));
		lblNewLabel.setBounds(21, 16, 479, 235);
		contentPane.add(lblNewLabel);
		
		
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 32));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(196, 269, 276, 35);
		contentPane.add(lblNewLabel_1);
		
		
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		progressBar.setStringPainted(true);
		progressBar.setBounds(22, 316, 478, 39);
		contentPane.add(progressBar);
		UIManager.put("ProgressBar.background", Color.ORANGE);
		UIManager.put("ProgressBar.foreground", Color.BLUE);
		UIManager.put("ProgressBar.selectionBackground", Color.RED);
		UIManager.put("ProgressBar.selectionForeground", Color.GREEN);
	}
}
