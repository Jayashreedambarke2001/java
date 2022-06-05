package corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputExample {

	    public static void main(String[] args) throws IOException {  
	        File data = new File("E:\\MyFiles.txt");  
	        FileOutputStream file = new FileOutputStream(data);  
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        String s="Welcome to Mumbai.";      
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        System.out.println("Success...");  
	    }  


	}

