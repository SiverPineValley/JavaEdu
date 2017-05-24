package oop.java.JavaEdu.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.JavaEdu;
import oop.java.JavaEdu.User;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectChapter extends JFrame {

	private JPanel contentPane;
	public SelectChapter( User enteredUser ) {
		setTitle("JavaEducation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 5, 484, 406);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Class and Object");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().classeObject;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Inheritance");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().inheritance;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Polymorphism");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().polymorphism;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Abstract Class");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().abstractClass;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_4 = new JButton("Interface");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().interfaces;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_5 = new JButton("GUI");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().gui;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_6 = new JButton("File IO");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Chapter selectedChapter = new JavaEdu().fileIO;
				new SelectMaterial( enteredUser, selectedChapter ).setVisible(true);
				dispose();
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(188, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_6)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_5))
					.addGap(165))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(41)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(18)
					.addComponent(btnNewButton_2)
					.addGap(18)
					.addComponent(btnNewButton_3)
					.addGap(18)
					.addComponent(btnNewButton_4)
					.addGap(18)
					.addComponent(btnNewButton_5)
					.addGap(18)
					.addComponent(btnNewButton_6)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

}
