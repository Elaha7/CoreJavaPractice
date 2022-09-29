package StringClass;

public class StringBuffer_Builder {

	public static void main(String[] args) {

         StringBuffer s1 = new StringBuffer();
		
		 StringBuilder s2 = new StringBuilder();
		
		StringBuffer s3 = s1.append("Tesla");
		System.out.println(s3);
		
		StringBuilder s4 = s2.append("Corolla");
		System.out.println(s4.hashCode());
		
		s2.reverse();
		System.out.println(s2);
		
		int s5 = s1.length();
		System.out.println(s5);
		
		int s6 = s2.indexOf("o");
		System.out.println(s6);
		
		String s7 = s2.substring(0, 4);
		System.out.println(s7);
		
		int s8 = s1.charAt(4);//if we write return type as int it will return ASCI number of char
		System.out.println(s8);
		
		char s9 = s1.charAt(4);
		System.out.println(s9);
	}

}
