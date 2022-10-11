package Runtime_Exceptions;

public class StringIndexOutOfBounds_E {

	public static void main(String[] args) {

    String fruit = "apple";

    try
	{
		char f1 = fruit.charAt(9);
		System.out.println(f1);
	}
	    catch(StringIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	
	    System.out.println("Your string has only five characters");
	}
   
	}

}
