package corejava;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter your age");
int age =sc.nextInt();
if(age >=18) {
	System.out.println("you are eligible for voting");
	
}
else {
	System.out.println("you are not eligible for voting");
	
}
	}

}
