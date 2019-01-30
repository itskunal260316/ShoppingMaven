package com.lti.day6;

public class Option {

	private String option;

	public Option() {
		// default
	}

	public Option(String option, boolean isRightAnswer) {
		super();
		this.option = option;
		this.isRightAnswer = isRightAnswer;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public boolean isRightAnswer() {
		return isRightAnswer;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}

	private boolean isRightAnswer;
}
