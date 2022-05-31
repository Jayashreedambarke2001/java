package corejava;

public class TypeCastingConversion {

			public static void main(String[] args) {
				
				// Implicit Conversion
				
				int i = 200;
				
				double d = i ;
				
				System.out.println("Integer value : " + i);
				System.out.println("Converion to Double : " + d);
				
				//Explicit Conversion
				
				double dd = 198.158;
				
				int ii =(int) dd ;
				
				System.out.println("Double value : " + dd);
				System.out.println("Converion to Integer : " + ii);
			}
		}

