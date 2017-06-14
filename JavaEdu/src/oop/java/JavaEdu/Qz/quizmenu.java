package oop.java.JavaEdu.Qz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
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
		
	
		
		selectedUser = UserManage.EditUser(selectedUser,0,(double)selectedUser.getQuizPoint(0));
		selectedUser = UserManage.EditUser(selectedUser,1,(double)selectedUser.getQuizPoint(1));
		selectedUser = UserManage.EditUser(selectedUser,2,(double)selectedUser.getQuizPoint(2));

		JButton btnmultiple = new JButton("multiple choice");
		btnmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new multiple(s,selectedUser).getFrame().setVisible(true);
				frame.dispose();
				
			}
		});
		
		JButton btnshortans = new JButton("short answer");
		btnshortans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new shortans(s,selectedUser).getSframe().setVisible(true);
				frame.dispose();
			}
		});
		
		JButton btnox = new JButton("O X");
		btnox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnox){
					new ox(s,selectedUser).getOframe().setVisible(true);
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
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(305, Short.MAX_VALUE)
					.addComponent(btnmultiple))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(305, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBack)
						.addComponent(btnox)
						.addComponent(btnshortans))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnmultiple)
					.addGap(18)
					.addComponent(btnshortans)
					.addGap(18)
					.addComponent(btnox)
					.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}