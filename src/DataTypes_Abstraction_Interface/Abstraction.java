package DataTypes_Abstraction_Interface;

public class Abstraction {

}
		/*1. create an abstract class and name it AbstractClass
		A. create 3 abstract method in this abstract class as below
		     1. void carModel();
		     2. String carColor(String color);
		     3. int carYearBuild();*/

		 abstract class AbstractClass {

         abstract void carModel();

		 abstract String carColor(String color);

		 abstract int carYearBuild(); 
		 
		}


		/*2. create an Interface and name it InterfaceOne
		A. create two methods accepted by interface as below:
		     1. sum(int a, int b);
		     2. sub(int a, int b);*/

		    interface InterfaceOne{
			abstract void sum(int a, int b);
		    abstract void sub(int a, int b);
		}


		/*3. create a regular class and name it RegularClass
		A. extends and implements abstract class and interface methods to this regular class
		     1. create or instantiate or invoke the object of this class
		     2. call methods in this class inherited from abstract class and interface*/

		class RegularClass extends AbstractClass implements InterfaceOne{

		    public static void main(String[] args) {
			 
		    	RegularClass obj=new RegularClass();
		    	obj.carColor("red");
		    	obj.carModel();
		    	obj.carYearBuild();
		    	obj.sub(80, 30);
		    	obj.sum(20, 30);
		    	
			}
			

				@Override
				public void sum(int a, int b) {
				int c = 20 + 30;
				System.out.println(c);	
				}

				@Override
				public void sub(int a, int b) {
				int f = a-b;	
				 System.out.println(f);
				}

				@Override
				void carModel() {
				System.out.println("Tesla");	
					
				}

				@Override
				String carColor(String color) {
					
					return "blue";
				}

				@Override
				int carYearBuild() {
					
					return 2020;
				}
				
				
			}    
		
	


