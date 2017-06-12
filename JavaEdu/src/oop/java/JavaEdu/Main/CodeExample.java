package oop.java.JavaEdu.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.FileIO.ExplanationManage;

import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CodeExample extends JFrame {

	private JPanel contentPane;
	private CardLayout cardLayoutSet;
	private ArrayList<String> selectedCode;

	public CodeExample(String chapterInfo) {
		setTitle("CodeExample");
		setBounds(100, 100, 780, 550);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		cardLayoutSet = (CardLayout) (getContentPane().getLayout());

		JPanel classObject = new JPanel();
		contentPane.add(classObject, "Class and Object");
		
		JScrollPane scrollPane = new JScrollPane();
		JTextArea textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);
		textArea1.setEditable(false);
		
		JButton Bicycle = new JButton("Bicycle");
		Bicycle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage.explanationfromFile("ExplanationSource\\ClassObject\\Bicycle.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea1.setText(temp);
				}
			}
		});

		JButton BikeTest = new JButton("BikeTest");
		BikeTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage.explanationfromFile("ExplanationSource\\ClassObject\\BikeTest.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea1.setText(temp);
				}
			}
		});

		JButton Dog = new JButton("Dog");
		Dog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage.explanationfromFile("ExplanationSource\\ClassObject\\Dog.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea1.setText(temp);
				}
				
			}
		});

		JButton GradeAssigner = new JButton("GradeAssigner");
		GradeAssigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage.explanationfromFile("ExplanationSource\\ClassObject\\GradeAssigner.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea1.setText(temp);
				}
			}
		});
		
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_classObject = new GroupLayout(classObject);
		gl_classObject.setHorizontalGroup(
			gl_classObject.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_classObject.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_classObject.createParallelGroup(Alignment.LEADING)
						.addComponent(Bicycle)
						.addComponent(BikeTest)
						.addComponent(Dog)
						.addComponent(GradeAssigner))
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_classObject.setVerticalGroup(
			gl_classObject.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_classObject.createSequentialGroup()
					.addGroup(gl_classObject.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_classObject.createSequentialGroup()
							.addGap(70)
							.addComponent(Bicycle)
							.addGap(57)
							.addComponent(BikeTest)
							.addGap(60)
							.addComponent(Dog)
							.addGap(60)
							.addComponent(GradeAssigner))
						.addGroup(Alignment.TRAILING, gl_classObject.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)))
					.addContainerGap())
		);
		
		classObject.setLayout(gl_classObject);

		JPanel inheritance = new JPanel();
		contentPane.add(inheritance, "Inheritance");

		JTextArea textArea2 = new JTextArea();
		textArea2.setEditable(false);
		GroupLayout gl_inheritance = new GroupLayout(inheritance);
		gl_inheritance.setHorizontalGroup(gl_inheritance.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 784, Short.MAX_VALUE).addGroup(Alignment.LEADING,
						gl_inheritance.createSequentialGroup().addGap(328)
								.addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(30, Short.MAX_VALUE)));
		gl_inheritance
				.setVerticalGroup(gl_inheritance.createParallelGroup(Alignment.LEADING).addGap(0, 562, Short.MAX_VALUE)
						.addGroup(gl_inheritance.createSequentialGroup().addGap(21)
								.addComponent(textArea2, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(28, Short.MAX_VALUE)));
		inheritance.setLayout(gl_inheritance);

		JPanel polymorphism = new JPanel();
		contentPane.add(polymorphism, "Polymorphism");

		JTextArea textArea3 = new JTextArea();
		textArea3.setEditable(false);
		GroupLayout gl_polymorphism = new GroupLayout(polymorphism);
		gl_polymorphism.setHorizontalGroup(gl_polymorphism.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 784, Short.MAX_VALUE).addGroup(Alignment.LEADING,
						gl_polymorphism.createSequentialGroup().addGap(328)
								.addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(30, Short.MAX_VALUE)));
		gl_polymorphism
				.setVerticalGroup(gl_polymorphism.createParallelGroup(Alignment.LEADING).addGap(0, 562, Short.MAX_VALUE)
						.addGroup(gl_polymorphism.createSequentialGroup().addGap(21)
								.addComponent(textArea3, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(28, Short.MAX_VALUE)));
		polymorphism.setLayout(gl_polymorphism);

		JPanel abstractInterface = new JPanel();
		contentPane.add(abstractInterface, "Abstraction Class and Interfaces");

		JTextArea textArea4 = new JTextArea();
		textArea4.setEditable(false);
		GroupLayout gl_abstractInterface = new GroupLayout(abstractInterface);
		gl_abstractInterface.setHorizontalGroup(gl_abstractInterface.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 784, Short.MAX_VALUE).addGroup(Alignment.LEADING,
						gl_abstractInterface.createSequentialGroup().addGap(328)
								.addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(30, Short.MAX_VALUE)));
		gl_abstractInterface.setVerticalGroup(
				gl_abstractInterface.createParallelGroup(Alignment.LEADING).addGap(0, 562, Short.MAX_VALUE)
						.addGroup(gl_abstractInterface.createSequentialGroup().addGap(21)
								.addComponent(textArea4, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(28, Short.MAX_VALUE)));
		abstractInterface.setLayout(gl_abstractInterface);

		JPanel gui = new JPanel();
		contentPane.add(gui, "GUI");

		JTextArea textArea5 = new JTextArea();
		textArea5.setEditable(false);
		GroupLayout gl_gui = new GroupLayout(gui);
		gl_gui.setHorizontalGroup(gl_gui.createParallelGroup(Alignment.TRAILING).addGap(0, 784, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING,
						gl_gui.createSequentialGroup().addGap(328)
								.addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(30, Short.MAX_VALUE)));
		gl_gui.setVerticalGroup(gl_gui.createParallelGroup(Alignment.LEADING).addGap(0, 562, Short.MAX_VALUE)
				.addGroup(gl_gui.createSequentialGroup().addGap(21)
						.addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(28, Short.MAX_VALUE)));
		gui.setLayout(gl_gui);

		JPanel fileIO = new JPanel();
		contentPane.add(fileIO, "FileIO");

		JTextArea textArea6 = new JTextArea();
		textArea6.setEditable(false);
		GroupLayout gl_fileIO = new GroupLayout(fileIO);
		gl_fileIO.setHorizontalGroup(gl_fileIO.createParallelGroup(Alignment.TRAILING).addGap(0, 784, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING,
						gl_fileIO.createSequentialGroup().addGap(328)
								.addComponent(textArea6, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(30, Short.MAX_VALUE)));
		gl_fileIO.setVerticalGroup(gl_fileIO.createParallelGroup(Alignment.LEADING).addGap(0, 562, Short.MAX_VALUE)
				.addGroup(gl_fileIO.createSequentialGroup().addGap(21)
						.addComponent(textArea6, GroupLayout.PREFERRED_SIZE, 513, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(28, Short.MAX_VALUE)));
		fileIO.setLayout(gl_fileIO);

		cardLayoutSet.show(contentPane, chapterInfo);

	}
}
