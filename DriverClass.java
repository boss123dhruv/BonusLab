package Book;

public class DriverClass {

	
	
	
	public static void main(String[] args) {
     
		//making the authors via author factory
		AuthorFactory firstAuthor = new AuthorFactory(); 
	Author author = firstAuthor.makingAuthor("Brad Thor");
	author.setNameOfPublisher("Amish Patel Lappy");	
	// Making Books via books factory
	BookFactory firstBook = new BookFactory();	
	Book book1 = firstBook.makeBook("Near Dark");
	
	//Now injecting the author to Book1
	
	book1.setMyAuthor(author);
	book1.setPrice(14.99);
	book1.setTitle("Near Dark");
	System.out.println(author.getNameOfPublisher());
	System.out.println(book1.getPrice());
	}

}
