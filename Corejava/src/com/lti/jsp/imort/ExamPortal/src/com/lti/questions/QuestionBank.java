package com.lti.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {

	private Map<String, List<Question>> questionsBank;

	public QuestionBank() {
		questionsBank = new HashMap<>();
	}

	public void addNewSubject(String subject) {
		questionsBank.put(subject, new ArrayList<>());
	}

	public void addNewQuestion(String subject, Question question) {
		List<Question> questionList = questionsBank.get(subject);
		questionList.add(question);
	}

	public List<Question> getQuestionsFor(String subject) {
		return questionsBank.get(subject);
	}

}
