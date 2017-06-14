package oop.java.JavaEdu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.FileIO.UserManage;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Progress extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	private User selectedusr;
	
	public Progress(User usr, Chapter chpt, int lastpage) {
		
		this.selectedusr = usr;
		selectedusr = UserManage.searchUser(selectedusr.getId());
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		int chaptertype;
		if (chpt.getChapterInfo().equals("Class and Object")) chaptertype = 0;
		else if (chpt.getChapterInfo().equals("Inheritance")) chaptertype = 1;
		else if (chpt.getChapterInfo().equals("Polymorphism")) chaptertype = 2;
		else if (chpt.getChapterInfo().equals("Abstraction Class and Interfaces")) chaptertype = 3;
		else if (chpt.getChapterInfo().equals("GUI")) chaptertype = 4;
		else chaptertype = 5;
		
		JLabel lblId = new JLabel("ID: "+usr.getId());
		
		JLabel lblName = new JLabel("Name: "+usr.getName());
		
		JLabel lblSelectedChapter = new JLabel("Selected Chapter: "+chpt.getChapterInfo());
		
		JLabel lblOx = new JLabel("OX Choice Stored Score: " + + selectedusr.getQuizPoint(chaptertype, 2));
		
		JLabel lblMultiple = new JLabel("Multiple Choice Stored Score: " + selectedusr.getQuizPoint(chaptertype, 0));
		 
		JLabel lblShortans = new JLabel("Short Answer Stored Score: "+ selectedusr.getQuizPoint(chaptertype, 1));
		int total = selectedusr.getQuizPoint(chaptertype, 0) +  selectedusr.getQuizPoint(chaptertype, 1) + + selectedusr.getQuizPoint(chaptertype, 2);
		JLabel lblTotal = new JLabel("Total Stored Score: "+ total);
		
		JLabel lblPage = new JLabel("Last View Page: "+lastpage);
		
		JLabel lblProgress = new JLabel("Progress");
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTotal)
							.addPreferredGap(ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
							.addComponent(btnBack))
						.addComponent(lblOx)
						.addComponent(lblShortans)
						.addComponent(lblMultiple)
						.addComponent(lblPage)
						.addComponent(lblSelectedChapter)
						.addComponent(lblName)
						.addComponent(lblId)
						.addComponent(lblProgress))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProgress)
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(lblId)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSelectedChapter)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPage)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMultiple)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblShortans)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOx)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotal)
						.addComponent(btnBack))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
