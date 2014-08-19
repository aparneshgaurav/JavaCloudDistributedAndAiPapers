package basicjavatutorial;

public class PassingValueDemo {
	int heap;
	 // this is the starting point of the execution of the app, two integer numbers are declared and then the 
	//  add method is called upon them , those two integer values are passed to the add method.In the add method
	//  those two numbers are received , and then a local variable sum is declared .Then the addition operation is
	//  done on the two received values and the sum is printed. The sum variable is not accessible outside the add
	//  method.
	public static void main(String[] args) {
		int heap;
		int a =10;
		int b =20;
		add(a,b);
	}
   
	public static void add(int aPassed, int bPassed) {
		int sum; // this variable is created inside the method that means the variable is created on the stack.
		sum=aPassed+bPassed;
		System.out.println(sum);

	}
}


// 30
