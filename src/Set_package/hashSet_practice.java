package Set_package;

import java.util.HashSet;
import java.util.Set;

public class hashSet_practice {

	public static void main(String[] args) {

    Set<String> car = new HashSet<>();
	
    //HashSet doesn't follow insertion order while retrieving and it doesn't allow duplicates
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
		
	}

}
