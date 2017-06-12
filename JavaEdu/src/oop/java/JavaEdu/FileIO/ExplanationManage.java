package oop.java.JavaEdu.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ExplanationManage {

	public static ArrayList<String> explanationfromFile(String fileName) {

		ArrayList<String> result = new ArrayList<String>();
			
		
		try {
			FileReader fr;
			File myFile = new File(fileName);
			fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				result.add(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

}
