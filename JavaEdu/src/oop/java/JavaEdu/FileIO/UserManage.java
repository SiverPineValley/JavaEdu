package oop.java.JavaEdu.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import oop.java.JavaEdu.Chapter;
import oop.java.JavaEdu.User;

public class UserManage {

	public static void UsertoFile(User user) {

		ArrayList<User> tempUser = UserfromFile();
		if (tempUser == null) {
			tempUser = new ArrayList<User>();
			tempUser.add(user);
		} else
			tempUser.add(user);
		try {
			FileOutputStream fo = new FileOutputStream("User.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(tempUser);
			JOptionPane.showMessageDialog(null, "New Account is created!", "Success!", JOptionPane.INFORMATION_MESSAGE);
			oo.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Cannot make the User File", "Error", JOptionPane.INFORMATION_MESSAGE);

		}
	}

	public static ArrayList<User> UserfromFile() {

		ArrayList<User> tempUser = new ArrayList<User>();

		try {
			FileInputStream fi = new FileInputStream("User.dat");
			ObjectInputStream os = new ObjectInputStream(fi);
			Object ob = os.readObject();
			tempUser = (ArrayList<User>) ob;
			os.close();
			return tempUser;
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static User searchUser(String id) {
		/*
		 * if method can find user, then it returns that user if not, it returns
		 * null
		 */
		ArrayList<User> userList;
		try {
			FileInputStream fi = new FileInputStream("User.dat");
			ObjectInputStream os = new ObjectInputStream(fi);
			Object ob = os.readObject();
			userList = (ArrayList<User>) ob;

			for (User temp : userList) {
				if (temp.getId().equals(id)) {
					os.close();
					return temp;
				}
			}
			os.close();
			return null;
		} catch (Exception e) {

		}

		return null;

	}
	
	public static User EditUser( User user, int chapternum, double quizPoint ) {
		ArrayList<User> userList;
		int index;
		try {
			userList = UserfromFile();
			index = userList.indexOf(user);
			userList.get(index).setQuizPoint(quizPoint, chapternum);
			
			FileOutputStream fo = new FileOutputStream("User.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(userList);
			
			
		}catch(NullPointerException e) {
			e.printStackTrace();
			return user;
		}catch (IOException e) {
			e.printStackTrace();
			return user;
		}
			return userList.get(index);
		
	}

	
}
