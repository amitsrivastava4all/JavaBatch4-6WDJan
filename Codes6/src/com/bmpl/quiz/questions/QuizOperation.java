package com.bmpl.quiz.questions;

import java.util.Scanner;

public class QuizOperation {
	Question questions[] = new Question[2];
	
	public Question[] getQuestions(){
		return questions;
	}
	public QuizOperation(){
		this.prepareQuiz();
	}
		private Question[] prepareQuiz(){
		
		Question question = new Question();
		question.setId(1);
		question.setQuestion("JVM Stands for");
		String options[] = {"a)  Java Virtual Machine",
				"b) Java Vital Machine",
				"c) JavaScript Virtual Machine",
				"d) None of these" };
		question.setOptions(options);
		question.setRightAnswer("a");
		questions[0] = question;
		
		Question question2 = new Question();
		question2.setId(2);
		question2.setQuestion("JRE Stands for");
		 String optionsArr[] = {"a)  Java Run Enterprise",
				"b) Java Runtime Env",
				"c) JavaScript Runtime Env",
				"d) None of these" };
		question2.setOptions(optionsArr);
		question2.setRightAnswer("b");
		questions[1] = question2;
		return questions;
	}
	
	public void askQuestion(int index){
		//Question[] questions= this.prepareQuiz();
		Question question = questions[index];
		System.out.println("Q"+question.getId()+" "+question.getQuestion());
		for(String option : question.getOptions()){
			System.out.println(option);
		}
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your answer");
		String yourAnswer = String.valueOf(scanner.next().charAt(0));
		question.setYourAnswer(yourAnswer);
		if(question.getRightAnswer().equals(yourAnswer)){
			question.setScore(5);
			System.out.println("Right Answer...");
		}
		else
		{
			System.out.println("Wrong Answer...");
			
		}
	}
}
