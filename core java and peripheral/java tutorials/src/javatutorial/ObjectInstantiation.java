package javatutorial;

// Class Car is the template/blueprint of instance varialbes (like modelNumber
// and colour) and method(s) like (show).

// CLASS DEFINITION
class Car{
	
// INSTANCE VARIBLES OF CLASS
int modelNumber;
String colour;

// METHOD OF CLASS
public void show(){
	System.out.println("Hi i am the method of Car class");
}

}

public class ObjectInstantiation {
public static void main(String args[]){
	
// if reference car is not instantiated,the value of reference car is null

Car car=null;
System.out.println("the reference car is created and its value is "+car);
//car.show();
// the car.show() won't execute as the car reference is having null value now

// now after creating the object of class Car,memory is allocated to the created 
// object and reference "car" points to the object created on heap

car=new Car();
System.out.println("the reference car is created and its value is "+car);
car.show();

}
}

// OUTPUT

/*the reference car is created and its value is null
the reference car is created and its value is javatutorial.Car@19821f
*/

