package corejava;

public class ParameterizedCons {

//Default Constructor
	ParameterizedCons(){
		System.out.println("Default Constructor");
	}
/*Parameterized Constructor with
 * two integer arguments
 */
	ParameterizedCons(int i,int j){
	System.out.println("Constructor with two parameter");
	}
	/*Parameterized Constructor with
	 * three integer arguments
	 */
ParameterizedCons(int i,int j,int k){
	System.out.println("Constructor with three parameter");
	}
/*Parameterized Constructor with
 * two arguments,int and string
 */
ParameterizedCons(int i,String name){
	System.out.println("Constructor with int and String param");
}
public static void main(String []args) {
	//this will invoke default constructor
	ParameterizedCons obj = new ParameterizedCons();
	/*this will invoke the Constructor
	 * with two int Parameters
	 */
	ParameterizedCons obj2 = new ParameterizedCons(12,12);
	/*this will invoke the Constructor
	 * with three int Parameters
	 */
	ParameterizedCons obj3 = new ParameterizedCons(1,2,13);
	/*this will invoke the Construtor
	 * with int and string parameters
	 */
	ParameterizedCons obj4 = new ParameterizedCons( 1,"java");
	
}
}

