package Set_package;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iterating_Set {

	public static void main(String[] args) {
		
		//we can't iterate set using normal for loop because set dosen't follow any index
		//there are two ways to Iterate set, enhanced for loop, and using Iterator
        
		Set<String> car = new LinkedHashSet();
		
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
		
		//using enhanced for loop
		for(String c : car) {
			System.out.println(c);
		}
		System.out.println("\n");

		//using Iterator
		Iterator<String> it = car.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
			
			System.out.println("\n");

			//using forEach method
			car.forEach(c -> System.out.println(c));
		
	}

}
