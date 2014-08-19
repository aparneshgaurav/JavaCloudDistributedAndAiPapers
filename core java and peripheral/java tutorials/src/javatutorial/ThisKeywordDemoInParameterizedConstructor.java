package javatutorial;

class GraphicsBook{

	int numberOfPages;
	String authorName;


	// "this" keyword refers to the current object.It helps us
	// to follow standards names for better clarity in codes.



	public GraphicsBook(int numberOfPages,String authorName) {
		this.numberOfPages=numberOfPages;
		this.authorName=authorName;
	}

	// this.authorName=authorName is detailed as follows:
	// this.authorName refers to instance variable while authorName
	// on the right hand side refers to the formal parameter passed.


}

public class ThisKeywordDemoInParameterizedConstructor {
	public static void main(String args[]){

		System.out.println("execution starts here");

		GraphicsBook graphicBook=new GraphicsBook(100,"JAVA");

		System.out.println(graphicBook.numberOfPages);
		System.out.println(graphicBook.authorName);

	}
}


// output

/*
execution starts here
100
JAVA
*/