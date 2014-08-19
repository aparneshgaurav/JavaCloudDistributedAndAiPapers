package javatutorial;

// class definition
class SimpleCar{
	
	int modelNumber;
	String colour;
	
	// method of the class
	public void show(){
		System.out.println("Hi i am inside the show method of class");
	}
}

// Following class name is the same as the file name . It is public , there is only one public class in the java file.

public class AccessingMethodsOfClassDemo {
// this is the starting point of execution of the java app.
public static void main(String args[]){
	// The SimpleCar class defined above is instantiated here.
	SimpleCar simpleCar=new SimpleCar();
	// on the instance created , the show method inside the SimpleCar is called .
	simpleCar.show();
}
}

// OUTPUT
/* Hi i am inside the show method of class*/
