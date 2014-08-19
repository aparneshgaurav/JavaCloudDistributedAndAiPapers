package javatutorial;

public class ForLoopDemoWithBreak {
public static void main(String args[]){
	// expalins the break feature of the for loop.
for(int i=1;i<=5;i++){
		
		if(i==3){
		System.out.println("if the value of i is 3 then anything afterwards is not gonna be printed");
		System.out.println("");
		break;
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

if the value of i is 3 then anything afterwards is not gonna be printed

*/
