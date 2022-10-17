package List_package;

import java.util.*;

public class List_Methods {

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
		
	   fruits.set(0, "strawberry");
	   System.out.println(fruits);
	   
	   int f4 = fruits.indexOf("orange");
	   System.out.println(f4);
	   
	   fruits.remove(1);
	   System.out.println(fruits);
	   
	   int f = fruits.size();
	   System.out.println(f);
	   
	   boolean f1 = fruits.isEmpty();
	   System.out.println(f1);
	   
	   Object f3 = fruits.get(3);
	   System.out.println(f3);
	   
	   boolean f5 = fruits.contains("watermelon");
	   System.out.println(f5);
	   
	   boolean f6 = fruits.isEmpty();
	   System.out.println(f6);
	   
	   fruits.set(3, "banana");
	   System.out.println(fruits);
       
	   fruits.add(fruits1);
	   System.out.println(fruits);
       
       List f7 = fruits.subList(2, 6);
       System.out.println(f7);
       
       boolean f8 = fruits.equals(fruits1);
	   System.out.println(f8);
       
	}

}
