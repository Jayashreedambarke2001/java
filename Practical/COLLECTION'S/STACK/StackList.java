package corejava;

import java.util.Iterator;
import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush"); 
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");
		stack.pop();
	    stack.push("garima");
		 
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
	}

}

