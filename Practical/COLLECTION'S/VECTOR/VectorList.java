package corejava;

import java.util.Iterator;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
	
		v.add("Ayush");  
		v.add("Amit");
		v.add("Aamar");
		v.add("Aakash");
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}

}
}
