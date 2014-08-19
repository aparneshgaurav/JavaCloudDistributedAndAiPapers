package testpackage;
class Book{	
	private int pages;
	private String author;	
	public void setPages(int pages){
		this.pages=pages;
	}
	
	public int getPages(){
		return this.pages;
	}	 
	Book(int pages){
		this.pages=pages;
	}
	Book(){
	}	
}
public class AccessModifierDemo {
	public static void main(String[] args) {
		Book book = new Book();
		//System.out.println(book.pages);
		
		book.setPages(100);
		System.out.println(book.getPages());
		
		Book bookParameterized =new Book(100);
		System.out.println(bookParameterized.getPages());		
	}

}
