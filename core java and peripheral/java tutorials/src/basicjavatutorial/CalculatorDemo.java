package basicjavatutorial;

public class CalculatorDemo {
    
	 /*@ method description : This calculator program takes the input of two integers and does the addition and the 
	 substraction operations upon them.*/
	
	public static void main(String[] args) {
		int number1=100;
		int number2=2250;
		int sum=number1+number2;
		System.out.println("This is an addition demonstration program");
		System.out.println("The first number being added is "+number1);
		System.out.println("The second number being added is "+number2);
		System.out.println("The result expected on the addition of the first number and the second number is "+sum);
		System.out.println();
		System.out.println();
		
		
		int number3=300;
        int number4=250;
        int difference=number3-number4;
        System.out.println("This is a subtraction demonstration program");
        System.out.println("The greater number is "+number3);
        System.out.println("The smaller number is "+number4);
        System.out.println("The result expected on the subtraction of these numbers is "+difference);
        
      
	}

}

// output
/*
This is an addition demonstration program
The first number being added is 100
The second number being added is 2250
The result expected on the addition of the first number and the second number is 2350


This is a subtraction demonstration program
The greater number is 300
The smaller number is 250
The result expected on the subtraction of these numbers is 50
*/