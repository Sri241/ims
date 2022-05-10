package oopsdemo1;

public class ComplexTest {
     public static void main(String[] args) {
		
    	 Complex c1=new Complex(10.3,67.4);//invokes Constructor
    	 Complex c2=new Complex(0.7,3.6);//invokes Constructor
    	 
    	 c1.add(c2);//calls method add() by passing object c2
    	 System.out.println("The addition Of 2 Complex numbers is:");
    	 c1.display();
    	 
	}
}
