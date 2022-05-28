package corejava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedArrayList {

	 
		public static void main(String args[]){ 
			
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Rekha");  
		al.add("Sanjana");  
		al.add("Kavita");  
		al.add("Aamita");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}
		}
		
}


