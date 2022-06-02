package corejava;

// java program to read input Use BufferedReader
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {

	public static void main(String [] args) throws Exception {
        
	    //Creating FileReader object
	        FileReader file = new FileReader("E:\\MyFiles.txt");
	        
	     //To read from the created file
	        BufferedReader br = new BufferedReader(file);
	        
	        int i ;
	     //Call Read() Method By Using While Loop
	        while((i=br.read())!= -1){
	            System.out.print((char)i);       
	        	}
	        br.close();
	        file.close();
	    }

		}

