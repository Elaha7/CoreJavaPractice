package List_package;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicatesFromEmployeeList {

	public static void main(String[] args) {


		List<Employee > list = new ArrayList<>();
		
		
		Employee em1= new Employee();
		em1.setFirstname("Robert");	
		em1.setLastname("Obama");
		em1.setAddress("Columbia");
		em1.setAge(35);
		
		
		Employee em2= new Employee();
		em2.setFirstname("Sam");	
		em2.setLastname("Jackson");
		em2.setAddress("Towson");
		em2.setAge(32);
		
		Employee em3= new Employee();
		em3.setFirstname("Lisa");	
		em3.setLastname("Smith");
		em3.setAddress("Maryland");
		em3.setAge(30);
		
		Employee em4= new Employee();
		em4.setFirstname("Robert");	
		em4.setLastname("Tomy");
		em4.setAddress("Alexanderia");
		em4.setAge(38);
		
		Employee em5= new Employee();
		em5.setFirstname("Sam");	
		em5.setLastname("Jackson");
		em5.setAddress("Towson");
		em5.setAge(32);
		
		
		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		list.add(em5);
		
		for(Employee emp : list) {
			
			System.out.println(emp);
		}
		
	}
}
