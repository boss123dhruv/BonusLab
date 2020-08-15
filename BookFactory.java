package Book;

import java.util.ArrayList;

public class BookFactory {
	
	///making the arraylist so that it contains the books objects
         ArrayList<Book> Books = new ArrayList<>();
         
         
   public Book makeBook(String bookType) {
	   if(bookType.equals("Near Dark")) {
		   Books.add(new Book("Near dark"));
		   return Books.get(0);
	   }else if(bookType.equals("BackLash")) {
		   Books.add(new Book("Back Lash"));
		   return Books.get(1);
	   }else if(bookType.equals("Spy Master")) {
		   Books.add(new Book("Spy Master"));
		   return Books.get(3);
	   }else if(bookType.equals("Path of the Assassin")) {
		   Books.add(new Book("Path of the Assassin"));
		   return Books.get(4);
	   }else if(bookType.equals("The Lions of Lucerne")) {
		   Books.add(new Book("The Lions of Lucerne"));
		   return Books.get(2);
	   }
	   
	   return null;
   }
	
}
