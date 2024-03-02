package com.nist.quizcontest;

import java.awt.*;



import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.util.*;



import java.awt.event.*;

public class QuizFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<QuizDto> questionList= new ArrayList<QuizDto>();
	int index=0;
	int score=0;
	boolean buttoenable=true;
	JLabel questionText;
	JButton option1,option2,option3,option4;
	JLabel scoreTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizFrame frame = new QuizFrame();
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
	public QuizFrame() {
		setQuestion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		questionText = new JLabel(questionList.get(index).question);
		questionText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		questionText.setBounds(98, 41, 789, 56);
		contentPane.add(questionText);
		
		option1 = new JButton(questionList.get(index).optionList.get(0));
		
		option1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkResult(option1, 0);
				
			}
		});
		
		
		option1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option1.setBounds(114, 163, 340, 39);
		contentPane.add(option1);
		
		option2 = new JButton(questionList.get(index).optionList.get(1));
		option2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkResult(option2, 1);
				
			}
		});
		option2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option2.setBounds(493, 163, 340, 39);
		contentPane.add(option2);
		
		option3 = new JButton(questionList.get(index).optionList.get(2));
		option3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkResult(option3, 2);
			}
		});
		option3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option3.setBounds(114, 230, 340, 39);
		contentPane.add(option3);
		
		option4 = new JButton(questionList.get(index).optionList.get(3));
		option4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkResult(option4, 3);
				
			}
		});
		option4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option4.setBounds(493, 230, 340, 39);
		contentPane.add(option4);
		
		
		JButton nextButton = new JButton(">>");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!buttoenable) {
				buttoenable=true;
				index++;
				if(index<questionList.size()) {
					questionText.setText(questionList.get(index).question);
					option1.setText(questionList.get(index).optionList.get(0));
					option2.setText(questionList.get(index).optionList.get(1));
					option3.setText(questionList.get(index).optionList.get(2));
					option4.setText(questionList.get(index).optionList.get(3));
					option1.setBackground(null);
					option2.setBackground(null);
					option3.setBackground(null);
					option4.setBackground(null);
				}
				else {
					dispose();
					ScoreBoard scoreBoard=new ScoreBoard();
					scoreBoard.finalScoreTextField.setText("Congrulation your score is "+score);
					scoreBoard.setVisible(true);
				}
			}
			}
		});
		nextButton.setFont(new Font("Dialog", Font.PLAIN, 30));
		nextButton.setBounds(757, 342, 78, 39);
		contentPane.add(nextButton);
		
		JLabel lblNewLabel_1 = new JLabel("Score:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(98, 346, 105, 39);
		contentPane.add(lblNewLabel_1);
		
		scoreTextField = new JLabel("");
		scoreTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scoreTextField.setBounds(196, 346, 105, 39);
		contentPane.add(scoreTextField);
	} 
	
	public void setQuestion() {
		QuizDto q1=new QuizDto("1.Who is Father of Computer?", 
				Arrays.asList("1.Charles Babbage","2.Michal Babbage","3.Steeve Jobs","4.Mark Zukerberg"), "1.Charles Babbage");
		QuizDto q2=new QuizDto("2.Which is the biggest river of Nepal", 
				Arrays.asList("1.Koshi","2.Karnali","3.Narayani","4.Mahakali"), "1.Koshi");
		QuizDto q3= new QuizDto("3.Which is used for manufacturing chips?",
                Arrays.asList("1.Bus", "2.Control unit", "3.Semiconductors", "4.(a) and (b) only"), "3.Semiconductors");
		QuizDto q4= new QuizDto("4.The 0 and 1 in the binary numbering system are called binary digits or _____",
                Arrays.asList("1.bytes", "2.kilobytes", "3.decimal bytes", "4.bits"), "4.bits");
		QuizDto q5= new QuizDto("5.Floppy disks which are made from flexible plastic material are also called?",
                Arrays.asList("1.hard disks", "2.high-density disks", "3.diskettes", "4.templates"), "3.diskettes");
		QuizDto q6= new QuizDto("6.Which of the following is responsible for coordinating various operations using timing signals?",
                Arrays.asList("1.Arithmetic-logic Unit", "2.Control unit", "3.Memory unit", "4.Input/Output unit"),"2.Control unit");
		QuizDto q7= new QuizDto("7.All calculations are performed and all comparisons are made in _____ unit.",
                Arrays.asList("1.control unit", "2.arithmetic-logic unit", "3.central processing unit", "4.primary storage unit"), "2.arithmetic-logic unit");
		QuizDto q8= new QuizDto("8.Point out the odd item amongst the following.",
                Arrays.asList("1.Computer mouse", "2.Touchpad", "3.Light pen", "4.Printer"), "4.Printer");
		QuizDto q9= new QuizDto("9.Which of the following is a part of the Central Processing Unit?",
                Arrays.asList("1.Printer", "2.Keyboard", "3.Mouse", "4.Arithmetic Logic Unit"),"4.Arithmetic Logic Unit");
		QuizDto q10= new QuizDto("10.Which of the following is used as storage locations both in the ALU and the control section of a computer?",
                Arrays.asList("1.accumulator", "2.register", "3.adder", "4.decoder"),"2.register");
		QuizDto q11= new QuizDto("11.What is the name of the computer terminal which gives paper printout?",
                Arrays.asList("1.Display screen", "2.Soft copy terminal", "3.Hard copy terminal", "4.Plotter"),"3.Hard copy terminal");
		QuizDto q12= new QuizDto("12.Primary storage is _____ as compared to secondary storage.",
                Arrays.asList("1.Slow and inexpensive", "2.Fast and inexpensive", "3.Fast and expensive", "4.Slow and expensive"), "2.Fast and inexpensive");
		QuizDto q13= new QuizDto("13.In the IBM PC-AT, what do the words AT stand for?",
                Arrays.asList("1.Additional terminals", "2.Advance technology", "3.Applied technology", "4.Advanced terminology"), "2.Advance technology");
		QuizDto q14=  new QuizDto("14.The punched card used in the IBM System/3 contains",
                Arrays.asList("1.80 columns", "2.120 columns", "3.96 columns", "4.126 columns"), "1.80 columns");
		QuizDto q15= new QuizDto("15.Which was the first computer to use transistors instead of vacuum tubes?",
                Arrays.asList("1.Intel-650", "2.Burroughs E-101", "3.Datamatic-1000", "4.IBM-1401"), "2.Burroughs E-101");
	
		questionList.add(q1);
		questionList.add(q2);
		questionList.add(q3);
		questionList.add(q4);
		questionList.add(q5);
		questionList.add(q6);
		questionList.add(q7);
		questionList.add(q8);
		questionList.add(q9);
		questionList.add(q10);
		questionList.add(q11);
		questionList.add(q12);
		questionList.add(q13);
		questionList.add(q14);
		questionList.add(q15);
		
		
	}
	public void checkResult(JButton button,int i){
	
	if(buttoenable) {
			buttoenable=false;
		
		if(button.getText().equals(questionList.get(index).correctAnswer)) {
			button.setBackground(Color.green);	
			score=score+5;
			scoreTextField.setText(String.valueOf(score)); 
			
			}
		else {
			button.setBackground(Color.red);
			if(option1.getText().equals(questionList.get(index).correctAnswer)){
				option1.setBackground(Color.green);
				
			}
			else if(option2.getText().equals(questionList.get(index).correctAnswer)){
				option2.setBackground(Color.green);
				
			}
			else if(option3.getText().equals(questionList.get(index).correctAnswer)){
				option3.setBackground(Color.green);
				
			}
			else if(option4.getText().equals(questionList.get(index).correctAnswer)){
				option4.setBackground(Color.green);
				
			}
		}
		
	}
	}
	
	

}
