package oop.java.JavaEdu.Qz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.CoreData;
import oop.java.JavaEdu.Quiz;
import oop.java.JavaEdu.User;
import oop.java.JavaEdu.FileIO.UserManage;

import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ox extends Quiz {

	private JPanel contentPane;
	private JFrame oframe = new JFrame();
	private int oscore;
	private User selectedUser;
	private int run;
	public JFrame getOframe() {
		return oframe;
	}

	public void setOframe(JFrame oframe) {
		this.oframe = oframe;
	}

	public ox(String s, User selectedUser_input, int chaptertype) {
		this.selectedUser = selectedUser_input;
		this.oscore = 0;
		this.run = CoreData.runvalue_1;
		oframe.setBounds(100, 100, 835, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		oframe.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, "name_1211675886542913");
		
		JLabel lblQ = new JLabel("Q1");
		
		JRadioButton rdbtnX = new JRadioButton("X");
		
		JRadioButton rdbtnO = new JRadioButton("O");
		
		JTextArea textArea = new JTextArea();
		JTextArea textArea_1 = new JTextArea();
		if(s.equals("Class and Object")){
			textArea.setText("Class and Object OX Question1?\r\n");	
			textArea_1.setText("Class and Object OX Question2?.\r\n");
		}
		if(s.equals("Inheritance")){
			textArea.setText("Inheritance OX Question1?\r\n");	
			textArea_1.setText("Inheritance OX Question2?.\r\n");
		}
		if(s.equals("Polymorphism")){
			textArea.setText("Polymorphism OX Question1?\r\n");	
			textArea_1.setText("Polymorphism OX Question2?.\r\n");
		}
		if(s.equals("Abstraction Class and Interfaces")){
			textArea.setText("Abstraction Class and InterfacesOX Question1?\r\n");	
			textArea_1.setText("Abstraction Class and Interfaces OX Question2?.\r\n");
		}
		if(s.equals("GUI")){
			textArea.setText("GUI OX Question1?\r\n");	
			textArea_1.setText("GUI OX Question2?.\r\n");
		}
		if(s.equals("FileIO")){
			textArea.setText("FileIO OX Question1?\r\n");	
			textArea_1.setText("FileIO OX Question2?.\r\n");
		}
		JPanel panel_3 = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(659)
							.addComponent(rdbtnO)
							.addGap(9)
							.addComponent(rdbtnX))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(17)
							.addComponent(lblQ))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(15)
					.addComponent(lblQ)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(277)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnO)
								.addComponent(rdbtnX)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))))
		);
		
		
		panel_3.setToolTipText("");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(588, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(217, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_1211683195891399");
		
		JLabel lblQ_1 = new JLabel("Q2");
		
		JRadioButton rdbtnX_1 = new JRadioButton("X");
		
		JRadioButton rdbtnO_1 = new JRadioButton("O");
		
		JPanel panel_4 = new JPanel();
		panel_4.setToolTipText("");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(17)
							.addComponent(lblQ_1))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(659)
							.addComponent(rdbtnO_1)
							.addGap(9)
							.addComponent(rdbtnX_1))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(15)
					.addComponent(lblQ_1)
					.addGap(18)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnO_1)
						.addComponent(rdbtnX_1)))
		);
		
	
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(556, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(28)
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(197, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
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
				if(rdbtnX.isSelected()){
					oscore++;
					CoreData.progress_ovalue=oscore;
				}
				if(rdbtnO_1.isSelected()){
					oscore++;
					CoreData.progress_ovalue=oscore;
				}
				
				JOptionPane.showMessageDialog(null, "You get " + CoreData.progress_ovalue + " point.");
				selectedUser = UserManage.EditUser(selectedUser, chaptertype, 2, oscore);
				}
				
			
			
			
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new quizmenu(s,selectedUser).getFrame().setVisible(true);
				oframe.dispose();
			}
		});
		GroupLayout gl_number = new GroupLayout(number);
		gl_number.setHorizontalGroup(
			gl_number.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_number.createSequentialGroup()
					.addContainerGap()
					.addComponent(button)
					.addGap(18)
					.addComponent(button_1)
					.addPreferredGap(ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBack)
					.addContainerGap())
		);
		gl_number.setVerticalGroup(
			gl_number.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_number.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_number.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1)
						.addComponent(btnSubmit)
						.addComponent(btnBack))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		number.setLayout(gl_number);
		contentPane.setLayout(gl_contentPane);
	}
}
