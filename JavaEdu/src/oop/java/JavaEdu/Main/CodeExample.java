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
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\ClassObject\\Bicycle.txt");
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
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\ClassObject\\BikeTest.txt");
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
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\ClassObject\\Dog.txt");
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
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\ClassObject\\GradeAssigner.txt");
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
					.addGap(34)
					.addGroup(gl_classObject.createParallelGroup(Alignment.LEADING)
						.addComponent(BikeTest)
						.addComponent(Bicycle)
						.addComponent(Dog)
						.addComponent(GradeAssigner))
					.addPreferredGap(ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
		);
		gl_classObject.setVerticalGroup(
			gl_classObject.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_classObject.createSequentialGroup()
					.addGap(65)
					.addComponent(Bicycle)
					.addGap(28)
					.addComponent(BikeTest)
					.addGap(27)
					.addComponent(Dog)
					.addGap(30)
					.addComponent(GradeAssigner)
					.addGap(269))
				.addGroup(Alignment.LEADING, gl_classObject.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
					.addGap(20))
		);

		classObject.setLayout(gl_classObject);

		JPanel inheritance = new JPanel();
		contentPane.add(inheritance, "Inheritance");

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		JTextArea textArea2 = new JTextArea();
		
		JButton Circle = new JButton("Circle");
		Circle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage.explanationfromFile("JavaEdu//ExplanationSource\\Inheritance\\Circle.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea2.setText(temp);
				}

			}
		});

		JButton GeometricObject = new JButton("GeometricObject");
		GeometricObject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Inheritance\\GeometricObject.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea2.setText(temp);
				}

			}
		});
		
		
		JButton Rectangle = new JButton("Rectangle");
		Rectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Inheritance\\Rectangle.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea2.setText(temp);
				}

			}
		});

		JButton TestCircleRectangle = new JButton("TestCircleRectangle");
		TestCircleRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Inheritance\\TestCircleRectangle.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea2.setText(temp);
				}

			}
		});
		
		GroupLayout gl_inheritance = new GroupLayout(inheritance);
		gl_inheritance.setHorizontalGroup(
			gl_inheritance.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inheritance.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_inheritance.createParallelGroup(Alignment.LEADING)
						.addComponent(Circle)
						.addComponent(GeometricObject)
						.addComponent(Rectangle)
						.addComponent(TestCircleRectangle))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 503, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		gl_inheritance.setVerticalGroup(
			gl_inheritance.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inheritance.createSequentialGroup()
					.addGroup(gl_inheritance.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inheritance.createSequentialGroup()
							.addGap(102)
							.addComponent(Circle)
							.addGap(62)
							.addComponent(GeometricObject)
							.addGap(64)
							.addComponent(Rectangle)
							.addGap(72)
							.addComponent(TestCircleRectangle))
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		scrollPane_1.setViewportView(textArea2);
		textArea2.setEditable(false);
		inheritance.setLayout(gl_inheritance);

		JTextArea textArea3 = new JTextArea();
		JPanel polymorphism = new JPanel();
		contentPane.add(polymorphism, "Polymorphism");

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JButton Bicycle2 = new JButton("Bicycle");
		Bicycle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Polymorphism\\Bicycle.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea3.setText(temp);
				}

			}
		});
		
		JButton MountainBike = new JButton("MountainBike");
		MountainBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Polymorphism\\MountainBike.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea3.setText(temp);
				}

			}
		});
		
		JButton RoadBike = new JButton("RoadBike");
		RoadBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Polymorphism\\RoadBike.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea3.setText(temp);
				}

			}
		});
		
		JButton TestBikes = new JButton("TestBikes");
		TestBikes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Polymorphism\\TestBikes.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea3.setText(temp);
				}

			}
		});
		GroupLayout gl_polymorphism = new GroupLayout(polymorphism);
		gl_polymorphism.setHorizontalGroup(
			gl_polymorphism.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_polymorphism.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_polymorphism.createParallelGroup(Alignment.LEADING)
						.addComponent(Bicycle2)
						.addComponent(MountainBike)
						.addComponent(RoadBike)
						.addComponent(TestBikes))
					.addGap(112)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_polymorphism.setVerticalGroup(
			gl_polymorphism.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_polymorphism.createSequentialGroup()
					.addGroup(gl_polymorphism.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_polymorphism.createSequentialGroup()
							.addGap(88)
							.addComponent(Bicycle2)
							.addGap(47)
							.addComponent(MountainBike)
							.addGap(56)
							.addComponent(RoadBike)
							.addGap(69)
							.addComponent(TestBikes))
						.addGroup(gl_polymorphism.createSequentialGroup()
							.addGap(2)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		scrollPane_2.setViewportView(textArea3);
		polymorphism.setLayout(gl_polymorphism);

		JPanel abstractInterface = new JPanel();
		contentPane.add(abstractInterface, "Abstraction Class and Interfaces");

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		JTextArea textArea4 = new JTextArea();
		JButton Animal = new JButton("Animal");
		Animal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\AbstractClassandInterfaces\\Animal.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea4.setText(temp);
				}

			}
		});
		
		JButton AnimalTestDrive = new JButton("AnimalTestDrive");
		AnimalTestDrive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\AbstractClassandInterfaces\\AnimalTestDrive.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea4.setText(temp);
				}

			}
		});
		
		JButton Cat = new JButton("Cat");
		Cat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\AbstractClassandInterfaces\\Cat.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea4.setText(temp);
				}

			}
		});
		
		JButton Dog2 = new JButton("Dog");
		Dog2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\AbstractClassandInterfaces\\Dog.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea4.setText(temp);
				}

			}
		});
		
		JButton InterfaceExample = new JButton("InterfaceExample");
		InterfaceExample.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\AbstractClassandInterfaces\\InterfaceExample.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea4.setText(temp);
				}

			}
		});
		GroupLayout gl_abstractInterface = new GroupLayout(abstractInterface);
		gl_abstractInterface.setHorizontalGroup(
			gl_abstractInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abstractInterface.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_abstractInterface.createParallelGroup(Alignment.LEADING)
						.addComponent(Animal)
						.addComponent(AnimalTestDrive)
						.addComponent(Cat)
						.addComponent(Dog2)
						.addComponent(InterfaceExample))
					.addGap(89)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 502, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_abstractInterface.setVerticalGroup(
			gl_abstractInterface.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_abstractInterface.createSequentialGroup()
					.addGroup(gl_abstractInterface.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_abstractInterface.createSequentialGroup()
							.addGap(69)
							.addComponent(Animal)
							.addGap(46)
							.addComponent(AnimalTestDrive)
							.addGap(52)
							.addComponent(Cat)
							.addGap(59)
							.addComponent(Dog2)
							.addGap(67)
							.addComponent(InterfaceExample))
						.addGroup(gl_abstractInterface.createSequentialGroup()
							.addGap(2)
							.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		scrollPane_3.setViewportView(textArea4);
		abstractInterface.setLayout(gl_abstractInterface);

		JPanel gui = new JPanel();
		contentPane.add(gui, "GUI");

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textArea5 = new JTextArea();
		
		JButton AnonymousListener = new JButton("AnonymousListener");
		AnonymousListener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Gui\\AnonymousListener.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea5.setText(temp);
				}

			}
		});
		
		JButton InnerAdapter = new JButton("InnerAdapter");
		InnerAdapter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Gui\\InnerAdapter.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea5.setText(temp);
				}

			}
		});
		
		JButton MyWidget = new JButton("MyWidget");
		MyWidget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Gui\\MyWidget.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea5.setText(temp);
				}

			}
		});
		JButton MyWidget2 = new JButton("MyWidget2");
		MyWidget2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Gui\\MyWidget2.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea5.setText(temp);
				}

			}
		});
		JButton SimpleGUI = new JButton("SimpleGUI");
		SimpleGUI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Gui\\SimpleGUI.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea5.setText(temp);
				}

			}
		});
		JButton SimpleGUI2 = new JButton("SimpleGUI2");
		SimpleGUI2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\Gui\\SimpleGUI2.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea5.setText(temp);
				}

			}
		});
		GroupLayout gl_gui = new GroupLayout(gui);
		gl_gui.setHorizontalGroup(
			gl_gui.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gui.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_gui.createParallelGroup(Alignment.LEADING)
						.addComponent(AnonymousListener)
						.addComponent(InnerAdapter)
						.addComponent(MyWidget)
						.addComponent(MyWidget2)
						.addComponent(SimpleGUI)
						.addComponent(SimpleGUI2))
					.addGap(99)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_gui.setVerticalGroup(
			gl_gui.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_gui.createSequentialGroup()
					.addGap(64)
					.addComponent(AnonymousListener)
					.addGap(46)
					.addComponent(InnerAdapter)
					.addGap(52)
					.addComponent(MyWidget)
					.addGap(54)
					.addComponent(MyWidget2)
					.addGap(54)
					.addComponent(SimpleGUI)
					.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
					.addComponent(SimpleGUI2)
					.addGap(50))
				.addGroup(gl_gui.createSequentialGroup()
					.addGap(2)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		scrollPane_4.setViewportView(textArea5);
		gui.setLayout(gl_gui);
		JTextArea textArea6 = new JTextArea();
		JPanel fileIO = new JPanel();
		contentPane.add(fileIO, "FileIO");

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JButton ReadAFile = new JButton("ReadAFile");
		ReadAFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\FileIO\\ReadAFile.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea6.setText(temp);
				}

			}
		});
		
		JButton WriteAFile = new JButton("WriteAFile");
		WriteAFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\FileIO\\WriteAFile.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea6.setText(temp);
				}

			}
		});
		
		JButton WriteBuffered = new JButton("WriteBuffered");
		WriteBuffered.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedCode = ExplanationManage
						.explanationfromFile("JavaEdu//ExplanationSource\\FileIO\\WriteBuffered.txt");
				String temp = "";
				for (String s : selectedCode) {
					temp = temp + s + "\n";
					textArea6.setText(temp);
				}

			}
		});
		GroupLayout gl_fileIO = new GroupLayout(fileIO);
		gl_fileIO.setHorizontalGroup(
			gl_fileIO.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fileIO.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_fileIO.createParallelGroup(Alignment.LEADING)
						.addComponent(ReadAFile)
						.addComponent(WriteAFile)
						.addComponent(WriteBuffered))
					.addGap(107)
					.addComponent(scrollPane_5, GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_fileIO.setVerticalGroup(
			gl_fileIO.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fileIO.createSequentialGroup()
					.addGroup(gl_fileIO.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fileIO.createSequentialGroup()
							.addGap(89)
							.addComponent(ReadAFile)
							.addGap(100)
							.addComponent(WriteAFile)
							.addGap(127)
							.addComponent(WriteBuffered))
						.addGroup(gl_fileIO.createSequentialGroup()
							.addGap(2)
							.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 508, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		scrollPane_5.setViewportView(textArea6);
		fileIO.setLayout(gl_fileIO);
		cardLayoutSet.show(contentPane, chapterInfo);

	}
}
