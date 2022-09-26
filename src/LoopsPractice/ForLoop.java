package LoopsPractice;

public class ForLoop {

	public static void main(String[] args) {

    //Even and odd numbers
		
        int number = 30;
		
		for (int n =1; n<=number; n++) {
			
		if(n %2 == 0){
			System.out.println("even "+n);
		} 
		else if(n %2 !=0) {
			System.out.println("odd  "+n);
		}
		else if (n ==0) {
			  System.out.println("zero"+n);
		}
		
	}
		System.out.println("____________________________________");
		
		
			int r = 30;
			if (r %2 == 0) {
				
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}

	}

}
