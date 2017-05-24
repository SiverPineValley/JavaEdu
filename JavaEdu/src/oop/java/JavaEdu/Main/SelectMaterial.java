package oop.java.JavaEdu.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.User;
import javax.swing.JButton;
import java.awt.GridLayout;

public class SelectMaterial extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	public SelectMaterial( User selectedUser, Chapter selectedChapter ) {
		setTitle("JavaEducation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 20, 20));
		
		JButton btnNewButton_1 = new JButton("Explanation");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Quiz");
		contentPane.add(btnNewButton);
	}

}
