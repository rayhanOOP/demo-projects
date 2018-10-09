package bankAccountApp;

//This class is abstract. That means we can't create an object from this Account class
public abstract class Account implements IBaseRate {

	//List common properties for saving and checking accounts
	
	//Constructor to set base properties and initialize the account
	public Account(String name) {
		
		System.out.println("Name: " + name);
		System.out.print("New Account: ");
	}
	
	//List common methods
}
