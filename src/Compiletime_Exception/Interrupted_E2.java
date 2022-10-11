package Compiletime_Exception;

public class Interrupted_E2 {

	public static void main(String[] args) {

		 System.out.println("This is the start");
		 
		 Interrupted_E2 ie2 = new Interrupted_E2();
		 ie2.test();
			
			try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e)	{
				e.printStackTrace();
			}
				
			System.out.println("This is the end");	
				
	}
	//when we use try catch and handle exception it will not throw exception wile we call it inside main method
	
	public void test() {
		System.out.println("Start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println("this is the 2nd end");	
	
	}

}
