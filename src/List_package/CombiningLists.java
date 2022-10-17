package List_package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombiningLists {

	public static void main(String[] args) {

		List fruits = new ArrayList();
		List fruits1 = new LinkedList();
		
       fruits.add("apple");
       fruits.add("orange");
       fruits.add("mango");
       fruits.add("blueberry");
       fruits.add("watermelon");
       fruits.add("pineapple");
	   System.out.println(fruits);
	   
	   fruits1.add("grape");
       fruits1.add("cherry");
       fruits1.add("pear");
	   System.out.println(fruits1);
		
	  // fruits.add(fruits1); //add is for adding single elements and addAll is to add two lists without array symbol
	   //System.out.println(fruits);
		
	   fruits.addAll(fruits1);
	   System.out.println(fruits);
		
	   //fruits.removeAll(fruits1);
       System.out.println(fruits);
       
       fruits.retainAll(fruits1);
       //retainAll will keep the elements we want and remove the rest(keep fruits1 remove fruits)
	   System.out.println(fruits);
	
	   
	
	
	
	}

}
