package com.lti.jsp.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionBankLoader {

	private QuestionBank questionBank;

	public QuestionBankLoader() {
		questionBank = new QuestionBank();
	}
	

	public List<Question>loadQuestionsOnJava() {
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
		
		q1 = new Question();
		questionBank.addNewQuestion("Java", q1);
		q1.setQuestion("Can abstract methods be in a non abstarct class?");
	
		options = new ArrayList<>();
		a1 = new Option("Yes, they can be defined", false);
		a2 = new Option("No", true);
		a3 = new Option("Depends wether the class is abstract or not", false);
		a4 = new Option("all of above", false);
		options.add(a1);
		options.add(a2);
		options.add(a3);
		options.add(a4);
		q1.setOption(options);
		
		q1 = new Question();
		questionBank.addNewQuestion("Java", q1);
		q1.setQuestion("Which constructor is called if three calsses extend each other and the second derived class is called?");
	
		options = new ArrayList<>();
		a1 = new Option("The most super class of all", true);
		a2 = new Option("Object class", false);
		a3 = new Option("Immidiate Parent", false);
		a4 = new Option("none of above", false);
		options.add(a1);
		options.add(a2);
		options.add(a3);
		options.add(a4);
		q1.setOption(options);
		
		return questionBank.getQuestionsFor("Java") ;
		

	}
}