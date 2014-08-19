package javatutorial;

public class AutoboxingDemo {
public static void main(String args[]){
	int i=1;
	Integer intValue=i;
	System.out.println("intValue= "+intValue);
	System.out.println("intValue= "+intValue.intValue());
}
}


// OUTPUT
/*
intValue= 1
intValue= 1
*/