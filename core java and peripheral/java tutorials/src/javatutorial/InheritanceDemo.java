package javatutorial;

//PARENT CLASS

class Mom{
	//INSTANCE VARIABLE
	String love="lots of love";
	//METHOD
public void care(){
	System.out.println("Mom cares for child");
}
}

// DERIVED CLASS

class Child extends Mom{
	String cute="lots of cuteness";
public void play(){
	System.out.println("cute child plays");
}

}
// so, "extends" keyword ensures inheritance and the
// derived class (Child) extends Parent class (Mom)
// and all the instance variables and methods of parent
// class becomes available with the derived class.


public class InheritanceDemo {
	public static void main(String[] args) {
		Child child=new Child();
		
		// the following four statements show that child can access 
		// its own properties (instance variables and methods) as well 
		// as its parent's (Mom's) properties.
		
		System.out.println(child.cute);
		System.out.println(child.love);//proof of Child extending Mom
		child.play();
		child.care();//proof of Child extending Mom
		
	}

}


// output

/*lots of cuteness
lots of love
cute child plays
Mom cares for child
*/