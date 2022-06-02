package corejava;

//java program to Read content from a file into byte array
import java.io.ByteArrayInputStream;
import java.io.IOException;

// main class
public class ReadFileToByteArray {

		public static void main(String[] args) throws IOException {  
			
			byte[]arry= {80,50,60,20};
		    
			// Create the new byte array input stream  
		    ByteArrayInputStream byt = new ByteArrayInputStream(arry); 
		    
		    int j=0;
		    while ((j = byt.read()) != -1) {  
		    
		    	//Conversion of a byte into character  
		      char ch = (char) j;  
		      
		      System.out.println("ASCII value of Character is:" + j + "; Special character is: " + ch);  
		    }  
		  
		}

}
