package com.srivastava.games.board;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {

	private JPanel contentPane;
	static JMenuItem contra = new JMenuItem("Contra");
	static JMenuItem mario = new JMenuItem("Mario");
	static JMenuItem login = new JMenuItem("Login");
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainScreen.class.getResource("/com/srivastava/games/board/bg.gif")));
		lblNewLabel.setBounds(10, 15, 700, 600);
		contentPane.add(lblNewLabel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu game = new JMenu("Game");
		menuBar.add(game);
		
		
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				//JOptionPane.showMessageDialog(MainScreen.this, "U Click on Login");
			}
		});
		login.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		game.add(login);
		login.setIcon(new ImageIcon(MainScreen.class.getResource("login.png")));
		JMenuItem register = new JMenuItem("Register");
		register.setIcon(new ImageIcon(MainScreen.class.getResource("register.png")));
		register.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		game.add(register);
		mario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameFrame gameFrame = new GameFrame();
				gameFrame.loadBoard();
			}
		});
		
		mario.setIcon(new ImageIcon(MainScreen.class.getResource("game.png")));
		mario.setEnabled(false);
		game.add(mario);
		
		contra.setIcon(new ImageIcon(MainScreen.class.getResource("game.png")));
		contra.setEnabled(false);
		game.add(contra);
		game.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		exit.setIcon(new ImageIcon(MainScreen.class.getResource("exit.png")));
		contra.setEnabled(false);
		game.add(exit);
		
		
		//menuBar.setBounds(6, 0, 132, 22);
		
	}
}
