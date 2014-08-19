package javatutorial;

public class ForLoopDemoWithContinue {
	// explains the continue feature of the for loop.
public static void main(String args[]){
	for(int i=1;i<=5;i++){
		
		if(i==3){
		System.out.println("if the value of i is 3 then i am not getting printed ");
		System.out.println("");
		continue;
		}
		
		System.out.println("the value of i is "+i);
		System.out.println("i am getting printed "+i+" many time(s) ");
		System.out.println("");
		
		
		
		
	}
}
}

// OUTPUT
/*the value of i is 1
i am getting printed 1 many time(s) 

the value of i is 2
i am getting printed 2 many time(s) 

if the value of i is 3 then i am not getting printed 

the value of i is 4
i am getting printed 4 many time(s) 

the value of i is 5
i am getting printed 5 many time(s) */



