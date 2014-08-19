package javatutorial;
/*
 Class is the template or blueprint of data (not considered here) and methods( ex: show() ) put together.
 There can be only one class in a java file which can be having public keyword.
 The keyword "public" will be discussed later.
 The JVM (java virtual machine) first executes public static void main method.
 */

public class HelloWorld {
	// HelloWorld is the name of the class and should be same as the name in the java file
	public void show(){
		// show is the name of the method	
		System.out.println(" HELLO WORLD ");
		// System.out.println("") used to print on console in java language.
	}

	public static void main(String args[]){
		
		System.out.println("execution starts here");
		
		//JVM starts execution from public static void main method
		HelloWorld helloWorld=new HelloWorld();
		// HelloWorld class is getting instantiated,helloWorld is the instance.
		// Instance is the smallest manifestation of Class.Its a real world existing entity.
		helloWorld.show();
		//Now the "show" method can be accessed by the instance ("helloWorld") created.
	}
}

/* Note: Any portion of the code not understood will be more clear to you after 
reading the theoretical portion.*/

// OUTPUT
/*
HELLO WORLD 
*/
