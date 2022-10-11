package Runtime_Exceptions;

public class ArithmeticExceptionpractice {

	public static void main(String[] args) {

     System.out.println("Arithemetic Exception");
     
     int a = 10;
     int a1 = 0;
     
		
     try
 	{
 		int x = a/a1;
 		System.out.println(x);
 	}
 	catch(ArithmeticException e)
 	{
 		e.printStackTrace();
 	}
 	
 	System.out.println(" You are dividing number by zero!");
		  
     
     
     
	}

}
