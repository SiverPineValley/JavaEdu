package oop.java.JavaEdu.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import oop.java.JavaEdu.User;

public class UserManage {

	private User temp;

	public static void UsertoFile(User user) {

		ArrayList<User> tempUser = UserfromFile();
		if ( tempUser == null ) {
			tempUser = new ArrayList<User>();
			tempUser.add(user);
		}
		else tempUser.add(user);
		try {
			FileOutputStream fo = new FileOutputStream("User.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(user);
			oo.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Cannot make the User File", "Error", JOptionPane.INFORMATION_MESSAGE);

		}
	}

	public static ArrayList<User> UserfromFile() {

		ArrayList<User> tempUser = new ArrayList<User>();

		try {
			FileInputStream fo = new FileInputStream("User.dat");
			ObjectInputStream os = new ObjectInputStream(fo);
			Object obj = os.readObject();
			tempUser = (ArrayList<User>) obj;
			os.close();
			return tempUser;
		} catch (Exception e) {
		}
		return null;
	}
}