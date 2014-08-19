package basicjavatutorial;

import java.util.ArrayList;
import java.util.List;



public class ListDemo {

	/*@ method description :  The list is the interface that is implemented by the ArrayList Class. In this code ,
	we are declaring the arraylistof String and adding String contents.We create a reference to the list of String,
	, then we create an object of ArrayList of Strings, afterwards the object is assigned to the reference to the 
	list of Strings, Then we add the String contents to the reference and get the data printed when the reference to 
	the list is printed.*/
	
	public static void main(String[] args) {
		List<String> listReference;
		ArrayList<String> arraylist=new ArrayList<String>();
		
		listReference=arraylist;
		listReference.add("java");
		listReference.add("Gaurav");
		
		System.out.println(listReference);



	}

}

// [java, Gaurav]
