package Variables_Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("what is your name?");
	   String name = scan.nextLine();
	   
		
		System.out.println("how old are you?");
		int age = scan.nextInt();
		
		scan.nextLine();
			
		System.out.println("what is your favorite food?");
		String food = scan.nextLine();
		 
		System.out.println("where are you from?");
		String place = scan.nextLine();
		
		
		System.out.println("Hello nice to meet you " +name);
		System.out.println("I am also "+ age + " years old");
		System.out.println("your favorite food is "+ food + " but I like Gyro");
		System.out.println("I like your country " + place + " and I am from America");

		scan.close();
		
	}

}
