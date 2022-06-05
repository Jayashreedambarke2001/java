package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter {

		public static void main(String[] args) throws Exception {     
			
			//Creating FileWriter object
		    FileWriter writer = new FileWriter("E:\\MyFiles.txt");  
			
		  //To read from the created file
		    BufferedWriter buffer = new BufferedWriter(writer);  
			
		    buffer.write("Welcome to satara");  
			
		    //Call close() Method
		    buffer.close();  
			
		    System.out.println("Success");  
			
		    } 
		}

