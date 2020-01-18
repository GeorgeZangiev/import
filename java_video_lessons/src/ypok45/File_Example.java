package ypok45;

import java.io.*;

public class File_Example {

	public static void main(String[] args) throws Exception {
		File file = new File("temp.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("str1\n");
		fileWriter.write("str2\n");
		fileWriter.flush();
		
		FileReader fileReader = new FileReader(file);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("str3");
		bufferedWriter.newLine();
		bufferedWriter.write("str4");
		bufferedWriter.flush();
		bufferedWriter.close();
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while (bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}
	}

}
