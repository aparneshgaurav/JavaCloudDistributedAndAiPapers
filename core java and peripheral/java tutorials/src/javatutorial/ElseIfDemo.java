package javatutorial;

public class ElseIfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		//take any of the following values of i 
		
		i=0;//envokes printing of apple
		//i=1 envokes printing of orange
		//i=2 envokes printing of grapes
		//i=10 envokes printing of car

		if(i==0){
			System.out.println(" apple gets printed when i is 0 ");
		}
		else if(i==1){
			System.out.println(" orange gets printed when i is 1 ");
		}
		else if(i==2){
			System.out.println(" grapes gets printed when i is 2 ");
		}
		else{
			System.out.println("car gets printed when i is any other value except 0,1 and 2");
		}
		
	}

}

// OUTPUT

/*apple gets printed when i is 0 */
