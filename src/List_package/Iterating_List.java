package List_package;

import java.util.*;

public class Iterating_List {

	public static void main(String[] args) {

		List fruits = new ArrayList();
		List fruits1 = new LinkedList();
		
	   fruits.add("peach");
       fruits.add("apple");
       fruits.add("orange");
       fruits.add("pear");
       fruits.add("blueberry");
       fruits.add("watermelon");
       fruits.add("pineapple");
       fruits.add("plum");
       fruits.add("mango");


	   System.out.println(fruits);
	   
	   fruits1.add("grape");
       fruits1.add("cherry");
       fruits1.add("apricot");
	   System.out.println(fruits1 +"\n");
	   
	   //this method will print all elements in ascending order
	   Collections.sort(fruits);
	   System.out.println(fruits);
	   
	  
	    //normal loop
	   for (int i =0; i<fruits.size(); i++) {
		   
		   // I want to print only fruits starts with "P" so I use if condition. because startswith method does not
		   //exist in list interface so we have to change list to string and than apply startswith method
		   
		   if(fruits.get(i).toString().startsWith("p")) {
		   System.out.println(fruits.get(i));
		   }  
	   }
	   System.out.println("\n");
		
		//Enhanced for loop /for each loop
		for(Object fr:fruits) {
			System.out.println(fr);
		}
		
		   System.out.println("\n");

		// using iterator
		Iterator itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}	
			
		   System.out.println("\n");
	
		//using	list iterator
			
		ListIterator lit = fruits.listIterator();	
		while (lit.hasNext()) {
		System.out.println(lit.next());	
		}
		
		   System.out.println("\n");

		//using forEach method
		fruits.forEach(fr -> System.out.println(fr));
		
		//this method will print all elements in descending order
		 Collections.reverse(fruits);
			System.out.println(fruits);
			
			
	}

}
