package basics;
/*
 * Program to display numbers from 1 to 10.
 *
 * Understand the concept of Loop.
 * Loop - A set of statements executing repeatedly , until a particular
 * condition is TRUE.
 */
public class WhileDemo1 {
     public static void main(String[] args) {
		int i=21; //loop initialization
		while(i<=10)        //set a condition
		{
			System.out.println(i+ "Sri");
			i=i+1;           //Increment the loop
		}
		System.out.println("Exiting the loop........");
		System.out.println("******Reverse loop*******");
		int j=10;
		while(j>=1) {
			System.out.println(j);
			j=j-1;    //Decrement loop
		}
	}
}
