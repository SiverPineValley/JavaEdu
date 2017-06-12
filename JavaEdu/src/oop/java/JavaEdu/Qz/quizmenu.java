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
import oop.java.JavaEdu.Quiz;
import oop.java.JavaEdu.Main.MainFrame;

public class quizmenu extends Quiz {

	private JPanel contentPane;
	private JFrame frame = new JFrame();
	
	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public quizmenu(String s) {
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		
		JButton btnmultiple = new JButton("multiple choice");
		btnmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new multiple(s).getFrame().setVisible(true);
				frame.dispose();
				
			}
		});
		
		JButton btnshortans = new JButton("short answer");
		btnshortans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new shortans(s).getSframe().setVisible(true);
				frame.dispose();
			}
		});
		
		JButton btnox = new JButton("O X");
		btnox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnox){
					new ox(s).getOframe().setVisible(true);
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
