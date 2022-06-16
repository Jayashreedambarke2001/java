package corejava;

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

// Creating a class 
public class ToyExample {

// Creating a Multidimensional String array
  String[][] toys = new String [4][4];

 // creating a Constructor
 ToyExample()
  {
 
toys [0][0]="1";
 toys[0][1]="Lattu";

 toys [1][0]="2";
 toys [1][1] ="Bhatukali";

 toys [2][0]="3";
 toys [2][1]="Barbie Doll";

toys [3][0]="4";
toys [3][1]="Pikachu";
	 }
  public static String getToy(int price)
  {
String ToysName;	        
 // price for each toy using switch case
 switch(price)
 {
 case 100: 
 ToysName= "Pogo stick";
 return ToysName;
	            
 case 250:
	 ToysName = "Bhatukali";	  
 return ToysName;

case 150:
	ToysName = "Barbie Doll";
return ToysName;
	                
case 350:
	ToysName = "Pikachu";
return ToysName;
	                
 default:
	 ToysName= "No Toys Available in this Range";
return ToysName;
 }
  }

 public static void main(String[] args) {
// creating object of scanner class
	    	
Scanner sc = new Scanner (System.in); 
System.out.println("enter the price for toy:");

int price1 = sc.nextInt ();
System.out.println(getToy(price1));

int price2 = sc.nextInt();
System.out.println(getToy(price2));

int price3 = sc.nextInt();
System.out.println(getToy(price3));

int price4 = sc.nextInt();
System.out.println(getToy(price4));

sc.close();
 
 }
 }
