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

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.Quiz;

import javax.swing.JRadioButton;

public class multiple extends Quiz {

	private JPanel contentPane;
	private int mscore;
	private String mimage;
	private JFrame frame = new JFrame();
	private Image img;
	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public multiple(String s) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JPanel mpanel_1 = new JPanel(){
			public void paintComponent(Graphics g) {
				if (s.equals("Abstraction Class and Interfaces")) {
					img = new ImageIcon("images.jpg").getImage();
				} g.drawImage(img, 0, 0, null);
			}
		};
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
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_1211683195891399");
		
		JLabel lblQ_1 = new JLabel("Q2");
		
		JRadioButton rdbtnA_2 = new JRadioButton("A");
		
		JRadioButton rdbtnB_2 = new JRadioButton("B");
		
		JRadioButton rdbtnC_2 = new JRadioButton("C");
		
		JRadioButton rdbtnD_2 = new JRadioButton("D");
		
		JRadioButton rdbtnE_2 = new JRadioButton("E");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ_1)
					.addContainerGap(758, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(505, Short.MAX_VALUE)
					.addComponent(rdbtnA_2)
					.addGap(159))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(541, Short.MAX_VALUE)
					.addComponent(rdbtnB_2)
					.addGap(123))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(515, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(rdbtnD_2)
						.addComponent(rdbtnC_2))
					.addGap(149))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(556, Short.MAX_VALUE)
					.addComponent(rdbtnE_2)
					.addGap(108))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnA_2)
					.addGap(41)
					.addComponent(rdbtnB_2)
					.addGap(18)
					.addComponent(rdbtnC_2)
					.addGap(31)
					.addComponent(rdbtnD_2)
					.addGap(37)
					.addComponent(rdbtnE_2)
					.addContainerGap(80, Short.MAX_VALUE))
		);
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
				if(rdbtnA_1.isSelected()){
					mscore++;
				}
				if(rdbtnA_2.isSelected()){
					mscore++;
				}
				
				JOptionPane.showMessageDialog(null, "You get " + mscore + " point.");
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new quizmenu(s).getFrame().setVisible(true);
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
