package conditionsPractice;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

		   /*if I have 6  hours and 5 I will travel by shared taxi
			*if I have 5 to 4 hours i will travel by bus
			*if i have 4 to 3 hours I will travel by train
			*if i have 3 to 2 hours i will travel by my own car
			*if i have 2 to 1 our i will travel by plan
			*if i have less than 1 hours i will stay at home*/
			
			Scanner scan = new Scanner(System.in);
			
			   System.out.println("Enter your time amount");
	           int time= scan.nextInt();
		
	         if(time==6 || time==5) {
		     System.out.println("you can travel by shared taxi");
	         }
			 
	         else if(time==5 || time==4)	{
		     System.out.println("you can travel by bus");
	         }
	      
	         else if(time==4 || time==3)	{
		 	 System.out.println("you can travel by train");
		     } 
	      
	         else if(time==3 || time==2)	{
		  	 System.out.println("you can travel by your own car");
		 	 }
	      
	         else if(time==2 || time==1)	{
		  	 System.out.println("you can travel by plane");
		  	 }
	      
	         else	{
		  	 System.out.println("Sorry, you have to stay at home");
	         }

			scan.close();	
			
	}

}
