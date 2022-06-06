package corejava;

//java program showcasing uses of call by value in this example

// importing java input output classes
import java.io.*;

//class
public class CallByValue {

	//method to swap numbers
	static void swap(int a,int b)
	{
		//creating a temporary variables in stack memory
		// and updating values in it.
		
		//step 1
		int temp=a;
		//step 2
		a=b;
		//step 3
		b=temp;
		
		//display message after swapping numbers

		System.out.println("after swapping x="+a + "y="+b);		
		
	}
	public static void main(String[] args) {

		//custom inputs/numbers to be swapped
		int x=5;
		int y=7;
		

	//display message before swapping numbers 
	System.out.println("before swapping x="+x +"y="+y);
	
	//using above creating method to swap numbers
		swap(x,y);

	
	}
}