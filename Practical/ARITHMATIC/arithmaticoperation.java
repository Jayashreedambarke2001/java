package corejava;

import java.util.Scanner;

public class arithmaticoperation {

	public static void main(String[] args) {
		// create object of Scanner class
		Scanner sc=new Scanner(System.in);
		
		//input two nos from user
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		//perform arithmatic operation
		int add,sub,mul,div,mod;
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		
		//print result
		System.out.println("addition is :+add");
System.out.println("substraction is;=sub");
System.out.println("multiplication is;+mul");
System.out.println("divison is ;+div");
System.out.println("modulation is :+mod");

	}

}
