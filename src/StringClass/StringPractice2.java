package StringClass;

public class StringPractice2 {

	public static void main(String[] args) {

		String fruits = "apple-plum-banana-orange-papaya-grape-mango-kewi-pear-cherry-peach-";
		
		String fr[]= fruits.split("-");
		System.out.println(fr.length);
		
		//for loop to print all fruits in order
		for(int i=0; i<fr.length; i++) {
			System.out.println(fr[i]);
		}
		
		System.out.println("\n");
		
		// for loop to print only fruits that starts with "p" letter
		for(int i=0; i<fr.length; i++) {
			if(fr[i].startsWith("p")) {
				System.out.println(fr[i]);
			}
		}
		
		
		
		
		
		
	}

}
