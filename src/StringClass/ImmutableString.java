package StringClass;

public class ImmutableString {

	public static void main(String[] args) {
    
	//when we create object in literal way we create an immutable(fixed) string 
		
      String state = "Washington ";
     
   // the output is Washington only because string is immutable and we can't change or modify it directly 
     // using same variable
      
      state.concat("D.C");
      System.out.println(state);
	 
    //if we want to modify the string we have to create different variable, here new object will be created
    // if we check their hash code we can see that they are different objects
      
      String s = state.concat("D.C");
      System.out.println(s);
      
      int h1= state.hashCode();
      System.out.println(h1);
      
      int h2 = s.hashCode();
      System.out.println(h2);
      
      //or we can reinitialize it using same variable. here it will create new object
      
      state = state.concat("D.C");
      System.out.println(state);
      
      //if we create new variable but same object it will point to the same object and will not create
      //new object and this is called as pooling object which reuse the same object because data is same
      
	}

}
