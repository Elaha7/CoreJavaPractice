package Runtime_Exceptions;

import java.util.Scanner;

public class ArrayIndexOutofBounds_E {

	public static void main(String[] args) {
    
	System.out.println("this will be printed");
		
	String name[] = {"Bob", "Lisa", "Laurel", "Tina"};
	
    int num[] = {20, 50, 15, 55, 10};
    
	try {
		System.out.println(num[3] + name[7]);	
	}
	
	catch  
	(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("Bro! there are 3 strings inside this array");
	}
	
	System.out.println("Got it?");	
	
	Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
	    scan.close();	
	System.out.println("Okay great");	
	}

}
