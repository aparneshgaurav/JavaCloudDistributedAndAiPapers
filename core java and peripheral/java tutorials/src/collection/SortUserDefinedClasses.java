package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUserDefinedClasses {
public static void main(String args[]){
	
	Book book=new Book("oneAuthor","catName");
	Book book1=new Book("twoAuthor","batName");
	Book book2=new Book("threeAuthor","appleName");
	
	List<Book> books=new ArrayList<Book>();
	books.add(book);
	books.add(book1);
	books.add(book2);
	
	
	System.out.println("before sorting "+books);
	for(int i=0;i<books.size();i++){
		System.out.println(books.get(i).getName());
	}
	
	Collections.sort(books);
	System.out.println("after sorting "+books);
	for(int i=0;i<books.size();i++){
		System.out.println(books.get(i).getName());
	}
}
}

// OUTPUT

/*              before sorting [collection.Book@19821f, collection.Book@addbf1, collection.Book@42e816]
                catName
                batName
                appleName
                after sorting [collection.Book@42e816, collection.Book@addbf1, collection.Book@19821f]
                appleName
                batName
                catName
*/