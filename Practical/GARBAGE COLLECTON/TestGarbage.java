package corejava;

//creating a class
public class TestGarbage{

	public void finalize(){
		System.out.println("garbage collected object");}

	
	public static void main(String[] args) {
		
		// creating a class of object
		TestGarbage s1=new TestGarbage();
		TestGarbage s2=new TestGarbage();

		s1=null;
		s2=null;
		// printing a garbage collector
		System.gc();
	}

}
