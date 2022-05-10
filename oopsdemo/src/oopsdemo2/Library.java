package oopsdemo2;

import java.util.List;
//composition Example
public class Library {
      
	
    List<Book> books;//Object Reference  --> Composition
    
//constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}
//select only getters from source
	public List<Book> getBooks() {
		return books;
	}
    
	
    
	
}
