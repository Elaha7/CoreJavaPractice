package Compiletime_Exception;

public class ReturnStatement {

	public static void main(String[] args) {

//Practice return type related programs		
		
		ReturnStatement rs = new ReturnStatement();
		System.out.println(rs.test());
		System.out.println(rs.test1());
		System.out.println(rs.test2());
		System.out.println(rs.test3());
	}
	public int test() {
//when there is no condition in try block and no exception in catch block they both will not execute just finally will.
		try {
			return 1;
		}
		 
		catch (Exception e) {
			
			return 2;
		}
		finally {
	 
			return 3; //here only finally block will execute and 3 will be printed
		}
		//System.out.println("end statement");
		//return 4;   if we have return at the end when we have in finally block it will cause compile time error
	}


	public int test1() {
		System.out.println(" -------------- ");
		
		String name = null;
		
		try {
			int n = name.length();
			System.out.println("try block");
			return 1;
		}	
		catch (Exception e) {
			
			System.out.println("catch block");
			return 2;  
			// when there is an exception in try block and we don't have return in finally block
			//it will not print return value in try block and catch will execute it will print 2.
			}
			
		finally {
			//System.out.println("finally block");
			//return 3;
		}
		//System.out.println("end statement");
		// return 4;
	}
	
	
	public int test2() {
		System.out.println(" -------------- ");
		
		String name1 = null;
		
		try {
			int n = name1.length();
			System.out.println("try block");
			return 1;
		}	
			catch (Exception e) {
			//System.out.println("catch block");	
			//return 2;  
			}
			
		finally {
		//	System.out.println("finally block");
		//	return 3;
		}
		System.out.println("end statement"); //when there is only return in try block and at the end, end will execute.
	    return 4;
	}
	
	
	public int test3() {
		System.out.println(" -------------- ");
		
		String name = null;
		
		try {
			int n = name.length();
			//System.out.println("try block");
			//return 1;
		}	
			catch (Exception e) {
				System.out.println("catch block");	
			return 2;  //when there is no return in try and finally block, catch block will execute the end will not.
			}
			
		finally {
		//	System.out.println("finally block");
		//	return 3;
		}
		System.out.println("end statement");
		 return 4;
		
	}
	
	
}
