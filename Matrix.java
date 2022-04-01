package lin;

public class Bank {
	private int accountNumber;
	private double balance;
	
	public Bank(int accountNumber,double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void openNewAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}
	
	public void closeAccount(int accountNumber) {
		this.accountNumber = 0;
		this.balance = 0.0;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getBalances(int accountNumber) {
		return "AccountNumber : "+ this.accountNumber+",balance:"+this.balance;
	}
}
