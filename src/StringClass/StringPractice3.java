package StringClass;

public class StringPractice3 {

	public static void main(String[] args) {

    String bank = "BankOfAmerica";
    String bank2 = "ChaseBank";
    
    boolean b = bank.isBlank();//checking content (data)
    System.out.println(b);
		
	boolean b1 = bank.isEmpty(); //checking the length if we enter space it will return false
	System.out.println(b1);	
	
	boolean b2 = bank.contentEquals(bank2);
	System.out.println(b2);
	
	int b3 = bank.hashCode();
	System.out.println(b3);
	
	String b4 = bank.intern();
	System.out.println(b4);
	
	boolean b5 = bank.matches(bank2);
	System.out.println(b5);
	
	String b6 = bank.toString();
	System.out.println(b6);
	}

}
