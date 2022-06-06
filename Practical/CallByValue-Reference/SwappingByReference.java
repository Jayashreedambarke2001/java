package corejava;

import java.io.*;

public class SwappingByReference {
 
	int a=10;
	int b=20;

	void swap(SwappingByReference sr) {
		
		sr.a=sr.a+10;
		sr.b=sr.b+20;

	}
	
public static void main(String[]args){

	SwappingByReference sr=new SwappingByReference();
	
	System.out.println("before swapping");

System.out.println("sr.a="+sr.a+" sr.b="+sr.b);

sr.swap(sr);
System.out.println("after Swapping in main method");

System.out.println("sr.a="+sr.a+" sr.b="+sr.b);
}


}
