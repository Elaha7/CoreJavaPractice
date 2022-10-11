package Userdefined_custome_E;

public class UserDefined2 {

	public static void main(String[] args) {

     System.out.println("main method");
		
		validAge(-5);	
			
			
			
			
		}
	   public static void validAge(int age) throws invalidAgeException {
		   
		   if (age<0) {
			   
			 throw new invalidAgeException("age can not be less than zero"); 
			 
			 //for throw new exception we can pass a string message, but in our own custom 
			// exception class we can't pass any message because it dosen't have any constructor to take in that string message 
			// as a parameter, but we can create a new constructor in our exception class to take that message
		   }
		   else {
			   System.out.println("your age is valid");

	}
	   }
}

