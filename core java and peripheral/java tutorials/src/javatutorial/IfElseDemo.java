package javatutorial;

public class IfElseDemo {

	/**
	 * @param args
	 */
	// demonstrates the if else demo.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int i;
		
		//take either of the values : zero or non zero
		
		i=0;//  zero assigned to i invokes the if part
		//i=10; any non zero value assigned invokes the  else part
		
		if(i==0){
			System.out.println(" apple gets printed when i is 0 ");
		}
		
		else{
		    System.out.println(" car gets printed if i is not 0");	
		}
		
		
	}

}

// OUTPUT
/*apple gets printed when i is 0 */
