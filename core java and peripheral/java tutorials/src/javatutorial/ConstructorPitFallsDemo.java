package javatutorial;

//Please dont expect print statements in this example,this code you
// gotto understand from the compilation errors ,that whether
// they are there or not.


// the proverb goes like this for the default constructor: you provide none , jvm provides one, you provide one
// jvm provides none. And please note that the default constructor privided by the jvm is the zero argument 
// constructor.

class JavaBook{
	
	int numberOfPages;
	String authorName;
	
}

public class ConstructorPitFallsDemo {
	public static void main(String args[]){
		//step 1
		JavaBook javaBook=new JavaBook();
		//compiles step 1 as compiler introduces default constructor
		//Note* The default constructor provided is always zero argument
		//constructor.


		//step 2
		//JavaBook javaBookOne=new JavaBook(100,"JAVA");
		//does not compile step 2 as compiler does not provide any paramterized
		//constructor.

	}
}
