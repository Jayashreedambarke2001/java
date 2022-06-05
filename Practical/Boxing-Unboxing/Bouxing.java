package corejava;

public class Bouxing {

	public static void main(String[] args) {
// assigning primitive long value to wraper long variable x.
// complier performs autoboxing 
		Long x = 430L;
		// assigning primitive long value to wraper long variable x.
Character y='a';
int a=50;

Integer a2=new Integer(a);//boxing
Integer a3=5;//boxing

System.out.println(a2+" \n"+a3);
System.out.println();
System.out.println(x);
		System.out.println(y);
	}

}
