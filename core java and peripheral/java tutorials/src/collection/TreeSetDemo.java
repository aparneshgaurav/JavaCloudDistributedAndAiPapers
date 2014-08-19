package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String args[]){
Set<Integer> set=new TreeSet<Integer>();
	//TreeSet ensures no duplicacy of elements and keeps it in sorted order.
	set.add(10);
	set.add(20);
	set.add(20);
	// value 20 is added twice,but the output shows that duplicates not allowed
	set.add(30);
	System.out.println(set);
	
	// tree set is a set with values in sorted order
}
}

// OUTPUT
/*
[10, 20, 30]

 */