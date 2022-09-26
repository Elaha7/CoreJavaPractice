package SIB_IIB_Costructor;

public class SIB_IIB {
	
	
	public static void main(String[] args) {
		
		SIB_IIB x=new SIB_IIB();
		SIB_IIB x1=new SIB_IIB();
	}
	
     static {
		System.out.println("this is SIB- Static Initialization Block");
	} 
     
     

     {
    	 System.out.println("this is IIB- Instance or Non Static Initialization Block");
     }
     
   
}
