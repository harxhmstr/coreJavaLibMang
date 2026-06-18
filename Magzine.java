package LibraryManagment;

public class Magzine extends LibraryItem{
	String title;
	String author;
	long isbn;
	boolean available;
	@Override 
	void getDetails() {
		System.out.println("title :"+title);
		System.out.println("author :"+author);
		System.out.println("isbn :"+isbn);
		System.out.println("available :"+available);
	}
	
	Magzine(String title, String author, long isbn,boolean available){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.available= available;
	}
}
