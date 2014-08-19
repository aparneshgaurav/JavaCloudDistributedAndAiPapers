package collection;

import java.util.ArrayList;
import java.util.List;

class GenericBook{
	
	String author;
	String name;
	
	GenericBook(String author,String name){
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

public class WithoutGenericsDemo {
public static void main(String args[]){
	 List<Object> genericBooks=new ArrayList<Object>();
    
	GenericBook genericBook1=new GenericBook("apache","java");
	GenericBook genericBook2=new GenericBook("apache","flex");
	GenericBook genericBook3=new GenericBook("apache","hadoop");
	
	genericBooks.add(genericBook1);
	genericBooks.add(genericBook2);
	genericBooks.add(genericBook3);
	
	
	for(int i=0;i<genericBooks.size();i++){
		//So,here we are going to face the overhead of typecasting Objects to our custom objects.
		System.out.println("author name is "+((GenericBook) genericBooks.get(i)).getAuthor());
		System.out.println("book name is "+((GenericBook)(genericBooks.get(i))).getName());
		System.out.println("");
	}
}
}


// OUTPUT

/*

author name is apache
book name is java

author name is apache
book name is flex

author name is apache
book name is hadoop

*/