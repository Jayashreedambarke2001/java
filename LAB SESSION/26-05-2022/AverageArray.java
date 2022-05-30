package corejava;

//java program average of int Array
		import java.util.Scanner;

		public class AverageArray {	
			
			// Main driver method

					public static void main(String[] args) {

						// creating scanner class object
						
						Scanner s = new Scanner(System.in);
						 
				        System.out.println("Enter array size: ");
				        int size = s.nextInt();
				        
				        // create an array
				        
				        int[] array = new int[size];
				 
				        // reading values from user keyboard
				        System.out.println("Enter array values :  ");
				        
				        for (int i = 0; i < size; i++) {
				            int value = s.nextInt();
				            array[i] = value;
				 
				        }

				        int length = array.length;
				 
				            int sum = 0;
				        
				        for (int i = 0; i < array.length; i++) {
				            sum += array[i];
				        }
				 
				        double average = sum / length;
				        sum = 0;
				 
				        for (int i = 0; i < array.length; i++) {
				            sum += array[i];
				        }
				 
				         average = sum / length;
                        // print average array				 
				        System.out.println("Average of array : " + average);
				 
				    }
				}


			 
		 


