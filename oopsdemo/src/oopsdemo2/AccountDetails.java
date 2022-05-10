package oopsdemo2;
/* MultiLevel Inheritance  
 *  Account  --- > SavingsBank ---> AccountDetails
 */
//child class of Savings Bank
public class AccountDetails extends SavingsBank {
	
	int withdrawl,deposit,finalBalance;
     
	public AccountDetails(int accNo, String name,int mb,int b,int w, int d) {
		super(accNo, name, mb, d);
		this.withdrawl=w;
		this.deposit=b;

	}
	void display()
    {
            super.display(); // invokes savings bank display()method
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalBalance=(balance+deposit)-withdrawl;
            System.out.println("Final Balance:" + finalBalance);
    }

}
