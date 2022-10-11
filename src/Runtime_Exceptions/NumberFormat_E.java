package Runtime_Exceptions;

public class NumberFormat_E {

	public static void main(String[] args) {

    System.out.println("Welcome");
		
	String year = "2022";
	
	//wrapper class
	//we can convert from String with number value to integer successfully
	int year1 = Integer.parseInt(year);
	System.out.println(year1);
	
	//if we want to convert from characters to numbers we will get numberFormat Exception
	String time = "5 pm";
	try {
		int time1 = Integer.parseInt(time);
		System.out.println(time1);
	}
	catch (NumberFormatException e) {
		e.printStackTrace();
	}
	
	System.out.println("Have a great time");
	}

}
