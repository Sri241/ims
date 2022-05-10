package exceptionsdemo;

public class CheckingAccount {

	private double balance;
    private int number;
    
 //generate constructor using fields only numbers   
	public CheckingAccount(int number) {
		this.number = number;
	}
//generate getters from source
	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	
	public void deposit(double amount) {
        balance += amount;
     }
  // method may throw user defined exception - InSufficientFundsException
  public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance) {
           balance -= amount;
        }else {
           double needs = amount - balance;
           throw new InsufficientFundsException(needs);
        }
     }
	
    
    
}
