package basicjavatutorial;

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
		Mom mom=new Mom();
		mom.care();
		
	}

}


// Mom cares for child
