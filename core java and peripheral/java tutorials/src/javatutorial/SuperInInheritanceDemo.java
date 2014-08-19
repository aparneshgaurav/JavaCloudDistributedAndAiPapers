package javatutorial;

class Rectangle{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		System.out.println("Hi ,i am the constructor of the parent Rectangle");
		this.length=length;
		this.breadth=breadth;
	}
}

class Cuboid extends Rectangle{
	int height;
	
	//parameterized constructor with use of super keyword
	public Cuboid(int length,int breadth,int height) {
	super(length,breadth);
	this.height=height;
	System.out.println("Hi ,i am the constructor of the child cuboid");
	}
}

public class SuperInInheritanceDemo {
	public static void main(String args[]){
		
		Cuboid cuboid =new Cuboid(10,20,30);
		
		System.out.println(cuboid.length);
		System.out.println(cuboid.breadth);
		System.out.println(cuboid.height);
	}
}

// OUTPUT

/*
Hi ,i am the constructor of the parent Rectangle
Hi ,i am the constructor of the child cuboid
10
20
30

*/