package corejava;


import java.util.*;  
	public class HS{  
		public static void main(String args[]){
			
			//Creating HashSet and adding elements  
			HashSet set=new HashSet<String>();  
			set.add("Anuja");  
			set.add("Tejas");  
			set.add("Jayashree");  
			set.add("Shubham");  
			
			//Traversing elements  
			Iterator<String> itr=set.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}  
		}  
	}