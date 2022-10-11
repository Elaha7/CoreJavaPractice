package Assignments;

import java.util.Scanner;

public class Calculate_interestRate {

	public static void main(String[] args) {
		
		//Write a program to calculate simple interest (Need to take inputs from keyboard)

        Scanner scan= new Scanner(System.in);
	    
	    System.out.println("Enter the amount: ");
	    int amount = scan.nextInt();
	    
	    System.out.println("Enter interest rate percentage in a mount: ");
	    float rate = scan.nextFloat();
	    
	    System.out.println("Enter the time you want to calculate in mounts");
		int time = scan.nextInt();	
			
		double intrestRate = (amount*rate*time)/100;
		System.out.println(intrestRate);	
		
		scan.close();
	}

}
