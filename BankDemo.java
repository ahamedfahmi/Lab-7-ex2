package EX2;

import java.util.Scanner;

public class BankDemo {
	

	public static void main(String[] args)throws InsufficientBalanceException {
		// TODO Auto-generated method stub

		double withdraw;
		String answer;
		
		
		
		Account account = new Account(123); 
		System.out.println("Depositing Rs.10,000"); 
		account.deposit(10000.00); 
		
		Scanner input = new Scanner (System.in);
		
		try { 
				
			continueTransaction(account);
		
		} 
		catch (InsufficientBalanceException e) { 
			System.out.println("Sorry, your account remains only Rs." + e.getamount()); 
			e.printStackTrace(); 
		
		}
		
		finally {
			
			System.out.println("Do you wish to continue ? yes/no");
			 
			
			if (input.next().equalsIgnoreCase("yes"))
			{
				System.out.println("Depositing Rs.10,000"); 
				account.deposit(10000.00);
				
				try {
					continueTransaction(account);
				}catch(InsufficientBalanceException e) {
					e.printStackTrace();
				}
			}
		}
		}
		

	public static void continueTransaction(Account account) throws InsufficientBalanceException {
		
		double withdraw;
		
		Scanner input = new Scanner (System.in);
		System.out.println("please Enter the amount to be withdrawn := ");
		
		while (true) {
			withdraw = input.nextDouble();
			System.out.println("\nwithdrawing Rs." + withdraw + "/=");
			
			account.withdraw(withdraw); // error is for exception
			
			System.out.println("Existing amount = " + account.getBalance());
			
			System.out.println("please Enter the amount to be withdrawn := ");
			
		}
}
}
