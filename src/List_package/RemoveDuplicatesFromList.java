package List_package;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {

  List<String> car = new ArrayList<>();
		
		car.add("Tesla");	
	    car.add("Toyota");	
		car.add("Honda");	
		car.add("Mazda");	
		car.add("Chevrolet");
		car.add("Mercedes");
		car.add("Hundai");
		car.add("Tesla");
		car.add("Tesla");	


		
		System.out.println(car);
		System.out.println("\n");
		
		

		// converting from list to set to remove duplicates
		Set<String> car1 = new LinkedHashSet<>(car);
		
		System.out.println(car1);
		

		//removing duplicates using for loop and if condition
		
		List<String> mylist = new ArrayList<String>();
				
				
		for(String ml : car) { 
					  
	      if(mylist.contains(ml)) {  
		 } 
	    else { 
			  
		mylist.add(ml); 
		  }
		System.out.println(mylist);//if we write print statement inside loop block it will print each step of loop
				  }
	    System.out.println("\n");
	    System.out.println(mylist);//if we write print statement outside loop block will only print the last result
				  

			
		 System.out.println("\n");

		//removing duplicates second way
		for(String m : car) {
			if(!mylist.contains(m)) {

				mylist.add(m);
				}
			}
			System.out.println(mylist);
		
	}

}
