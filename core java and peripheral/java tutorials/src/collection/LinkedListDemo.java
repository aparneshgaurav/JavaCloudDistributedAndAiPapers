package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> linkedListOfStrings=new LinkedList<String>();
		
		linkedListOfStrings.add("one");
		linkedListOfStrings.add("two");
		linkedListOfStrings.add("three");
		
		System.out.println("the list contents are "+linkedListOfStrings);
		
	}

}

// the list contents are [one, two, three]
