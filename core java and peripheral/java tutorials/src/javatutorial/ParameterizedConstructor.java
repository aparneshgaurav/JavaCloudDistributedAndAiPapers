package javatutorial;

class ComputerBook{
	
	//INSTANCE VARIBLES
	int numberOfPages;
	String authorName;
	
	//PAREMETERISED CONSTRUCTOR
	public ComputerBook(int numberOfPagesPassed,String authorNamePassed) {
	numberOfPages=numberOfPagesPassed;
	authorName=authorNamePassed;
	}
	
}

public class ParameterizedConstructor {
public static void main(String args[]){
	
	System.out.println("execution starts here");
	
	ComputerBook computerBook=new ComputerBook(100,"JAVA");
	// parameterized constructor written explicitly
	
	System.out.println(computerBook.numberOfPages);
	System.out.println(computerBook.authorName);
	
}
}


// output

/*execution starts here
100
JAVA
*/
