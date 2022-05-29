package corejava;


		 class AbstractionOne extends Abstraction {
			
			public int Multiply(int n1, int n2) {
				return n1*n2;
			}
				
			public int MultiplyOne(int n1, int n2, int n3) { 
				return n1*n2*n3;
				}
			
			public static void main(String[]args) {
					Abstraction a = new AbstractionOne();
					
						System.out.println ("Multiplication of 2 numbers: " + a.Multiply(10, 50));  
				    	System.out.println ("Multiplication of 3 numbers: " + a.MultiplyOne(5, 8, 10));
				    	
				}
			
		}

