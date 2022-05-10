package Assignment;

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
		int a,b,res;
		String op;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two number:");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Enter the operator:");
		//b=scan.nextInt();
		while(true)
		{
			/*System.out.println("sum");
			System.out.println("mul");
			System.out.println("diff");
			System.out.println("div");*/
			op=scan.next();
			switch(op)
			{
			case "+":res=a+b;
				System.out.println("Addition of 2 numbers:"+res);
				break;
			case "*":res=a*b;
				System.out.println("Multiplication of 2 numbers:"+res);
				break;
			case "-":res=a-b;
				System.out.println("Difference of 2 numbers:"+res);
				break;
			case "/":res=a/b;
				System.out.println("Division of 2 numbers:"+res);
				break;
			
			}
		}
	}
}
