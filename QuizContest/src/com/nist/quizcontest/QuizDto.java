package com.nist.quizcontest;

import java.util.List;

public class QuizDto {
	String question, correctAnswer;
	List<String> optionList;
	public QuizDto(String question, List<String> optionList, String correctAnswer) {
		this.correctAnswer=correctAnswer;
		this.question=question;
		this.optionList=optionList;
	}

}
