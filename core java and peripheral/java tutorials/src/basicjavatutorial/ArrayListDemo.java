package basicjavatutorial;

import java.util.ArrayList; 

public class ArrayListDemo {

   /* @ method description: this method defines an arraylist of integers , five integers are added 
    to the arraylist and the arraylist is displayed*/
	
	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		System.out.println(arraylist);


	}

}
// output
//[10, 20, 30, 40, 50]
