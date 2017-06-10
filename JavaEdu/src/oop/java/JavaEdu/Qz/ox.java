package oop.java.JavaEdu.Qz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.Quiz;

import java.awt.CardLayout;
import javax.swing.JRadioButton;

public class ox extends Quiz {

	private JPanel contentPane;
	private JFrame oframe = new JFrame();

	public JFrame getOframe() {
		return oframe;
	}

	public void setOframe(JFrame oframe) {
		this.oframe = oframe;
	}

	public ox(String s) {
		oframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ)
					.addContainerGap(758, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(619, Short.MAX_VALUE)
					.addComponent(rdbtnO)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnX)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ)
					.addPreferredGap(ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnX)
						.addComponent(rdbtnO))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "name_1211683195891399");
		
		JLabel lblQ_1 = new JLabel("Q2");
		
		JRadioButton rdbtnX_1 = new JRadioButton("X");
		
		JRadioButton rdbtnO_1 = new JRadioButton("O");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ_1)
					.addContainerGap(758, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(619, Short.MAX_VALUE)
					.addComponent(rdbtnO_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnX_1)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQ_1)
					.addPreferredGap(ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnX_1)
						.addComponent(rdbtnO_1))
					.addContainerGap())
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
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new quizmenu(s).getFrame().setVisible(true);
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
