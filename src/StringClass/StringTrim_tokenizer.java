package StringClass;

import java.util.StringTokenizer;

public class StringTrim_tokenizer {

	public static void main(String[] args) {

    String name = " Ahmed Rashed ";
	System.out.println(name);
	
    String n = name.trim(); //this method remove empty spaces of start and end of string
    System.out.println(n);
    
    
    String states = "Maryland&Washington#Viriginia@California#NewYork%NewJersey$Florida";
    
    //string tokenizer is a class which separate strings which have different delimiters 
    
    StringTokenizer st = new StringTokenizer(states, "%&@#$");
    
	/*
	 * while(st.hasMoreElements()) {
	 * 
	 * Object st1 = st.nextElement(); System.out.println(st1); }
	 */
    
	//if we want to skip one string in print time between strings we use if statement
    
    while(st.hasMoreElements()) {
    	
    	String st2 = (String) st.nextElement();
    	if (!st2.equalsIgnoreCase("California")) {
    	 System.out.println(st2);
     }
	}
	}
}
