package EX2;

public class Account {
	
	private int Account_no;
	private double balance;
	private double withdraw;
	double need;
	
	public Account() {
		this.Account_no = 0;
		this.balance = 0;
	}
	
	public Account(int Account_no) {
		this.Account_no = Account_no;
	}
	
	public double deposit(double deposit) {
		return balance+=deposit;
	}
	
	public double withdraw(double withdraw) throws InsufficientBalanceException {
		this.withdraw = withdraw;
		 if(withdraw <= balance)
			 balance-=withdraw;
		 else {
			 need = withdraw - balance; // if you add this you can get wrong answer
		 	 throw new InsufficientBalanceException(getBalance());
		 	
		 	// in here you don't need to include try catch
		
		 }return withdraw;
	    
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getWithdraw() {
		return withdraw;
	}
	

	
	public void display() {
		System.out.println("Account No :- " + Account_no);
		System.out.println("Balance :- " + balance);
	}

}
