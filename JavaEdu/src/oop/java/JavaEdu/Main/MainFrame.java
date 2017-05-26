package oop.java.JavaEdu.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.User;

import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	ArrayList<User> userLoad = new ArrayList<User>();
	User selectedUser;
	Chapter selectedChapter;
	private JTextField idText;
	private JPasswordField passwordText;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainFrame() {
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Login = new JPanel();
		getContentPane().add(Login, "name_956891515678444");
		
		JLabel lblNewLabel = new JLabel("Java Education");
		lblNewLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 25));
		
		idText = new JTextField();
		idText.setColumns(10);
		
		JLabel version = new JLabel("v.0.1");
		
		JLabel idLabel = new JLabel("Student ID : ");
		
		passwordText = new JPasswordField();
		
		JLabel passwordLabel = new JLabel("Password : ");
		
		JButton signIn = new JButton("Sign in");
		
		JButton signUp = new JButton("Sign up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		GroupLayout gl_Login = new GroupLayout(Login);
		gl_Login.setHorizontalGroup(
			gl_Login.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Login.createSequentialGroup()
					.addContainerGap(270, Short.MAX_VALUE)
					.addGroup(gl_Login.createParallelGroup(Alignment.LEADING)
						.addComponent(idLabel)
						.addComponent(passwordLabel))
					.addGap(14)
					.addGroup(gl_Login.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(gl_Login.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(passwordText, Alignment.LEADING)
							.addComponent(idText, Alignment.LEADING)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(version)
					.addGap(219))
				.addGroup(Alignment.LEADING, gl_Login.createSequentialGroup()
					.addGap(277)
					.addComponent(signIn, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(signUp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(283))
		);
		gl_Login.setVerticalGroup(
			gl_Login.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Login.createSequentialGroup()
					.addGap(86)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(version))
					.addGap(100)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(idLabel))
					.addGap(18)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordLabel))
					.addGap(18)
					.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
						.addComponent(signIn)
						.addComponent(signUp))
					.addContainerGap(243, Short.MAX_VALUE))
		);
		Login.setLayout(gl_Login);
		
		JPanel ChapterSelect = new JPanel();
		getContentPane().add(ChapterSelect, "name_956891522789559");
		
		JPanel MaterialSelect = new JPanel();
		getContentPane().add(MaterialSelect, "name_956891529873083");
		setTitle("JavaEdu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
	}
}
