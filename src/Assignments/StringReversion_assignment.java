package Assignments;

public class StringReversion_assignment {

	public static void main(String[] args) {

    //Write a program to reverse a String (Don’t use predefined method called reverse)

	String weather = "Rainy";	
	System.out.println(weather);	
		
	for(int i = weather.length()-1; i>=0; i--) {
		
		System.out.print(weather.charAt(i));
	}
		
		
	}

}
