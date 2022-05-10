package Assignment;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		double Celisius,Fahrenheit;
         
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit:");
		Fahrenheit=s.nextDouble();
		Celisius=((Fahrenheit-32)*5)/9;
		System.out.println("Temperature in Celisius:"+Celisius);
	}

}