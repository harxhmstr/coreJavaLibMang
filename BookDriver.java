package LibraryManagment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class BookDriver {
	static ArrayList<LibraryItem> list = new ArrayList<>();
	static HashMap<Long,LibraryItem> listMap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Book b1 = new Book("The Mistak","Elle Kennedy",78547855,true);
		list.add(b1);
		listMap.put(b1.isbn, b1);
		
		Book b2 = new Book("The Score","Elle Kennedy",58965441,false);
		list.add(b2);
		listMap.put(b2.isbn, b2);
		
		Book b3 = new Book("Mathematics","RD sharma",896441,true);
		list.add(b3);
		listMap.put(b3.isbn, b3);
		
		Book b4 = new Book("calss 10 science","Albert croxs",985222,false);
		list.add(b4);
		listMap.put(b4.isbn, b4);
		
		Book b5 = new Book("The Deal","Elle Kennedy",78547856,true);
		list.add(b5);
		listMap.put(b5.isbn, b5);
		
		Book b6 = new Book("Rich Dad Poor Dad","Alex berk",156324,true);
		list.add(b6);
		listMap.put(b6.isbn, b6);
		
		System.out.println("=====Weclcome to programe========");
		showMenu();
		
	}
	
	static void showMenu() {
		System.out.println("press 1 : to add item");
		System.out.println("press 2 : to view all");
		System.out.println("press 3 : seach by ISBN");
		System.out.println("press 4 : to borrow");
		System.out.println("press 5 : to return");
		System.out.println("press 6 : to exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			addItem();
			break;
		case 2:
			for(LibraryItem x:list) {
				x.getDetails();
				System.out.println("========================================");
			}
			break;
		case 3:
			search();
			break;
		case 4:
			borrow();
			break;
		case 5: 
			return_();
			break;
		case 6:{
			System.out.println("the application terminates!!!");
			System.exit(0);
		}
			
		default: 
			System.out.println("Invalid input");
		}
		showMenu();
		
	}
	static void addItem(){
		System.out.print("Enter Title: ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter ISBN: ");
        long isbn = sc.nextLong();
        Book b1=new Book(title,author,isbn,true);
        list.add(b1);
        listMap.put(isbn, b1);
	}
	
	static Book search() {
		System.out.println("Enter the isbn number");
		LibraryItem found = listMap.get(sc.nextLong());
		if(found == null) {
			System.out.println("Book not found");
			return null;
		}
		found.getDetails();
		return (Book)found;
	}
	
	static void borrow() {
		Book b= search();
		if(b==null || b.available!=true) {
			try {
				throw new BookNotAvialable();
			}catch(BookNotAvialable e) {
				System.out.println("book is not available to borrow");
			}
			return;
		}
		
		System.out.println("do you want to borrow/n1) YES/n2) NO");
		int choice =  sc.nextInt();
		if(choice==1) {
			System.out.println("borrow approved ");
			b.available=false;
		}		
	}
	
	static void return_() {
		Book b = (Book)search();
		if(b==null) {
			try {
				throw new BookNotAvialable();
			}catch(BookNotAvialable e) {
				System.out.println("book is not available to borrow");
				return;
			}			
		}
		System.out.println("returned sucessfully");
		b.available=true;
	}
	
}
