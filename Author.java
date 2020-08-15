package Book;

public class Author extends Person{
    String NameOfPublisher;
   
    
    //parameterised constructor
	 Author(String publisher,String name, String email, String gender){
		 super(name,email,gender);
		 publisher = this.NameOfPublisher;
	 }
	 
	 // default constructor
	    Author(String name){
	    	super(name);
	    }
	public String getNameOfPublisher() {
		return NameOfPublisher;
	}
	public void setNameOfPublisher(String NameOfPublisher) {
		this.NameOfPublisher = NameOfPublisher;
	}
	 
}
