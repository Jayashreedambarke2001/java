package corejava;

public class ANDoperator {



			public static void main(String[] args) {
					//intialising variables
				int a=10, b=20, c=20, d=0;
					//a, b, c displaying
				System.out.println("Value of a: "+ a);
				System.out.println("Value of b: "+ b);
				System.out.println("Value of c: "+ c);
					//using logical AND to Verify Two constraints
				if((a<b) && (b==c)) {
					d=a+b+c;
					System.out.println("Sum is: " + d);
				}
				else
					System.out.println("False Condition");
				}
	}

