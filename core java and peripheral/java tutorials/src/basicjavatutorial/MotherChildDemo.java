package basicjavatutorial;

import java.util.ArrayList;
import java.util.List;

public class MotherChildDemo {
/**
 * demo
 */
	
	public static void main(String args[]){
		System.out.println("hi");
		Mother mother = new  Mother();
		mother.setMotherId(1);
		
		Childd child = new  Childd();
		child.setChildId(11);
		
		Childd childOther = new  Childd();
		childOther.setChildId(12);
		
		List<Childd> list = new ArrayList<Childd>();
		list.add(childOther);
		list.add(child);
		
		
		
		mother.setChildList(list);
		
		for(int i=0;i<mother.getChildList().size();i++){
			System.out.println("hi"+mother.getChildList().get(i).getChildId());
		}
	}
}
