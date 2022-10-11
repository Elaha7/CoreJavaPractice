package Compiletime_Exception;

public class Interrupted_E {

	public static void main(String[] args) throws InterruptedException {

    System.out.println("This is the start");
    
    Interrupted_E ie = new Interrupted_E();	
	ie.test();
		
	try {
		Thread.sleep(5000);
	}
	catch (InterruptedException e)	{
		e.printStackTrace();
	}
		
	System.out.println("This is the end");	
		
	}
 //if we handle compiletime exception inside method or main method we will not have any error during object creation
// but if we dont handle it and just use throws declaration we have to use it in each method that we creat object 
//for this method
	
	public void test() throws InterruptedException {
		System.out.println("Start");
		Thread.sleep(2000);
		
		System.out.println("this is last statement");
		
	}
	
}
