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
			JOptionPane.showMessageDialog(null, "Cannot Find the file!!!", "Fail",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Cannot Find the Information!!!", "Fail",
					JOptionPane.INFORMATION_MESSAGE);
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
			JOptionPane.showMessageDialog(null, "Cannot find the id!!!", "Fail",
					JOptionPane.INFORMATION_MESSAGE);
		}

		return null;

	}
	
	public static User EditUser( User user, int type, double quizPoint) {  
	 	ArrayList<User> userList;  
	 	int index=0; 
	 
	 	try {  
	 		userList = UserfromFile();  


	 		int tempindex = 0;
	 		
	 		for(User temp : userList)
	 		{
	 			if(temp.getId().equals(user.getId()))
	 			{
	 				index = tempindex;
	 			}
	 			tempindex++;
	 		}
	 		
	 		userList.get(index).setQuizPoint(quizPoint,type);
	 		
	 			  
	 		FileOutputStream fo = new FileOutputStream("User.dat");  
	 			ObjectOutputStream oo = new ObjectOutputStream(fo);  
	 			oo.writeObject(userList);  
	 			  
	 		  
	 		}catch(NullPointerException e) {  
	 			JOptionPane.showMessageDialog(null, "Cannot Find the Id!!!", "Fail",
						JOptionPane.INFORMATION_MESSAGE);
	 			e.printStackTrace();  
	 			return user;  
	 		}catch (IOException e) {  
	 			JOptionPane.showMessageDialog(null, "Cannot Find the File!!!", "Fail",
						JOptionPane.INFORMATION_MESSAGE);
	 			e.printStackTrace();  
	 			return user;  
	 		}  
	 			return userList.get(index);  
	 		  
	 	}  
	




	
}
