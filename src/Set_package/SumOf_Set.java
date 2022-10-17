package Set_package;

import java.util.HashSet;
import java.util.Set;

public class SumOf_Set {

	public static void main(String[] args) {


		 int[] array = {10, 20, 30, 40, 50};
	      int sum = 0;
	      for(int n : array) {
	          sum = sum+n;
	      }
	      System.out.println("Sum of array elements is: "+sum);
	      

		Set<Integer> num = new HashSet<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		
		System.out.println("\n");
		
		
		//First way to check if an element is in a set
		boolean n1 = num.contains(50);
		System.out.println(n1);
		
		if (n1) {
			System.out.println("50 is part of HashSet");
		}
		else {
			System.out.println("50 is not part of HashSet");
		}
		System.out.println("\n");
		
		//Sum of List
		int sum1 = 0;
		for (Integer e : num)
			sum1 += e; // here we can also write sum1 = sum1 + e; 
		System.out.println("sum of this set is " +sum1);
		
		System.out.println("\n");
		
		//Second way	
		if(num.contains(50)) {
			
			System.out.println("50 is included in this set");
		}
		else {
			
			System.out.println("50 is not included in this Set");
		}

	}

}
