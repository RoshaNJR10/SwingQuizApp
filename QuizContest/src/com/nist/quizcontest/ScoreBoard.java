package com.nist.quizcontest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class ScoreBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel finalScoreTextField ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreBoard frame = new ScoreBoard();
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
	public ScoreBoard() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		finalScoreTextField = new JLabel("");
		finalScoreTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		finalScoreTextField.setBounds(116, 89, 416, 57);
		contentPane.add(finalScoreTextField);
	}
}
