package LoopsPractice;

import java.util.Scanner;

public class Dowhile_Loop {

	public static void main(String[] args) {


		/*
        Enter 1 for Yum Yum Burger
		Enter 2 for Grease Yum Fries
		Enter 3 for Soda Yum
		Enter now -> 2
		Enter the number of fries you want 2
		Do you want to end your order? (yes/no): no
		
		The total price is $ 8.1832
		Do you want to end program? (yes/no): no */
    
		
		boolean b = false;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter 1 for Yum Yum Burger");
			System.out.println("Enter 2 for Grease Yum Fries");
			System.out.println("Enter 3 for Soda Yum");
			
			scan.nextLine();
			
			
			System.out.println("Enter the number of items you want");
			scan.nextInt();
			scan.nextLine();
			
			System.out.println("Do you want to end your order? (yes/no)");
			scan.nextLine();
	
			System.out.println("The total price is $ 8.1832");
			
			System.out.println("Do you want to end program? (yes/no)");
			
			String decision = scan.nextLine();
			
			if(decision.equalsIgnoreCase("no")) {
				b = true;
			}
			else
			{
				break;
			}
		}
		while(b);
		
		scan.close();

	}

}
