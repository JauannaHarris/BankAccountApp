package Bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();		
		
		
		
		//Read a CSV File then create new accounts based on that data
		String file ="/Users/jauannaharris/Downloads/NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
	
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else {
				System.out.println("Error reading account type");
			}
		}
		for(Account acc: accounts) {
			System.out.print("\n*************\n");
		
			acc.showInfo();

			}
		
		}
	}


