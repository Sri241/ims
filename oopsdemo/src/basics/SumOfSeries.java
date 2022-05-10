package basics;

import java.util.Scanner;

/*
 * Program to find sum of series .. 1 + 2 + 3 + ..... + n
 */
public class SumOfSeries {
    public static void main(String[] args) {
    	int i=1,n,sum=0;
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter Value for N : ");
        n=s.nextInt();
        s.close();
        while(i<=n)
        {
        	sum=sum+i;
        	System.out.println("The sum of series in "+i+":"+sum);
        	i=i+1;
        }
        //System.out.println("The sum of series is: "+sum);
	}
}
