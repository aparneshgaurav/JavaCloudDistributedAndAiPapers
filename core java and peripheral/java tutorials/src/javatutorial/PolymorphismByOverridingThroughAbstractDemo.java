package javatutorial;

abstract class  OverRidingParentClass{

	public void show(){
		System.out.println("I am the show method inside Parent class");
	}

}

class OverRidingChildClass extends OverRidingParentClass{

	public void show(){
		System.out.println("I am the show method inside the Child class");
 }
	
}
public class PolymorphismByOverridingThroughAbstractDemo {
	
	public static void main(String args[]){

		OverRidingParentClass overRidingParentClassReference;
        
		//Now,the abstract parent class cannot be instantiated
		//Below line if uncommented will result into a compilation error
		//OverRidingParentClass overRidingParentClass=new OverRidingParentClass();

		OverRidingChildClass overRidingChildClass=new OverRidingChildClass();
		overRidingParentClassReference=overRidingChildClass;
		overRidingParentClassReference.show();
		
	}
}


// output
/*
I am the show method inside the Child class

*/