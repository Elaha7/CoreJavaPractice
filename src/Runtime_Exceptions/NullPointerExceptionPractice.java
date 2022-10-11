package Runtime_Exceptions;

public class NullPointerExceptionPractice {

	public static void main(String[] args) {

    System.out.println("main method");
		
    String car = null;
	try
	{
		String car1 = car.concat("Tesla");
		System.out.println(car1);
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
	}
	
	System.out.println("Your String value is null, please assign a value to your string ");
	
	
	}
		
	}

