package Assignments;

import java.util.Scanner;

public class PalindromString_assignment {

	public static void main(String[] args) {
		
		/*
		 Write a program to check entered string is palindrome or not 
		 Example: aba is a palindrome         blr is a not palindrome
		 */
  
    
	Scanner scan = new Scanner(System.in);
	
    System.out.println("Enter the String You want to check:");
    
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
	
}

