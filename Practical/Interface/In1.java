package corejava;

	// Java program to demonstrate working of
	// interface

	import java.io.*;
	
	// A simple interface
	interface In1 {
		
		// public, static and final final 
		int a = 5;
		
		// public and abstract
		void display();
		}
	
	// A class that implements the interface.
	class TestClass implements In1 {
		
		// Implementing the capabilities of 
		// interface.
		public void display(){ 
			System.out.println("JAYASHREE"); 
			}
		
		// main method
		public static void main(String[] args) {
			
			TestClass t = new TestClass();// creating object of test class 
			
			t.display(); //calling display method using object
			System.out.println(a); 
			
	}
}
