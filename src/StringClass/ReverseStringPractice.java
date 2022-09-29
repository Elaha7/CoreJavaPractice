package StringClass;

public class ReverseStringPractice {

	public static void main(String[] args) {

     String flower = "Jasmine";
	 System.out.println(flower);
		
	StringBuilder f1 = new StringBuilder(flower);
	f1.reverse();
	f1.toString();
	System.out.println(f1);
		
		
	
	//second way for reversion without using StringBuffer and StringBuilder
     
	for (int i=flower.length()-1;  i>=0;  i--) {
	
	      char f2= flower.charAt(i);
	      System.out.print((f2));
	}
	
  }

}
