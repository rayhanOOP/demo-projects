package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "fa.com";
	
	
	
	//Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department= setDepartment();
		
		
		//Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		
		
		//Alternate Email
		
	}

	
	//Ask for the department
	private String setDepartment(){
		
		System.out.print("New worker: "+ firstName + ".\nDepartment codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int deptChoice = input.nextInt();
		if (deptChoice == 1) {return "Sales";}
		else if (deptChoice == 2) {return "Development";}
		else if (deptChoice == 3) {return "Accounting";}
		else {return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length){
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++){
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
		
	}

	//Set the alternate email
	public void setAlternateEmail(String email) {
		this.email = email;
	}
	
	//Change the password
	public void changePassword(String password) {
		
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	
	public String showInfo() {
		
		return "Display Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailBoxCapacity + "mb";
	}

}
