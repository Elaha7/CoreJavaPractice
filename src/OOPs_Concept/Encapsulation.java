package OOPs_Concept;

public class Encapsulation {
	
	private String N;
	private String LN;
	private int age;
	private String address;
	
	public String getN() {
		return N;
	}

	public void setN(String n) {
		N = n;
	}

	public String getLN() {
		return LN;
	}

	public void setLN(String lN) {
		LN = lN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public static void main(String[] args) {
		
		Encapsulation en=new Encapsulation();	
		en.setAddress("maryland");
        System.out.println(en.getAddress());
        
        en.setAge(28);
        System.out.println(en.getAge());
        
        en.setLN("Smith");
        System.out.println(en.getLN());
        
        en.setN("Robbert");
        System.out.println(en.getN());
	}

}
