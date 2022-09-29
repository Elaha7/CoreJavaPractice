package StringClass;

public class Conversion_String_to_StringBuffer {

	public static void main(String[] args) {

     String car = "Chevrolet";
	 System.out.println(car);	
		
	StringBuffer car1 = new StringBuffer(car);
	System.out.println(car1);
	
	String car2 = car1.toString();
	System.out.println(car2);
	
	}

}
