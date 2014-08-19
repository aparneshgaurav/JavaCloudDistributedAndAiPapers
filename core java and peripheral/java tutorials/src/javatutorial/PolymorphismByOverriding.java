package javatutorial;

class OverRidingParent{
 public void show(){
	 System.out.println("I am the show method inside Parent class");
 }
}

class OverRidingChild extends OverRidingParent{
 public void show(){
	 System.out.println("I am the show method inside the Child class");
 }
}


public class PolymorphismByOverriding {
public static void main(String args[]){
	
	OverRidingParent overRidingParentReference;
	
	OverRidingParent overRidingParent=new OverRidingParent();
	
	overRidingParentReference=overRidingParent;
	overRidingParentReference.show();
	
	OverRidingChild overRidingChild=new OverRidingChild();
	overRidingParentReference=overRidingChild;
	overRidingParentReference.show();
	
	
}
}

// OUTPUT
/*
I am the show method inside Parent class
I am the show method inside the Child class
*/