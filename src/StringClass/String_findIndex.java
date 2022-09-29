package StringClass;

public class String_findIndex {

	public static void main(String[] args) {

    String country = "UnitedKingdomOfGreatBritainAndNorthernIrland";
		
		int c = country.indexOf("r");
		System.out.println(c);
		
		int c1 = country.lastIndexOf('r');
		System.out.println(c1);
		
		System.out.println("");
		
		findIndex(country, 'n');
		findIndex(country, 'r');
	}

	public static int findIndex(String x, char y) {
		 
		int count = 0;
		int index = -1;
		
		for (int i=0; i<x.length(); i++) {
			
			if(x.charAt(i)== y) {
			  count ++;
			}
			
			if(count ==4) {
				index=i;
				System.out.println(i);
				break;
			}
		}
		
		return index;
	}
	
}
