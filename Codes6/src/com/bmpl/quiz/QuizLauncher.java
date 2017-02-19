package com.bmpl.quiz;

import com.bmpl.quiz.common.Message;
import com.bmpl.quiz.questions.QuizOperation;
import com.bmpl.quiz.reports.TestReport;
import com.bmpl.quiz.users.UserOperations;

public class QuizLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserOperations userOper = new UserOperations();
		Message message= userOper.isLogin();
		if(message.isStatus()){
			System.out.println(message.getMessage()+" "+message.getUser());
			QuizOperation quizOpr = new QuizOperation();
			quizOpr.askQuestion(0);
			quizOpr.askQuestion(1);
			TestReport report = new TestReport();
			report.printReport(quizOpr.getQuestions());
		}
		else
		{
			System.out.println(message.getMessage());
		}
		

	}

}
