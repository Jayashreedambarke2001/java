package corejava;

import java.util.Scanner;


public class ElectricityBill {

	// creating static method calculate ElectricityBill
		static double calculateElectricityBill(int units) {
			 
			int u;
			double amt =0,uni;
			uni= units;
			if(units<=0) {
				return units;
			}
			else {
				
				//calculation for bill unit greater than 30
				if(units>30) {
					u=units-30;
					amt=30.0*3.5;
					if(u>30 && u>=70) {
					u=u-70;
					amt=amt+(70*4);
				
					}
					
					// for unit value between 1-30
					amt=amt+(u*5);
				}
				else {
					amt=uni*3.5;
					
				}
			}
			return amt;
			
		}
		public static void main(String[] args) {

			int units;
		   double amount ;
		   //creating object of scanner class
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter units");	
 
			units=sc.nextInt();
			amount = calculateElectricityBill(units);
			
			// calling static method calculate electricity bill & storing the ammount
			if(amount<0) {
				System.out.println("INVALID INPUT");
			}
			else if (amount==0) {
				System.out.println(0.0);
			}
			else {
				System.out.println(amount);
			}
		}

	}

