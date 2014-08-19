package basicjavatutorial;

public class ForLoopDemo {
	/*@ method description : This code shows that how instead of printing java 5 times by writing System.out.println
	statements , how we can use the for loop to do the same in an elegant and smart way.*/
	public static void main(String args[]){
		for(int numberOfTimesLoopRuns=1;numberOfTimesLoopRuns<=5;numberOfTimesLoopRuns++)
		{
             System.out.println("java");
             System.out.println(numberOfTimesLoopRuns);  
		}
	}
}
/*
java
1
java
2
java
3
java
4
java
5
*/