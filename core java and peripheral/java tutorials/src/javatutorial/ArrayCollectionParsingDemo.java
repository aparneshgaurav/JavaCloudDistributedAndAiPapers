package javatutorial;

import java.util.ArrayList;

public class ArrayCollectionParsingDemo {
	String str;
public static void main(String args[]){
	ArrayList<String> demoStringArrayList=new ArrayList<String>();
	demoStringArrayList.add("java");
	demoStringArrayList.add("flex");
	demoStringArrayList.add("spring");
	System.out.println(demoStringArrayList);
	String str=null;
	for(int i=0;i<demoStringArrayList.size();i++){
	 str=str+demoStringArrayList.get(i)+",";
	}
	str=str+"end";
	System.out.println(str.substring(4).replace(",end"," "));
}
}
