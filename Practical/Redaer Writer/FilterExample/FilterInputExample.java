package corejava;

import java.io.BufferedInputStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputExample {

	    public static void main(String[] args) throws IOException {  
	        File data = new File("E:\\Testout.txt");  
	        FileInputStream  file = new FileInputStream(data);  
	        FilterInputStream filter = new BufferedInputStream(file);  
	        int k =0;  
	        while((k=filter.read())!=-1){  
	            System.out.print((char)k);  
	        }  
	        file.close();  
	        filter.close();  
	    }  

	}

