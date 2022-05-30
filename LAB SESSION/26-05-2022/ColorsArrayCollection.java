package corejava;

// java program to create a new array list
// add some colors and print out the collection
		import java.util.ArrayList;
		import java.util.Scanner;
		
		public class ColorsArrayCollection {
		
		// Main driver method

					public static void main(String[] args) {
						
                   // creating scanner class object
						Scanner s = new Scanner(System.in);
						 
					        ArrayList<String> color = new ArrayList<String>();
					        color.add("BLUE");
					        color.add("WHITE");
					        color.add("PINK");
					        color.add("RED");
					        color.add("GREEN");
					        		        
			 System.out.print("Enter the color:"+color);
	}

}
