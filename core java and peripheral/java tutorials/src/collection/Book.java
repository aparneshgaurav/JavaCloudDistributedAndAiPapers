package collection;

public class Book implements Comparable<Book> {
String author;
String name;

Book(String author,String name){
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

@Override
public int compareTo(Book book) {
	return this.getName().compareTo(book.getName());
}



}
