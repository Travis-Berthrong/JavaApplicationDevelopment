package practice_exercises;

import java.io.*;
import java.util.Scanner;

public class FileExercise {
	public static void main(String[] args) throws IOException {
		File fileObj1 = new File(
				"C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\NewFile.txt");
		try {
			if (fileObj1.createNewFile()) {
				System.out.println("NewFile Created!");
			} else {
				System.out.println("Already exists");
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		//Method 1 - Writing into file
		FileWriter fileWriter = new FileWriter("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\NewFile.txt", true);
		fileWriter.append("Java programming is easy!");
		fileWriter.close();
		
		System.out.println(fileObj1.canRead());
		System.out.println(fileObj1.canWrite());
		System.out.println(fileObj1.getAbsolutePath());
		System.out.println(fileObj1.length());
		//Method - 2 Writing into file
		try {
		FileWriter fileObj = new FileWriter("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\NewFile.txt");
		Scanner sc = new Scanner(System.in);
		String data = "";
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line == "") {
				break;
			}
			line += "\n";
			data += line;
			System.out.println("File content: " + data);
		}
		sc.close();
		fileObj.write(data);
		fileObj.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		//Method - 3 Using Buffered Writer
		Scanner sc1 = new Scanner(System.in);
		FileWriter file1 = new FileWriter("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\NewFile.txt");
		String data1 = "";
		BufferedWriter bf1 = null;
		try {
			System.out.println("Enter the content:");
			data1 = sc1.nextLine();
			System.out.println("Enter the offset: ");
			int offset = sc1.nextInt();
			bf1 = new BufferedWriter(file1);
			bf1.write(data1, offset, data1.length());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		bf1.close();
		bf1.close();
		sc1.close();
		
		//Method 4 - Using BufferedWriter to write with a while
		Scanner sc2 = new Scanner(System.in);
		FileWriter file2 = new FileWriter("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\NewFile.txt");
		String data2 = "";
		BufferedWriter bf2 = null;
		try {
			System.out.println("Enter the content:");
			bf2 = new BufferedWriter(file2);
			data2 = sc1.nextLine();
			while(!data2.contentEquals("")) {
				data2 = sc2.nextLine();
				bf2.write(data2, 0, data2.length());
				bf2.newLine();
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
		bf2.close();
		sc2.close();
		
		// Reading from file
		char[] array = new char[100];
		try {
			FileReader readFile = new FileReader("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\NewFile.txt");
			readFile.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			readFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
