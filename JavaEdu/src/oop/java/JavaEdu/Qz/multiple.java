package oop.java.JavaEdu.Qz;

import java.awt.BorderLayout;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.*;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class multiple extends Quiz {

	private JPanel contentPane;
	private int mscore;
	private String mimage;
	private JFrame frame = new JFrame();
	private Image img;
	private User selectedUser;
	private int run;
	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public multiple(String s, User selectedUser_input) 
	{
		this.mscore = CoreData.progress_mvalue;
		this.run = CoreData.runvalue;
		this.selectedUser = selectedUser_input;
		frame.setBounds(100, 100, 835, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "name_1211675886542913");
		JLabel lblQ = new JLabel("Q1");
		
		JRadioButton rdbtnA_1 = new JRadioButton("A");
		
		JRadioButton rdbtnB_1 = new JRadioButton("B");
		
		JRadioButton rdbtnC_1 = new JRadioButton("C");
		
		JRadioButton rdbtnD_1 = new JRadioButton("D");
		
		JRadioButton rdbtnE_1 = new JRadioButton("E");
		
		JTextArea txtrWhichOneHolds = new JTextArea();
		JTextArea txtrWhichOneStores = new JTextArea();
	
		JPanel mpanel_1 = new JPanel();

		if (s.equals("Class and Object")) {
			txtrWhichOneHolds.setText("Which one holds bits that represent a way of accessing an object stored in memory (heap)?\r\nA. Reference Variable\r\nB. Base type Variable\r\nC. Integer\r\nD. JVM\r\nE. Boolean");	
			txtrWhichOneStores.setText("Which one stores a numbered list of variables (base types or references).\r\nA. Short\r\nB. Double\r\nC. Integer\r\nD. Array\r\nE. Boolean");
		}
		
		if(s.equals("Inheritance")){
			txtrWhichOneHolds.setText("Inheritance Question1?\r\nA. sample\r\nB. sample\r\nC. sample\r\nD. sample\r\nE. sample");	
			txtrWhichOneStores.setText("Inheritance Question2?.\r\nA. sample\r\nB. sample\r\nC. sample\r\nD. sample\r\nE. sample");
		}
		
		mpanel_1.setToolTipText("");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblQ)
										.addPreferredGap(ComponentPlacement.RELATED, 717, Short.MAX_VALUE)
										.addComponent(rdbtnA_1))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(mpanel_1, GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
										.addGap(18)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
											.addComponent(rdbtnB_1, Alignment.TRAILING)
											.addComponent(rdbtnD_1, Alignment.TRAILING))))
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
								.addComponent(rdbtnC_1)
								.addContainerGap()))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(rdbtnE_1)
							.addContainerGap())))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(rdbtnA_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnB_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnC_1)
							.addGap(2)
							.addComponent(rdbtnD_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnE_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblQ)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(mpanel_1, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		GroupLayout gl_mpanel_1 = new GroupLayout(mpanel_1);
		gl_mpanel_1.setHorizontalGroup(
			gl_mpanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mpanel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrWhichOneHolds, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_mpanel_1.setVerticalGroup(
			gl_mpanel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mpanel_1.createSequentialGroup()
					.addGap(37)
					.addComponent(txtrWhichOneHolds, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		mpanel_1.setLayout(gl_mpanel_1);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_1211683195891399");
		
		JLabel lblQ_1 = new JLabel("Q2");
		
		JRadioButton rdbtnA_2 = new JRadioButton("A");
		
		JRadioButton rdbtnB_2 = new JRadioButton("B");
		
		JRadioButton rdbtnC_2 = new JRadioButton("C");
		
		JRadioButton rdbtnD_2 = new JRadioButton("D");
		
		JRadioButton rdbtnE_2 = new JRadioButton("E");
		
		JPanel panel_3 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblQ_1)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(rdbtnA_2)
							.addGap(100)
							.addComponent(rdbtnB_2)
							.addGap(99)
							.addComponent(rdbtnC_2)
							.addGap(108)
							.addComponent(rdbtnD_2)
							.addGap(104)
							.addComponent(rdbtnE_2))
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnA_2)
						.addComponent(rdbtnB_2)
						.addComponent(rdbtnC_2)
						.addComponent(rdbtnD_2)
						.addComponent(rdbtnE_2))
					.addContainerGap())
		);
		
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(68)
					.addComponent(txtrWhichOneStores, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(663, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(35)
					.addComponent(txtrWhichOneStores, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_2.setLayout(gl_panel_2);
		
		JPanel number = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(number, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(number, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_1);
				panel.repaint();
			}
		});
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_2);
				panel.repaint();
				panel.revalidate();
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(CoreData.runvalue==0){
				if(s.equals("Class and Object")){
				if(rdbtnA_1.isSelected()){
					mscore++;
					CoreData.progress_mvalue = mscore;
				}
				if(rdbtnA_2.isSelected()){
					mscore++;
					CoreData.progress_mvalue = mscore;
				}
				run++;
				}
				if(s.equals("Inheritance")){
					if(rdbtnB_1.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					if(rdbtnB_2.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					}
				if(s.equals("Polymorphism")){
					if(rdbtnC_1.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					if(rdbtnC_2.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					}
				if(s.equals("Abstraction Class and Interfaces")){
					if(rdbtnD_1.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					if(rdbtnD_2.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					}
				if(s.equals("GUI")){
					if(rdbtnE_1.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					if(rdbtnE_2.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					}
				if(s.equals("FileIO")){
					if(rdbtnA_1.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					if(rdbtnA_2.isSelected()){
						mscore++;
						CoreData.progress_mvalue = mscore;
					}
					}
				run++;
				CoreData.runvalue=run;
				JOptionPane.showMessageDialog(null, "You get " + mscore + " point.");
				}
				else{
					JOptionPane.showMessageDialog(null, "You already test go back", "Fail",
							JOptionPane.INFORMATION_MESSAGE);
					CoreData.runvalue=0;
				}
				
				
				
				
				
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new quizmenu(s,selectedUser).getFrame().setVisible(true);
				frame.dispose();
			}
		});
		GroupLayout gl_number = new GroupLayout(number);
		gl_number.setHorizontalGroup(
			gl_number.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_number.createSequentialGroup()
					.addContainerGap()
					.addComponent(button)
					.addGap(18)
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED, 515, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(18)
					.addComponent(btnBack)
					.addContainerGap())
		);
		gl_number.setVerticalGroup(
			gl_number.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_number.createSequentialGroup()
					.addContainerGap(37, Short.MAX_VALUE)
					.addGroup(gl_number.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBack)
						.addComponent(btnSubmit)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap())
		);
		number.setLayout(gl_number);
		contentPane.setLayout(gl_contentPane);
	}
}
