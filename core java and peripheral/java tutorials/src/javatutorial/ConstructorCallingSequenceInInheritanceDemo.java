package javatutorial;

class One{
	One(){
		super();
		System.out.println("one");
	}
}
class Two extends One{
	Two(){
		super();
		System.out.println("two");
	}
}
class Three extends Two{
	Three(){
		super();
		System.out.println("Three");
	}
}

// use of super in constructor and it needs to be the first line in constructor
// .A default super() is implicitly provided by jvm.

public class ConstructorCallingSequenceInInheritanceDemo {
public static void main(String args[]){
	Three three=new Three();
}
}

// OUTPUT

/*

one
two
Three

*/