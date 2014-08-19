package javatutorial;

public class ArraysDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String[] studentNames;
        studentNames=new String[5];
        studentNames[0]="john";
        studentNames[1]="mike";
        
        for(int i=0;i<studentNames.length;i++){
        	System.out.println("STUDENT NAME IS "+studentNames[i]);
        }
        
        // in case of string all initialized to null
        // in case of int all initialized to zero
        
	}

}

// OUTPUT
/*STUDENT NAME IS john
STUDENT NAME IS mike
STUDENT NAME IS null
STUDENT NAME IS null
STUDENT NAME IS null*/




