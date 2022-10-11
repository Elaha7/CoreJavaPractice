package Userdefined_custome_E;

public class UserDefined {

	public static void main(String[] args) throws WithdrawIsNotPossibleException {

    double bankB = 50000.0;
    double withdraw = 55000.0;
    
    if (withdraw > bankB) {
    	
    	throw new WithdrawIsNotPossibleException("The amount you want to widdraw is not avaliable in your account");
    }
    else {
    	System.out.println("withdraw is successful");
    }
	}

}
