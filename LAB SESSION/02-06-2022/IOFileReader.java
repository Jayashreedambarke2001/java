package corejava;

//Java program to show usage of IO Filereader

import java.io.*;
//main class
public class IOFileReader {

		   public static void main(String args[]) throws IOException {
			   
		      //Creating FileReader object
		      File file = new File("E:/myFiles.txt");
		      
		      // To read from the created file
		      FileReader reader = new FileReader(file);
		      char chars[] = new char[(int) file.length()];
		      
		      //Reading data from the file
		      reader.read(chars);
		      System.out.println(chars);
		      reader.close();
		      
		      //Writing data to another file
		      File out = new File("E:/CopyOfmyFiles.txt");
		      FileWriter writer = new FileWriter(out);
		      
		      //Writing data to the file
		      writer.write(chars);
		      writer.flush();
		      writer.close();
		      
		      System.out.println("Data successfully written");
		   }
	}

