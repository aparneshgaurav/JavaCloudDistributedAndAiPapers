package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemoAndBasicOperations {
public static void main(String args[]){
	
	List<String> arrayListOfStrings=new ArrayList<String>();
	List<String> arrayListOfStringsDestination=new ArrayList<String>();
	
	
	
	System.out.println("size of list when contents are not added "+arrayListOfStrings.size());
	
	arrayListOfStrings.add("zebra");
	arrayListOfStrings.add("apple");
	arrayListOfStrings.add("monkey");
	
	System.out.println("size of list after contents are added "+arrayListOfStrings.size());
	
	System.out.println("the list contents before getting sorted are "+arrayListOfStrings);
	
	
	// sorting shown
    Collections.sort(arrayListOfStrings);
	System.out.println("the list contents after getting sorted are "+arrayListOfStrings);
	
	
	//** Please note that the further operations are happening on sorted list (apple,monkey,zebra)
	
	
	// searching shown
	System.out.println("apple is found at position "+(Collections.binarySearch(arrayListOfStrings,"apple")+1));
	
	
	// reversing shown
	Collections.reverse(arrayListOfStrings);
	System.out.println("reversed list is "+arrayListOfStrings);
	
	// copying from one array list to another
	for(int i=0;i<arrayListOfStrings.size();i++){
		arrayListOfStringsDestination.add(arrayListOfStrings.get(i));
	}
	System.out.println("the destination list is "+arrayListOfStringsDestination);
}
}

// OUTPUT

/*size of list when contents are not added 0
size of list after contents are added 3
the list contents before getting sorted are [zebra, apple, monkey]
the list contents after getting sorted are [apple, monkey, zebra]
apple is found at position 1
reversed list is [zebra, monkey, apple]
the destination list is [zebra, monkey, apple]
*/
                         