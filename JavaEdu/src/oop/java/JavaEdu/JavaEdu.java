package oop.java.JavaEdu;

import java.awt.EventQueue;

import oop.java.JavaEdu.Main.MainFrame;

public class JavaEdu {
	/*
	 * In here, the program is running on.
	 */
	
	
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
	
	
}
