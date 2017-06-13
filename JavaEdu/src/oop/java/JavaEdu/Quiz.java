package oop.java.JavaEdu;

import java.io.Serializable;

public abstract class Quiz implements Serializable {
	String quiz;
	String userAnswer;
	String answer;
	double point;
	
	public void solve(){				//Override the method
	}
	public boolean isCorrect(String ans,String ans2){			//Override the method
		if( userAnswer.equals(answer) ) return true;
		else return false;
	}
	
}
