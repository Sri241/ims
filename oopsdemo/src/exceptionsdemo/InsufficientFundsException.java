package exceptionsdemo;

//User defined Exception class
public class InsufficientFundsException extends Exception {
   /**
    * 
    */
	private static final long serialVersionUID=1L;
	private double amount;
	
	
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
//generate source from fields

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//generate source from getters
	public double getAmount() {
		return amount;
	}
	
	
	
	
	
}
