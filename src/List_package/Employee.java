package List_package;

public class Employee {

	// Generic
	
    private String Firstname;
	private String Lastname;	
	private String address;
	private int age; 
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	

	
	@Override
	public String toString() {
		return "Employee [Firstname=" + Firstname + ", Lastname=" + Lastname + ", age=" + age + ", address=" + address
				+ "]";
	}
		
		
		
		
	}


