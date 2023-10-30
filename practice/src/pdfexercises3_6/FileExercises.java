package pdfexercises3_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class FileExercises {

    // Write a program to create a file and add the given contents in it and display
    // them using the Buffered Reader.
    // Input: 
        //File created! (To be printed in console after creation)
        //Hello, Java programming users.!! (To insert inside the file)
    // Output:
        //Hello, Java programming users.!! (To be printed in console after reading)

    public void createFile() throws IOException{
        FileWriter fileWriter = new FileWriter("file.txt");
        if (fileWriter != null) {
            System.out.println("File created!");
            fileWriter.write("Hello, Java programming users.!!");
        }
        fileWriter.close();
    }

    public void readFile() throws IOException{
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Write a program to check if the file can read the content of it or not using .canRead() function and print only ‘Object-oriented programming language’
    // using the BufferedReader ‘Offset’ concept and use the given contents to a new file to read them.
    // File Contents:
    //  Java is a high-level, class-based, Object-oriented programming language.
    public void offsetRead() throws IOException{
        File file = new File("C:\\Users\\tbert\\OneDrive\\Documents\\Travis_Classwork\\Java Applications\\workspace\\JavaApplicationDevelopment\\practice\\offset.txt");
        if (file.canRead()) {
            System.out.println("File can be read!");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder result = new StringBuilder();
            long offset = 35;
            int value;
            bufferedReader.skip(offset);
            while ((value = bufferedReader.read()) != -1) {
                result.append((char) value);
            }
            bufferedReader.close();
            System.out.println(result);
        }
    }


    public static void main(String[] args) {
        FileExercises fileExercises = new FileExercises();
        try {
            fileExercises.createFile();
            fileExercises.readFile();
            fileExercises.offsetRead();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
