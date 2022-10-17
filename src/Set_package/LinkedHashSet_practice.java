package Set_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class LinkedHashSet_practice {

	public static void main(String[] args) {


       Set<String> car = new LinkedHashSet<>();
		
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
		
		for(String c:car) {
			System.out.println(c);

	}
		// converting from set to list to apply reverse method
		List<String> car1 = new ArrayList<>(car);
		Collections.reverse(car1);
		
		System.out.println(car1);

	}

}
