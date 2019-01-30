package com.lti.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionBankLoader {

	private QuestionBank questionBank;
	private Scanner sc;

	public QuestionBankLoader() {
		// TODO Auto-generated constructor stub

		questionBank = new QuestionBank();
	}

	public List<Question> loadQuestionsOnJava() {
		questionBank.addNewSubject("Java");
		
		Question q1 = new Question();
		q1.setQuestion("What is class?");
		questionBank.addNewQuestion("Java", q1);
		
		List<Option> options = new ArrayList<>();
		Option a1 = new Option("class is a template", true);
		Option a2 = new Option("class is a template", false);
		Option a3 = new Option("class is a template", false);
		Option a4 = new Option("class is a template", false);
		options.add(a1);
		options.add(a2);
		options.add(a3);
		options.add(a4);
		q1.setOption(options);

		q1 = new Question();
		questionBank.addNewQuestion("Java", q1);
		q1.setQuestion("What is JVM?");
	
		options = new ArrayList<>();
		a1 = new Option("Java Virtual Machine", true);
		a2 = new Option("Java Video Machine", false);
		a3 = new Option("none of above", false);
		a4 = new Option("all of above", false);
		options.add(a1);
		options.add(a2);
		options.add(a3);
		options.add(a4);
		q1.setOption(options);
		
		q1 = new Question();
		questionBank.addNewQuestion("Java", q1);
		q1.setQuestion("What is psvm?");
		
		options = new ArrayList<>();
		a1 = new Option("Public static void main", true);
		a2 = new Option("private static void main", false);
		a3 = new Option("none of above", false);
		a4 = new Option("all of above", false);
		options.add(a1);
		options.add(a2);
		options.add(a3);
		options.add(a4);

		q1.setOption(options);
		
		return questionBank.getQuestionsFor("Java");
	}

	public void startExam() {
		sc = new Scanner(System.in);
		int score = 0;
		List<Question> questions = questionBank.getQuestionsFor("Java");
	
		
		for (Question question : questions) {
			System.out.println("Q."+question.getQuestion());
//			List<Option> options=question.getOption();
			for (Option op :question.getOption()) {
				System.out.println(op.getOption());
			}

			System.out.print("\nEnter the right answer (1-4)");
			int ans = sc.nextInt();

			Option selectedOption = question.getOption().get(ans - 1);
			if (selectedOption.isRightAnswer())
				score++;
		}
		System.out.println("\n\nYou have scored " + score + "out of" + questions.size());
	}

	public static void main(String[] args) {
		QuestionBankLoader q1 = new QuestionBankLoader();
		q1.loadQuestionsOnJava();
		q1.startExam();
	}
}
