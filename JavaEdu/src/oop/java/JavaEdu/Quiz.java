package oop.java.JavaEdu;

public abstract class Quiz extends Chapter {
	String quiz;
	String userAnswer;
	String answer;
	double point;
	
	public void solve(){				//Override the method
	}
	public boolean isCorrect(){			//Override the method
		if( userAnswer.equals(answer) ) return true;
		else return false;
	}
	
}
