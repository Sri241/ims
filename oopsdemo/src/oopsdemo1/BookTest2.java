package oopsdemo1;

public class BookTest2 {
	public static void main(String[] args) {
		
    Book b2=new Book();
    
    b2.setBookId(102);
    b2.setBookName("Python");
    b2.setPrice(600);
    b2.setPublisher("BPB Publisher");
   
    System.out.println("******* Book Details ********");
    System.out.println(b2.getBookId()+ " "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
    System.out.println("Discounted Price of Book :"+b2.discountPrice()); 
	}
}
