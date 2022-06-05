package corejava;

//java program To Write data to a File using BufferedWriter
import java.io.BufferedReader;
import java.io.FileReader;

// main class
public class BufferdWriterExample {

		public static void main(String [] args) throws Exception {
	        
		    //Creating FileReader object
		        FileReader file = new FileReader("E:\\MyFiles.txt");
		        
		     //To read from the created file
		        BufferedReader br = new BufferedReader(file);
		        
		        int l ;
		     //Call Read() Method By Using While Loop
		        while((l=br.read())!= -1){
		            System.out.print((char)l);       
		        	}
		        br.close();
		        file.close();
		    }

			}

