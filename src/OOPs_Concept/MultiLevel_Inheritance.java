package OOPs_Concept;

public class MultiLevel_Inheritance {

	public static void main(String[] args) {

		Five5 f1=new Five5();
		f1.washington();
		f1.maryland();

		f1.columbia();
		f1.newyork();
		f1.virginia();
		
		Six6 s1=new Six6();
		s1.columbia();
		s1.newyork();
        s1.virginia();
        
        Seven s2=new Seven();
        s2.virginia();
	}

}

class Five5 extends Six6 {
	public void washington() {
		System.out.println("this is washington");
	}
	
	public void maryland () {
		System.out.println("this is maryland");
	}
}


	class Six6 extends Seven {
		 
	public void columbia() {
		System.out.println("this is columbia");
	}
	
	public void newyork() {
		System.out.println("this is new york");
		
	  }
	
	} 
	
	
	class Seven {
		public void virginia() {
			System.out.println("this is virginia");

		
	}

}
