package Compiletime_Exception;

import java.util.InputMismatchException;

public class FinallyBlock {

	public static void main(String[] args) {

    System.out.println("start");
		
	String name = null;	
		
	try {
		System.out.println("start...2");
		
		int n = name.length();
		
		int num = 5/0;
		System.out.println(n + num);
	}
		
	catch (ArithmeticException | InputMismatchException | NullPointerException e) {
		e.printStackTrace();
	}
	finally {     //we use finally to execute important business logics and close connections
		System.out.println("end......");
	}
	
	System.out.println("end...2");
	}
}
