package basicjavatutorial;

   /*@ method description : HelloWorld is the class, show is the method name, and public static void main is the starting point of the 
   exection of the java application*/
public class HelloWorld {
	public void show(){
		System.out.println(" HELLO WORLD ");
		}

	public static void main(String args[]){
		
		System.out.println("execution starts here");
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.show();
		}
}


//
/*
execution starts here
HELLO WORLD 
*/