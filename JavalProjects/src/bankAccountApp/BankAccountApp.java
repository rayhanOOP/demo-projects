package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\raycs\\Desktop\\NewBankAccounts.csv";
		/*
		Checking chck1 = new Checking("Rayhan Rahman", "493859603", 1500);
		Savings saving = new Savings("Mohammad Rayhanur Rahman","934095860", 2500);
		
		saving.showInfo();
		saving.compound();
		System.out.println("*******************");
		System.out.println("");
		chck1.showInfo();
		chck1.compound();
		
		*/
	
		//Read a CSV file and then create new accounts based on that data	
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String[] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + " $"+initDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,sSN,initDeposit));
			} else if (accountType.equals("Checking")){
				accounts.add(new Checking(name,sSN,initDeposit));
			} else {
				System.out.println("Error reading account type.");
			}
		}
		
		for(Account acc: accounts) {
			
			System.out.println("\n**********************");
			acc.showInfo();
			
		}
	}

}
