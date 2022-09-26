package StringClass;

public class StringPractice {

	public static void main(String[] args) {


		//String literal 
        String city = " Columbia ";
	    String state= "Maryland";
	
	
	    int c = city.length();	
		System.out.println(c);
		
		//this method finds the character of given index
        char c1 = city.charAt(5);
        System.out.println(c1);
		
        //this method connect two strings together
		String c2 = city.concat(" ") .concat(state);
		System.out.println(c2);
		
		String c3 = city.concat("\n").concat(state);
		System.out.println(c3);
		
		boolean c4 = state.contains("Ma");
		System.out.println(c4);
		
		boolean c5 = state.contains("ln");
		System.out.println(c5);
		
		boolean c6 = city.equalsIgnoreCase("columbia");
		System.out.println(c6);
		
		String c7 = state.toUpperCase();
		System.out.println(c7);
		
		boolean c8 = state.startsWith("mar");
		System.out.println(c8);
		
		boolean c9 = state.endsWith("d");
		System.out.println(c9);
		
		//this method print the index number of the character we give
		int c10 = state.indexOf("l");
		System.out.println(c10);
		
		System.out.println(city.isEmpty());
		
		//This method cut space before and after the string
	    System.out.println(city.trim());
		
		System.out.println(state.replace("y", "o"));
		
		//This method cut the characters before and after the index numbers we give
		System.out.println(city.subSequence(3, 8));
		
		// Here, starting index is inclusive and ending index is exclusive
		System.out.println(city.substring(0, 4));
		System.out.println(city.substring(5));// If we don't specify ending index then it will take till end of the String
		
		System.out.println(state.equals("maryland"));
		
		//This method compare both strings based on their ASCI value
		int i = city.compareTo("Columbia");
		if(i == 0)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("not same");
		}
		
		int j = state.compareToIgnoreCase("maryland");
		if(j == 0)
		{
			System.out.println("same values");
		}
		else
		{
			System.out.println("different values");
		}
		
		
		
		
	}

}
