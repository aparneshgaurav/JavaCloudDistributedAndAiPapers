package javatutorial;

class Book{
  	int noOfPages;
  	String authorName;
  	/*Book(){
  		
  	}*/
}

public class DefaultConstructorDemo {
public static void main(String args[]){
	
	Book book=new Book();
	
	// Here the compiler provides default constructor.
	
	System.out.println(book.noOfPages);
	System.out.println(book.authorName);
}
}

// output

/*0
null
*/