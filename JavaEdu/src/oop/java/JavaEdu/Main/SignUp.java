package oop.java.JavaEdu.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.User;
import oop.java.JavaEdu.FileIO.UserManage;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField idField;
	private JTextField passwordField;

	public SignUp() {
		setTitle("Sign up");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblName = new JLabel("Name : ");

		nameField = new JTextField();
		nameField.setColumns(10);

		JLabel lblStudentsId = new JLabel("Students Id : ");

		idField = new JTextField();
		idField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Password : ");

		passwordField = new JTextField();
		passwordField.setColumns(10);

		JButton signUp = new JButton("Sign up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String id = idField.getText();
				String password = passwordField.getText();

				if (name.length() == 0)
					JOptionPane.showMessageDialog(null, "No name", "Error", JOptionPane.INFORMATION_MESSAGE);
				else if (id.length() == 0)
					JOptionPane.showMessageDialog(null, "No Id", "Error", JOptionPane.INFORMATION_MESSAGE);
				else if (id.length() != 9)
					JOptionPane.showMessageDialog(null, "Id length should be 9", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				else if (password.length() < 6 || password.length() > 13)
					JOptionPane.showMessageDialog(null, "Password length should be from 6 to 13", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				else {
					UserManage.UsertoFile(new User(name, id, password));
					dispose();
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(32)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(lblName)
								.addComponent(lblStudentsId).addComponent(lblNewLabel))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(idField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(signUp, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(54, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(47)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblName)
										.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblStudentsId).addComponent(idField,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel).addComponent(passwordField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(signUp, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 104,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(100, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
