package javatutorial;


class Overloading{
	public void show(){
		System.out.println("I print none");
	}
	public void show(String str){
		System.out.println("I print "+str);
	}
	public void show(String strOne,String strTwo){
		System.out.println("I print "+strOne+" and "+strTwo);
	}
}

public class PolymorphismByOverloading {
public static void main(String args[]){
	Overloading overloading=new Overloading();
	overloading.show();
	overloading.show("one");
	overloading.show("one","two");
}
}

// OUTPUT
/*
I print none
I print one
I print one and two
*/