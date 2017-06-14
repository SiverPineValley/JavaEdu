package oop.java.JavaEdu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class User implements Serializable {
	/*
	 * Quiz type
	 * 0 = multiple
	 * 1 = shortans
	 * 2 = ox
	 */
	private int[][] quizPoint = new int[6][3];
	private int[] chapterProgress = new int[6];
	private String name;
	private String id;
	private String password;

	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public User(){}

	public int getQuizPoint(int chapter, int type) {
		return quizPoint[chapter][type];
	}

	public void setQuizPoint(int quizPoint, int chapter, int type) {
		this.quizPoint[chapter][type] = quizPoint;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if ((id != null) && (id.length() == 9))
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() >= 6 || password.length() <= 13)
			this.password = password;
	}

}
