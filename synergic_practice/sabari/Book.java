package sabari;
import java.util.*;
import java.util.Map.Entry;

class Book {
	static Set<Book> appe = new HashSet<>();
	static Map<Book, Long> book = new HashMap<>();
	long ISBN;
	String AuthorName;
	int year;
	String BookName;

	Book(long ISBN, String AuthorName, String BookName, int year) {
		this.ISBN = ISBN;
		this.AuthorName = AuthorName;
		this.BookName = BookName;
		this.year = year;
	}

	public static void addBook(long ISBN, String AuthorName, String BookName, int year) {

		boolean flag = false;
		for (Entry<Book, Long> ent : book.entrySet()) {
			Book val = ent.getKey();
			if (val.ISBN == ISBN) {
				flag = true;
				appe.add(new Book(ISBN, AuthorName, BookName, year));
				break;
			}
		}
		if (!flag) {
			book.put(new Book(ISBN, AuthorName, BookName, year), ISBN);
			// flag=false;
		}
	}

	public static List<String> findBookByAuthor(String AuthorName) {
		ArrayList<String> al = new ArrayList<>();
		for (Entry<Book, Long> ent : book.entrySet()) {
			Book v = ent.getKey();
			if (v.AuthorName.equalsIgnoreCase(AuthorName)) {
				al.add(v.BookName);
			}
		}
		return al;
	}

	public static List<String> findBookByYear(int year) {
		ArrayList<String> al = new ArrayList<>();
		for (Entry<Book, Long> ent : book.entrySet()) {
			Book v = ent.getKey();
			if (v.year == year) {
				al.add(v.BookName);
			}
		}
		for (Book ent1 : appe) {
			if (ent1.year == year) {
				al.add(ent1.BookName);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		Book.addBook(1234567890123l, "Radhakrishnan", "The Art of Wining", 2002);
		Book.addBook(1234567890123l, "Dale", "Stop worring and start living", 2001);
		Book.addBook(1234567890120l, "Kumar", "Enjoy your life", 2002);
		System.out.println(Book.findBookByAuthor("RadhaKrishnan"));
		System.out.println(Book.findBookByYear(2002));
	}// main
}