package com.lti.questions;

import java.util.List;

public class Question

{
	private String question;
	private List<Option>option;   // we can write collection to achieve abstraction
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Option> getOption() {
		return option;
	}
	public void setOption(List<Option> option) {
		this.option = option;
	}
	
	public Question(String question, List<Option> option) {
		super();
		this.question = question;
		this.option = option;
	}
}
