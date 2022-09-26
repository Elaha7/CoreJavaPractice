package Variables_Scanner;

public class variables {
	
	//global variables

	    //Global variable:
		//Which variable scope is at the class level then those variables we can call as Global variable.
		
		public static String food= "pizza";
		public String fruit= "mango";


		public static void main(String[] args) {
			System.out.println("variables");
			
			test();
			test1();
		}
			
		//Local variable:
		//Which variable scope is at the block/method level those variables we can call as Local variables
			
		public static void test() {	
			
		int num = 20;
		String name = " Bob";
		System.out.println(num + name);
		
		System.out.println(variables.food);	
		
		variables GLV=new variables();
		System.out.println(GLV.fruit);		
		}

		public static void test1() {	
			
			System.out.println(variables.food);	
			
			variables GLV=new variables();
			System.out.println(GLV.fruit);	

		

	}

}
