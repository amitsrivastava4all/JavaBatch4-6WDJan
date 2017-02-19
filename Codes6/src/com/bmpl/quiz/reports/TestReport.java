package com.bmpl.quiz.reports;

import com.bmpl.quiz.questions.Question;

public class TestReport {
	
	public void printReport(Question questions[]){
		int sum = 0;
		for(Question question : questions){
			System.out.println("Q "+question.getId()
			+" "+question.getQuestion()
			+" Question Answer "+question.getRightAnswer()
			+" Your Answer "+question.getYourAnswer()
			+" Score "+question.getScore());
			sum = sum + question.getScore();
		}
		System.out.println("Total Score "+sum);
	}

}
