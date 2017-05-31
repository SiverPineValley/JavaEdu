package oop.java.JavaEdu;

import java.util.ArrayList;

public class Chapter {
	private String chapterInfo;
	private ArrayList<Quiz> quiz;
	private Explanation explanation;
	
	public ArrayList<Quiz> getQuiz() {
		return quiz;
	}

	public void setQuiz(ArrayList<Quiz> quiz) {
		this.quiz = quiz;
	}

	public Explanation getExplanation() {
		return explanation;
	}

	public Chapter (String chapterInfo) {
		this.chapterInfo = chapterInfo;
	}
	
	public String getChapterInfo() {
		return chapterInfo;
	}
	
}
