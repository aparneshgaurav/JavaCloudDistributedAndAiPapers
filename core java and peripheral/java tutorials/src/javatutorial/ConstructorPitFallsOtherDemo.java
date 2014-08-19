package javatutorial;

//Please dont expect print statements in this example,this code you
//gotto understand from the compilation errors are there or not.

class SpringBook{
	
	int numberOfPages;
	String authorName;
	
	/*SpringBook(){
		
	}*/
	
	// remove the commnent part for parameterized constructor as per
	// the guidelines provided in the step 3,see you will get compilation
	// error for step 1
	
	
	/*public SpringBook(int numberOfPages,String author) {
     this.numberOfPages=numberOfPages;
     this.authorName=authorName;
	}*/
	
	
}

public class ConstructorPitFallsOtherDemo {
	public static void main(String args[]){
		//step 1
		
		SpringBook springBook=new SpringBook();
		
		//compiles step 1 as compiler introduces default constructor
		//Note* The default constructor provided is always zero argument
		//constructor.


		//step 2
		//SpringBook springBookOne=new SpringBook(100,"JAVA");
		
		//step2  does not compile as compiler does not provide any paramterized
		//constructor.


		// Step 3: (try)
		// If you provide parameterized constructor ,then java won't provide
		// any default constructor.So,try writing parameterized constructor
		// and see that step 1 does not compile.

	}
}
