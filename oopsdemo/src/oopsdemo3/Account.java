package oopsdemo3;

public class Account {
       
	String name;
    protected double balance;
    
    //generate constructor with fields
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
    
	//generate only getters
	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	//final methods cannot be overridden
	final void deposit(double amt) {

		 

        balance += amt;
        System.out.println("Depositing: " + amt);

 

    }

 

    void withdraw(double amt) {

 

        balance -= amt;
        System.out.println("WithDrawing: " + amt);

 

    }
	
    
    
}
