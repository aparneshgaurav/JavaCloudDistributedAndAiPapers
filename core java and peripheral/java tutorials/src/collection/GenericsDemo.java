package collection;

import java.util.ArrayList;
import java.util.List;

class GenericDemoBook{
	String author;
	String name;
	
	GenericDemoBook(String author,String name){
		this.author=author;
		this.name=name;
	}	
	
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}

public class GenericsDemo {
	public static void main(String args[]){
		List<GenericDemoBook> genericBooks =new ArrayList<GenericDemoBook>();
	    
	    
		GenericDemoBook genericBook1=new GenericDemoBook("apache","java");
		GenericDemoBook genericBook2=new GenericDemoBook("apache","flex");
		GenericDemoBook genericBook3=new GenericDemoBook("apache","hadoop");
		
		
		genericBooks.add(genericBook1);
		genericBooks.add(genericBook2);
		genericBooks.add(genericBook3);
		
		
		for(int i=0;i<genericBooks.size();i++){
			System.out.println("author name is "+genericBooks.get(i).getAuthor());
			System.out.println("book name is "+genericBooks.get(i).getName());
			System.out.println("");
		}
	}
}

// OUTPUT

/*author name is apache
book name is java

author name is apache
book name is flex

author name is apache
book name is hadoop

*/

