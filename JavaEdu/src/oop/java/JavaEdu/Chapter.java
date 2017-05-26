package oop.java.JavaEdu;

import java.util.ArrayList;

public class Chapter {
	private String chapterInfo;
	ArrayList<Quiz> quiz;
	ArrayList<Explanation> explanation;
	
	public Chapter (String chapterInfo) {
		this.chapterInfo = chapterInfo;
	}

	public String getChapterInfo() {
		return chapterInfo;
	}
	
}
