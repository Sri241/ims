package Assignment;

import java.util.Scanner;

//import java.util.Scanner;

public class StarDisplay {
	public static void main(String[] args) {
		int i,j,k;
	    Scanner sc= new Scanner(System.in);
	    System.out.print("enter the number of rows: ");  
	    int n= sc.nextInt();  
	    for(i=0;i<n;i++)
	    {
		    for(j=0;j<n-i-1;j++){
	                     System.out.print(" ");
		    }
		    for(k=0;k<2*i+1;k++){
			        System.out.print("*");
			}
			 System.out.println("");
		    }
		    
		 for(i=n-1;i>0;i--)
	    {
		    for(j=n-1;j>=i;j--){
	                     System.out.print(" ");
		    }
		   for(k=2*i-1;k>0;k--){
			        System.out.print("*");
			}
			 System.out.println("");
		    }
	}

}

