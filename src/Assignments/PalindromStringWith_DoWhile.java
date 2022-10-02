package Assignments;

import java.util.Scanner;

public class PalindromStringWith_DoWhile {

	public static void main(String[] args) {


		boolean exception = true;
	    
		Scanner scan = new Scanner(System.in);
		
		do {
	    System.out.println("Enter the String You want to check: ");
	    
	    String m1 = scan.nextLine();
	    String org = m1;
	    String rev = "";
	    
		for(int i=m1.length()-1; i>=0; i--)	{
			
			rev = rev+m1.charAt(i);
			    System.out.print(m1.charAt(i));
		} 
			if (org.equalsIgnoreCase(rev)) {
				 System.out.println(" is a palindrome string");
			}
			else {
				System.out.println(" This string is not palindrome");
			} 
		}
			
		while(exception);

	}

}
