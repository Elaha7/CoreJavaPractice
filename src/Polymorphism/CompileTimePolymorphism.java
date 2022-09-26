package Polymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		//Overloading
		
		System.out.println("This is Afghanistan");
		 
		Two times=new Two();
		times.Number(13);
		System.out.println(times.Number(13));
		
		times.Number(3, 56);
		System.out.println(times.Number(3, 56));
		
		times.Number(2, 45, 35);
		System.out.println(times.Number(2, 45, 35));
		
		times.Number(5, 55, 44, 24);
		System.out.println(times.Number(5, 55, 44, 24));
//////////////////	
		
		Three names=new Three();
		
		names.Name("David");
		System.out.println(names.Name("David"));
		
		System.out.println(names.Name("David ", "Jone"));
		
		System.out.println(names.Name("David ", "Jone ", "Smith"));
//////////////////
		
		Five season =new Five(28, 7);
		Five season1=new Five(28, 7, 3);
		Five season2=new Five(27, 2, "This is my age: ");
//////////////////
		
		Seven.Eight("iphone ", "twelve");
		System.out.println("Iphone twelve");
		
		Seven.Eight(2020, 9, "Iphone eleven ");
		System.out.println("Iphone eleven");
		
		Seven.Eight(2021, 12);
		System.out.println("2021 , 12");
		
		Seven.Eight("people should wait for new model until September ", 12);
	}

}
   //(Method Overloading with Integer Data Type

   class Two {
	
	
	public int Number(int hour) {
		int time = hour;
		return time;
	}
	
	public int Number(int hour, int minute) {
		 int second = hour + minute;
		 return second;
		
	}
	
	public int Number(int hour, int minute, int second) {
		int all = hour + minute + second;
		return all;
	}
	
	
	public int Number(int hour, int minute, int second, int time) {
		int total = hour + minute + second + time;
		return total;
		
	}
}
    // Method overloading with String data type

     class Three {
	
	 public String Name(String Fname) {
		String n = Fname;
		return n;
	}
	
	
	public String Name(String Fname, String Mname) {
		String n1 = Fname + Mname;
		return n1;
	}
	
	public String Name(String Fname, String Mname, String Lname) {
		String n2= Fname + Mname + Lname;
		return n2;
	}
}
   // Constructor overloading

   class Five {
	
	Five() {
		System.out.println("This is constructor");
	}
	
	Five (int year, int month) {
		int age = year + month;
		System.out.println(age);
		
	}
	
	Five (int year, int month, int week) {
		int season = year + month + week;
		System.out.println(season);
	}
	
	Five (int year, int month, String message) {
		int life = year + month;
		System.out.println(message + life);
		
	}
}
   // Static Method overloading 

   class Seven {
	
	public static String Eight (String model, String phone) {
		String both = model + phone;
		return both;
	}
	
	public static String Eight (int year, int month, String phone) {
		String all =year + month + phone;
		return all;
	}
	
	public static int Eight (int year, int model) {
		int style = year + model;
		return style;
	}
	
	public static void Eight (String night, int day) {
		
		String dn= night + day;
		System.out.println(dn);

	}

}
