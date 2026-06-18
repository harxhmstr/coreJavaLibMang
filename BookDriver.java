package LibraryManagment;
import java.util.ArrayList;
import java.util.Scanner;
public class BookDriver {
	static ArrayList<LibraryItem> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		list.add(new Book("The Mistak","Elle Kennedy",78547855,true));
		list.add(new Book("The Score","Elle Kennedy",58965441,false));
		list.add(new Book("Mathematics","RD sharma",896441,true));
		list.add(new Book("calss 10 science","Albert croxs",985222,false));
		list.add(new Book("The Deal","Elle Kennedy",78547856,true));
		list.add(new Book("Rich Dad Poor Dad","Alex berk",156324,true));
		
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
				System.out.println("===========");
			}
			break;
		case 3:
			//search();
			break;
		case 4:
			//borrow();
			break;
		case 5: 
			//return_();
			break;
		case 6:
			System.exit(0);
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
	}
}
