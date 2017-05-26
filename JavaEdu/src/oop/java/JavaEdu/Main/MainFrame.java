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

public class MainFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	ArrayList<User> userLoad = new ArrayList<User>();
	User selectedUser;
	Chapter selectedChapter;
	
	
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
		
		JPanel ChapterSelect = new JPanel();
		getContentPane().add(ChapterSelect, "name_956891522789559");
		
		JPanel MaterialSelect = new JPanel();
		getContentPane().add(MaterialSelect, "name_956891529873083");
		setTitle("JavaEdu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
	}

}
