package oopsdemo1;

public class BookTest {
      public static void main(String[] args) {
		 Book b1=new Book();
		 
		 //invoke setter methods - input
		 b1.setBookId(101);
		 b1.setBookName("Programming in C");
		 b1.setPrice(500);
		 b1.setPublisher("Prime Books");
		 
		 //invoke getter methods -- output
		 System.out.println("******Book Details******");
		 b1.display();
		 System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		 
		 System.out.println("Discounted price of Book :"+b1.discountPrice());
		 
		 System.out.println(b1);
      }
		 
		 
	}

