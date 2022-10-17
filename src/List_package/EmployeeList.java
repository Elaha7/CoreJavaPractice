package List_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

  //Generic

    public class EmployeeList {

	public static void main(String[] args) {

	List<Employee > list = new ArrayList<>();
	
	Employee em= new Employee();
	em.setFirstname("Lisa");	
	em.setLastname("Smith");
	em.setAddress("Maryland");
	em.setAge(30);
	
	
	Employee em1= new Employee();
	em1.setFirstname("Robert");	
	em1.setLastname("Obama");
	em1.setAddress("columbia");
	em1.setAge(35);
	
	
	Employee em2= new Employee();
	em2.setFirstname("Sam");	
	em2.setLastname("Jackson");
	em2.setAddress("Towson");
	em2.setAge(32);
	
	System.out.println(list.add(em));
	System.out.println(list.add(em1));
	System.out.println(list.add(em2));
	
	System.out.println(list);
	
	System.out.println("\n");
	
   //normal for loop
	for(int i=0; i<list.size(); i++)
	{
		System.out.println(list.get(i));
	}	
	
	System.out.println("\n");
	
	//for each/ enhanced for loop
    for (Employee emp: list) {
    	System.out.println(emp);
    }
	
	System.out.println("\n");

	//Iterator while loop
	Iterator<Employee> itr = list.iterator();
    while(itr.hasNext()) {
       
    	System.out.println(itr.next());
    }
    
    System.out.println("\n");
	
    // if we only want to print the specific address employee we use if condition inside for loop
    for (Employee emp: list) {
    	
    	if(emp.getAddress().contains("Maryland")) {
    		System.out.println(emp);
    	}
    
    }
	
	}
}
