package oop.java.JavaEdu.Qz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.CoreData;
import oop.java.JavaEdu.Quiz;
import oop.java.JavaEdu.User;
import oop.java.JavaEdu.Main.MainFrame;
import oop.java.JavaEdu.*;
import oop.java.JavaEdu.FileIO.*;

public class quizmenu extends Quiz {

	private JPanel contentPane;
	private JFrame frame = new JFrame();
	private User selectedUser;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public quizmenu(String s, User selectedUser_input) {
		this.selectedUser = selectedUser_input;

		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);

		int chaptertype;
		if (s.equals("Class and Object"))
			chaptertype = 0;
		else if (s.equals("Inheritance"))
			chaptertype = 1;
		else if (s.equals("Polymorphism"))
			chaptertype = 2;
		else if (s.equals("Abstraction Class and Interfaces"))
			chaptertype = 3;
		else if (s.equals("GUI"))
			chaptertype = 4;
		else
			chaptertype = 5;

		JButton btnmultiple = new JButton("multiple choice");
		btnmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedUser.getQuizPoint(chaptertype, 0) >= 2)
					JOptionPane.showMessageDialog(null, "You reach the top score in multiple choice", "Invalid",
							JOptionPane.INFORMATION_MESSAGE);
				else {
					new multiple(s, selectedUser, chaptertype).getFrame().setVisible(true);
					frame.dispose();
				}
			}
		});

		JButton btnshortans = new JButton("short answer");
		btnshortans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedUser.getQuizPoint(chaptertype, 1) >= 2)
					JOptionPane.showMessageDialog(null, "You reach the top score in short answer", "Invalid",
							JOptionPane.INFORMATION_MESSAGE);
				else {
					new shortans(s, selectedUser, chaptertype).getSframe().setVisible(true);
					frame.dispose();
				}
			}
		});

		JButton btnox = new JButton("O X");
		btnox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedUser.getQuizPoint(chaptertype, 2) >= 2)
					JOptionPane.showMessageDialog(null, "You reach the top score in O X", "Invalid",
							JOptionPane.INFORMATION_MESSAGE);
				else {
					new ox(s, selectedUser, chaptertype).getOframe().setVisible(true);
					frame.dispose();
				}

			}
		});

		JButton btnBack = new JButton("Exit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(305, Short.MAX_VALUE)
						.addComponent(btnmultiple))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(305, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnBack)
								.addComponent(btnox).addComponent(btnshortans))
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnmultiple).addGap(18)
						.addComponent(btnshortans).addGap(18).addComponent(btnox)
						.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE).addComponent(btnBack)
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

}