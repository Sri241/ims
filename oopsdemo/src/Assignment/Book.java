package Assignment;

import java.util.Scanner;

public class Book {
	String bookname,author;
	int cost;
	Scanner scan = new Scanner(System.in);
	public void inputdetails(){
		System.out.println("Enter bookname,author and cost: ");
		bookname=scan.next();
		author=scan.next();
		cost=scan.nextInt();
	}
	public void displaydetails() {
		System.out.println("***Book details***");
		System.out.println("Name of the book: "+bookname);
		System.out.println("Author of the book: "+author);
		System.out.println("The cost of the book: "+cost);
		System.out.println("*********");
	}
}
