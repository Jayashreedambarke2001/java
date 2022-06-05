package corejava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("E:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  



