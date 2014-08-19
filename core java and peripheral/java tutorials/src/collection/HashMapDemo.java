package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]){
		Map<String,Integer> map=new HashMap<String,Integer>();

		map.put("key1",10);
		map.put("key2",20);
		map.put("key2",50);// so this statement shows that the value for the last key
		// value is considered.

		// keys are not repeated
		System.out.println(map);
		System.out.println("keys are : "+map.keySet());

		System.out.println(map.get("key1"));
		System.out.println(map.get("key2"));

	}
}

// OUTPUT

/*
{key2=50, key1=10}
10
50
 */
