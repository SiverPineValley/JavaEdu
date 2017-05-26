package oop.java.JavaEdu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JOptionPane;

public class User implements Serializable {
	private double[] quizPoint;
	private String name;
	private String id;
	private String password;

	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public double[] getQuizPoint() {
		return quizPoint;
	}

	public void setQuizPoint(double[] quizPoint) {
		this.quizPoint = quizPoint;
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
