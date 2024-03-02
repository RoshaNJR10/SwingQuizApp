package com.nist.quizcontest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.Color;

public class Loader extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loader frame = new Loader();
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
	public Loader() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Quiz");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(158, 20, 481, 57);
		contentPane.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(new Color(255, 255, 255));
		progressBar.setForeground(new Color(0, 128, 0));
		progressBar.setStringPainted(true);
		progressBar.setBounds(223, 131, 433, 27);
		contentPane.add(progressBar);
		
		Thread thread=new Thread(
				()->{
					int i=0;
					while(i<=100) {
						progressBar.setValue(i);
						try {
							Thread.sleep(30);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(i==100) {
							dispose();
							MainPage mainpage=new MainPage();
							mainpage.setVisible(true);
						}
						i++;
					}
				}
				
				);
		
		thread.start();
		JLabel lblNewLabel_1 = new JLabel("Loading....");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(366, 168, 106, 27);
		contentPane.add(lblNewLabel_1);
	}
}
