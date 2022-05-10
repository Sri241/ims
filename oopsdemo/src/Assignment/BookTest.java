package Assignment;

public class BookTest {
    public static void main(String[] args) {
    	Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		
		b1.inputdetails();
		b2.inputdetails();
		b3.inputdetails();
		
		b1.displaydetails();
		System.out.println("Enter the details Of book1:");
		b2.displaydetails();
		System.out.println("Enter the details Of book2:");
		b3.displaydetails();
		System.out.println("Enter the details Of book3:");
	}
}
