package Runtime_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch_Exception {

	public static void main(String[] args) {
    //when expected value is different and provided value is different we will get inputMismatchException
		
    System.out.println("main method");
    
    Scanner scan =new Scanner(System.in);
	int num = 0;
    int Snum = 0;
    
    try {
	System.out.println("Enter any number");	
	   num = scan.nextInt();
	
	System.out.println("Enter second number");
	   Snum = scan.nextInt();	
	}
    catch(InputMismatchException e) {
    	e.printStackTrace();
    	System.out.println("Enter a number not characters");
    }
    
    int sum = num+Snum;
    System.out.println(sum);
    
    scan.close();
    
    
    
    
	}
}
