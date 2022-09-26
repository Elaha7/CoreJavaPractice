package Polymorphism;

public class RunTimePolymorphosim {

public static void main(String[] args) {
		
		Company c = new newCompany();
		
		c.CompanyName();
	}
}


class Company {

	public void CompanyName()
	{
		System.out.println("Courage group");
	}
	
}


    class newCompany extends Company
{
	public void CompanyName()
	{
		System.out.println("Chompions group");
	}
}