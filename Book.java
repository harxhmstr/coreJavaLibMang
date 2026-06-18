package LibraryManagment;

public class Book extends LibraryItem implements Borrowable{
	String title;
	String author;
	long isbn;
	boolean available;
	
	Book(String title, String author, long isbn,boolean available){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.available= available;
	}
	
	@Override
	void getDetails() {
		System.out.println("title :"+title+"\tauthor :"+author+"\tisbn :"+isbn+"\tavailable :"+available);
	
	}
	
	@Override
	public boolean borrowable() {
		return available;
	}
	
	@Override
	public String return_() {
		available =true;
		return "returnd successfully";
	}
	
}
