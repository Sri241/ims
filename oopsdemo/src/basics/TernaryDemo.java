package basics;
/* 
 * Ternary Operator is the Conditional Operator that takes 3 operands
 * It is used in place of if-else
 * Syntax:variable = expr1 ? expr2 : expr3
 */

//program to find maximum of 2 nos
public class TernaryDemo{
	public static void main(String[] args) {
		int a=10,b=30,max;
		System.out.println("First Number :"+a);
		System.out.println("Second Number :"+b);
		
		max=(a>b) ? a:b; //Ternary Operator
		String msg=(a > b)?"A is Greatest":"B is Greatest";
		System.out.println("The Maximun of 2 nos is :"+max+" . "+msg);
	}

}
