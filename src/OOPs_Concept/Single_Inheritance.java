package OOPs_Concept;

public class Single_Inheritance {

	public static void main(String[] args) {



		Five f1=new Five();
		f1.florida();
		f1.washington();
		f1.california();
		f1.newjersey();
		
		Six s1=new Six();
		s1.california();
		s1.newjersey();

	}

}

class Five extends Six{
	public void florida() {
		System.out.println("florida is hot");
	}
	
	public void washington () {
		System.out.println("washington is evergreen state");
	}
 }

	class Six {
		 
	public void california() {
		System.out.println("this is california");
	}
	

	public void newjersey() {
		System.out.println("new jersey is close to maryland");
 
	

	}

}
