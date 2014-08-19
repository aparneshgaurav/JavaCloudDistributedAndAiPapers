package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
public static void main(String args[]){
	Set<Integer> set=new HashSet<Integer>();
	
	set.add(10);
	set.add(20);
	set.add(20);
	// value 20 is added twice,but the output shows that duplicates not allowed
	set.add(30);
	// in set values are not repeated
	System.out.println(set);
	
	
}
}

// OUTPUT
/*
[20, 10, 30]
*/
 

 