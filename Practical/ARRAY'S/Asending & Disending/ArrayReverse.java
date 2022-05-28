

		package corejava;
		//Java program to sort an array of strings
		//in ascending and descending alphabetical order
		//Using Arrays.sort()

		//Importing arrays and Collections class
		//from java.util class
		import java.util.Arrays;
		import java.util.Collections;

		//Main class
		public class ArrayReverse{

		    // Main driver method
		    public static void main(String[] args)
		    {
		        // Custom input string
		        String arr[] = { "Anuja",
		                        "Tejas",
		                        "Jayshree","Shubham" };

		        // Sorts arr[] in ascending order
		        Arrays.sort(arr);
		        System.out.println("In Ascending Order Modified arr[] : \n"+Arrays.toString(arr));

		        // Sorts arr[] in descending order
		        Arrays.sort(arr, Collections.reverseOrder());

		 

		        // Lastly printing the above array
		        System.out.println("\n In descending Order Modified arr[] : \n"+Arrays.toString(arr));
		    }
		}
	


