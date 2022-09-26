package conditionsPractice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your day number");
        int day= scan.nextInt();
		
		
		switch (day) {
		
		
		
		case 1:
			System.out.println("Today is Monday we have class");
			break;
			
		case 2:
			System.out.println("Today is Tuesday we have class");
			break;	
			
		case 3:
			System.out.println("Today is Wednesday we have class");
			break;	
		
		case 4: 	
			System.out.println("Today is Thursday we have class");
			break;
			
			
		case 5: case 6: case 7:
			System.out.println("Today is off, there is no class today");
		break;
		
		}
			
		scan.close();
			

	}

}
