package corejava;

public class narrowingcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=200.06;
		//explicit type casting
		long l=(long)d;
		//explicit type casting
		int i=(int)l;
		System.out.println("double data type value"+d);
		//fractional part lost
		System.out.println("long data type value"+l);
		//fractional part lost
		System.out.println("int data type value"+i);
		
		

	}

}
