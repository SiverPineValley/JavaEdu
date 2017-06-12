package oop.java.JavaEdu.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oop.java.JavaEdu.*;
import oop.java.JavaEdu.FileIO.*;
import oop.java.JavaEdu.Qz.quizmenu;

import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ListSelectionModel;

public class MainFrame extends JFrame {

	/**
	 * Launch the application.
	 */
	private CardLayout cardLayoutSet;
	private ArrayList<User> userLoad;
	private User selectedUser;
	private Chapter selectedChapter;
	private JTextField idText;
	private JPasswordField passwordText;
	private String imgName;

	// Initializing Chapter
	private Chapter classObject = new Chapter("Class and Object");
	private Chapter inheritance = new Chapter("Inheritance");
	private Chapter polymorphism = new Chapter("Polymorphism");
	private Chapter abstractInterface = new Chapter("Abstraction Class and Interfaces");
	private Chapter gui = new Chapter("GUI");
	private Chapter fileIO = new Chapter("FileIO");
	private int currentExpage = 1;
	private int lastpage = 1;

	public int getCurrentExpage() {
		return currentExpage;
	}

	public void setCurrentExpage(int currentExpage) {
		this.currentExpage = currentExpage;
	}

	public MainFrame() {
		/*
		 * This part is set the total page of each explanation
		 */
		abstractInterface.setExplanation(new Explanation());
		gui.setExplanation(new Explanation());
		fileIO.setExplanation(new Explanation());
		abstractInterface.getExplanation().setTotalProgress(20);
		gui.getExplanation().setTotalProgress(55);
		fileIO.getExplanation().setTotalProgress(20);

		getContentPane().setLayout(new CardLayout(0, 0));
		cardLayoutSet = (CardLayout) (getContentPane().getLayout());
		JPanel Login = new JPanel();
		getContentPane().add(Login, "Login");

		JPanel ChapterSelect = new JPanel();
		getContentPane().add(ChapterSelect, "ChapterSelect");

		JLabel idIdentifier = new JLabel("ID : ");
		idIdentifier.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		JLabel nameIdentifier = new JLabel("Name : ");
		nameIdentifier.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		JLabel idIdentifier1 = new JLabel("ID : ");
		idIdentifier1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		JLabel nameIdentifier1 = new JLabel("Name : ");
		nameIdentifier1.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		JLabel chapterIdentifier = new JLabel("Selected Chapter : ");
		chapterIdentifier.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 15));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Class and Object", "Inheritance", "Polymorphism",
					"Abstract Class and Interface", "GUI", "File IO" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		/*
		 * if you select the chapter, this will open material select panel
		 */
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.isSelectionEmpty()) {
					JOptionPane.showMessageDialog(null, "Please selects a Chapter.", "Fail",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					if (list.getSelectedIndex() == 0) {
						selectedChapter = classObject;
					} else if (list.getSelectedIndex() == 1) {
						selectedChapter = inheritance;
					} else if (list.getSelectedIndex() == 2) {
						selectedChapter = polymorphism;
					} else if (list.getSelectedIndex() == 3) {
						selectedChapter = abstractInterface;
					} else if (list.getSelectedIndex() == 4) {
						selectedChapter = gui;
					} else if (list.getSelectedIndex() == 5) {
						selectedChapter = fileIO;
					}
					idIdentifier1.setText("ID : " + selectedUser.getId());
					nameIdentifier1.setText("Name : " + selectedUser.getName());
					chapterIdentifier.setText("Selected Chapter : " + selectedChapter.getChapterInfo());
					cardLayoutSet.show(getContentPane(), "MaterialSelect");

				}
			}
		});

		// Back to the ChapterSelect Frame
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayoutSet.show(getContentPane(), "Login");

			}
		});

		JLabel info = new JLabel("Welcome! Please Select Chapter");
		GroupLayout gl_ChapterSelect = new GroupLayout(ChapterSelect);
		gl_ChapterSelect.setHorizontalGroup(gl_ChapterSelect.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ChapterSelect.createSequentialGroup().addGap(79)
						.addGroup(gl_ChapterSelect.createParallelGroup(Alignment.LEADING).addComponent(info)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ChapterSelect.createSequentialGroup().addComponent(btnNewButton).addGap(18)
										.addComponent(btnNewButton_1))
								.addComponent(idIdentifier).addComponent(nameIdentifier))
						.addContainerGap(145, Short.MAX_VALUE)));
		gl_ChapterSelect
				.setVerticalGroup(
						gl_ChapterSelect.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_ChapterSelect.createSequentialGroup().addComponent(idIdentifier)
												.addComponent(nameIdentifier).addGap(13).addComponent(info)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 377,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_ChapterSelect.createParallelGroup(Alignment.BASELINE)
														.addComponent(btnNewButton).addComponent(btnNewButton_1))
												.addGap(65)));
		ChapterSelect.setLayout(gl_ChapterSelect);

		JPanel MaterialSelect = new JPanel();
		getContentPane().add(MaterialSelect, "MaterialSelect");

		JButton btnQuiz = new JButton("Quiz");
		btnQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new quizmenu(selectedChapter.getChapterInfo()).getFrame().setVisible(true);
			}
		});
		JLabel pageIdentifier = new JLabel("page");

		JButton btnExplanation = new JButton("Explanation");
		btnExplanation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayoutSet.show(getContentPane(), "explanationFrame");
				if (selectedChapter.equals(abstractInterface)) {
					imgName = "ExplanationSource\\AbstractClassandInterfaces\\ab1.png";
					pageIdentifier.setText("1/" + abstractInterface.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(gui)) {
					imgName = "ExplanationSource\\Gui\\gui1.png";
					pageIdentifier.setText("1/" + gui.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(fileIO)) {
					imgName = "ExplanationSource\\FileIO\\io1.png";
					pageIdentifier.setText("1/" + fileIO.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(classObject)) {
					imgName = "ExplanationSource\\ClassObject\\cla1.png";
					pageIdentifier.setText("1/" + classObject.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(inheritance)) {
					imgName = "ExplanationSource\\Inheritance\\inh1.png";
					pageIdentifier.setText("1/" + inheritance.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(polymorphism)) {
					imgName = "ExplanationSource\\Polymorphism\\pol1.png";
					pageIdentifier.setText("1/" + polymorphism.getExplanation().getTotalProgress());
				}
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardLayoutSet.show(getContentPane(), "ChapterSelect");

			}
		});

		setTitle("JavaEdu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JLabel lblNewLabel = new JLabel("Java Education");
		lblNewLabel.setFont(new Font("Bodoni MT", Font.PLAIN, 25));

		idText = new JTextField();
		idText.setColumns(10);

		JLabel version = new JLabel("v.0.1");

		JLabel idLabel = new JLabel("Student ID : ");

		passwordText = new JPasswordField();

		JLabel passwordLabel = new JLabel("Password : ");

		JButton signIn = new JButton("Sign in");
		signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String id = idText.getText();
				String pass = passwordText.getText();
				
				int t = 0;
				if (id.length() == 9) {
					for (t = 0; t < 9; t++) {
						if (id.charAt(t) < 48 || id.charAt(t) > 57) {
							t = 100;
							break;
						}
					}
				}
				if (id.length() == 0 || pass.length() == 0)
					JOptionPane.showMessageDialog(null, "Id or Password is Empty!!", "Fail",
							JOptionPane.INFORMATION_MESSAGE);
				else if (id.length() != 9)
					JOptionPane.showMessageDialog(null, "Id legnth is not 9!!", "Fail",
							JOptionPane.INFORMATION_MESSAGE);
				else if (pass.length() < 6 || pass.length() > 13)
					JOptionPane.showMessageDialog(null, "Password length is incorrect!!", "Fail",
							JOptionPane.INFORMATION_MESSAGE);
				else if (t == 100) {
					JOptionPane.showMessageDialog(null, "Only number can be input in Id!!", "Fail",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					userLoad = UserManage.UserfromFile();
					selectedUser = UserManage.searchUser(id);

					if (selectedUser.getId() == null)
						JOptionPane.showMessageDialog(null, "Id cannot find. Please Sign up!!!", "Fail",
								JOptionPane.INFORMATION_MESSAGE);
					else {

						if (passwordText.getText().equals(selectedUser.getPassword())) {
							idText.setText("");
							passwordText.setText("");
							idIdentifier.setText("ID : " + selectedUser.getId());
							nameIdentifier.setText("Name : " + selectedUser.getName());

							cardLayoutSet.show(getContentPane(), "ChapterSelect");
						} else
							JOptionPane.showMessageDialog(null, "Password is not correct!!", "Fail",
									JOptionPane.INFORMATION_MESSAGE);

					}

				}
			}
			catch(NullPointerException ex) {
				JOptionPane.showMessageDialog(null, "Id cannot find. Please Sign up!!!", "Fail",
						JOptionPane.INFORMATION_MESSAGE);
			}
			}
		});

		JButton signUp = new JButton("Sign up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new SignUp().setVisible(true);
				;

			}
		});
		GroupLayout gl_Login = new GroupLayout(Login);
		gl_Login.setHorizontalGroup(gl_Login.createParallelGroup(Alignment.LEADING).addGroup(gl_Login
				.createSequentialGroup().addContainerGap(283, Short.MAX_VALUE)
				.addGroup(gl_Login.createParallelGroup(Alignment.TRAILING).addGroup(gl_Login.createSequentialGroup()
						.addGroup(gl_Login.createParallelGroup(Alignment.LEADING).addComponent(idLabel)
								.addComponent(passwordLabel))
						.addGap(14)
						.addGroup(gl_Login.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordText, Alignment.LEADING).addComponent(idText, Alignment.LEADING)))
						.addComponent(lblNewLabel))
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(version).addGap(269))
				.addGroup(gl_Login.createSequentialGroup().addGap(277)
						.addComponent(signIn, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE).addGap(38)
						.addComponent(signUp, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE).addGap(283)));
		gl_Login.setVerticalGroup(gl_Login.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Login.createSequentialGroup().addGap(86)
						.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(version))
						.addGap(100)
						.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
								.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(idLabel))
						.addGap(18)
						.addGroup(gl_Login.createParallelGroup(Alignment.BASELINE)
								.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordLabel))
						.addGap(18).addGroup(gl_Login.createParallelGroup(Alignment.BASELINE).addComponent(signIn)
								.addComponent(signUp))
						.addContainerGap(243, Short.MAX_VALUE)));
		Login.setLayout(gl_Login);

		JPanel explanationFrame = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image img = new ImageIcon(imgName).getImage();
				g.drawImage(img, 0, 0, null);
				setOpaque(false);
			}
		};
		getContentPane().add(explanationFrame, "explanationFrame");

		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayoutSet.show(getContentPane(), "MaterialSelect");
				currentExpage = 1;
			}
		});

		JButton lastEx = new JButton("<");
		lastEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentExpage == 1)
					cardLayoutSet.show(getContentPane(), "MaterialSelect");
				if (selectedChapter.equals(abstractInterface)) {
					if (currentExpage > 1) {
						currentExpage--;
						imgName = "ExplanationSource\\AbstractClassandInterfaces\\ab" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/" + abstractInterface.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(gui)) {
					if (currentExpage > 1) {
						currentExpage--;
						imgName = "ExplanationSource\\Gui\\gui" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/" + gui.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(fileIO)) {
					if (currentExpage > 1) {
						currentExpage--;
						imgName = "ExplanationSource\\FileIO\\io" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/" + fileIO.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(classObject)) {
					if (currentExpage > 1) {
						currentExpage--;
						imgName = "ExplanationSource\\ClassObject\\cla" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/" + classObject.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(polymorphism)) {
					if (currentExpage > 1) {
						currentExpage--;
						imgName = "ExplanationSource\\Polymorphism\\io" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/" + polymorphism.getExplanation().getTotalProgress());
				} else if (selectedChapter.equals(inheritance)) {
					if (currentExpage > 1) {
						currentExpage--;
						imgName = "ExplanationSource\\Inheritance\\io" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/" + inheritance.getExplanation().getTotalProgress());
				}

			}
		});

		JButton nextEx = new JButton(">");
		nextEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (selectedChapter.equals(abstractInterface)) {
					if (currentExpage < 20) {
						currentExpage++;
						lastpage = currentExpage;
						imgName = "ExplanationSource\\AbstractClassandInterfaces\\ab" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/20");
				} else if (selectedChapter.equals(gui)) {
					if (currentExpage < 55) {
						currentExpage++;
						lastpage = currentExpage;
						imgName = "ExplanationSource\\Gui\\gui" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/55");
				} else if (selectedChapter.equals(fileIO)) {
					if (currentExpage < 20) {
						currentExpage++;
						lastpage = currentExpage;
						imgName = "ExplanationSource\\FileIO\\io" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/20");
				} else if (selectedChapter.equals(classObject)) {
					if (currentExpage < 22) {
						currentExpage++;
						lastpage = currentExpage;
						imgName = "ExplanationSource\\ClassObject\\cla" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/22");
				} else if (selectedChapter.equals(polymorphism)) {
					if (currentExpage < 16) {
						currentExpage++;
						lastpage = currentExpage;
						imgName = "ExplanationSource\\Polymorphism\\pol" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/16");
				} else if (selectedChapter.equals(inheritance)) {
					if (currentExpage < 30) {
						currentExpage++;
						lastpage = currentExpage;
						imgName = "ExplanationSource\\Inheritance\\inh" + currentExpage + ".png";
						explanationFrame.repaint();
					}
					pageIdentifier.setText(currentExpage + "/30");
				}
				

			}
		});

		JButton btnProgress = new JButton("Progress");
		btnProgress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Progress(selectedUser, selectedChapter, lastpage).setVisible(true);

			}
		});
		GroupLayout gl_MaterialSelect = new GroupLayout(MaterialSelect);
		gl_MaterialSelect.setHorizontalGroup(gl_MaterialSelect.createParallelGroup(
				Alignment.LEADING)
				.addGroup(gl_MaterialSelect.createSequentialGroup().addGroup(gl_MaterialSelect
						.createParallelGroup(Alignment.LEADING).addGroup(gl_MaterialSelect.createSequentialGroup()
								.addGap(80).addGroup(gl_MaterialSelect.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnBack)
										.addGroup(gl_MaterialSelect
												.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_MaterialSelect.createSequentialGroup()
														.addComponent(btnQuiz, GroupLayout.PREFERRED_SIZE, 271,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnExplanation, GroupLayout.PREFERRED_SIZE, 269,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(btnProgress, GroupLayout.PREFERRED_SIZE, 634,
														GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_MaterialSelect.createSequentialGroup().addGap(71)
								.addGroup(gl_MaterialSelect.createParallelGroup(Alignment.LEADING)
										.addComponent(nameIdentifier1).addComponent(idIdentifier1)
										.addComponent(chapterIdentifier))))
						.addContainerGap(70, Short.MAX_VALUE)));
		gl_MaterialSelect.setVerticalGroup(gl_MaterialSelect.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MaterialSelect.createSequentialGroup().addGap(22).addComponent(idIdentifier1)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(nameIdentifier1)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(chapterIdentifier).addGap(34)
						.addGroup(gl_MaterialSelect.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnQuiz, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExplanation, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnProgress, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addGap(65).addComponent(btnBack).addGap(57)));
		MaterialSelect.setLayout(gl_MaterialSelect);
		GroupLayout gl_explanationFrame = new GroupLayout(explanationFrame);
		gl_explanationFrame.setHorizontalGroup(gl_explanationFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_explanationFrame.createSequentialGroup().addComponent(btnBack_1).addGap(126)
						.addComponent(lastEx).addGap(149).addComponent(pageIdentifier)
						.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE).addComponent(nextEx)
						.addGap(161)));
		gl_explanationFrame.setVerticalGroup(gl_explanationFrame.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_explanationFrame.createSequentialGroup().addContainerGap(538, Short.MAX_VALUE)
						.addGroup(gl_explanationFrame.createParallelGroup(Alignment.BASELINE).addComponent(btnBack_1)
								.addComponent(lastEx).addComponent(nextEx).addComponent(pageIdentifier))));
		explanationFrame.setLayout(gl_explanationFrame);

		JPanel Progress = new JPanel();
		getContentPane().add(Progress, "name_447993655917954");

	} // constructor
} // class
