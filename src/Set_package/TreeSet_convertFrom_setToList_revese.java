package Set_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_convertFrom_setToList_revese {

	public static void main(String[] args) {


		Set<String> car = new TreeSet<>();
		
		//TreeSet follow sorting order while retrieving and wont allow duplicates
		
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
		System.out.println("\n");
		
		// converting from set to list to apply reverse method because reverse method is not in set interface
		List<String> car1 = new ArrayList<>(car);
		Collections.reverse(car1);
		
		System.out.println(car1);
	}
}
