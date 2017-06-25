package com.srivastava.games.board;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Login.this.setVisible(false);
				Login.this.dispose();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Lucida Grande", Font.BOLD, 32));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(122, 6, 192, 85);
		contentPane.add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("Userid");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setBounds(32, 103, 86, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblPasssword = new JLabel("Password");
		lblPasssword.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblPasssword.setBounds(32, 148, 86, 33);
		contentPane.add(lblPasssword);
		
		textField = new JTextField();
		textField.setBounds(110, 103, 204, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 152, 192, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLogin();
			}
		});
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/com/srivastava/games/board/login.png")));
		btnLogin.setBounds(50, 193, 126, 59);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setIcon(new ImageIcon(Login.class.getResource("/com/srivastava/games/board/exit.png")));
		btnCancel.setBounds(188, 197, 117, 55);
		contentPane.add(btnCancel);
	}
	private void checkLogin(){
		String userid = textField.getText();
		String password = passwordField.getText();
		if(userid.equals(password)){
			JOptionPane.showMessageDialog(this, "U Login SuccessFully...");
			this.setTitle("Welcome "+userid);
			MainScreen.mario.setEnabled(true);
			MainScreen.contra.setEnabled(true);
			MainScreen.login.setEnabled(false);
			this.setVisible(false);
			this.dispose();
		}
	}
}
