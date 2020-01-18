package ypok49;

import java.util.HashMap;
import java.util.Map;

class Ticket{
	int number;
	String LibraryName;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((LibraryName == null) ? 0 : LibraryName.hashCode());
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (LibraryName == null) {
			if (other.LibraryName != null)
				return false;
		} else if (!LibraryName.equals(other.LibraryName))
			return false;
		if (number != other.number)
			return false;
		return true;
	}	
}

class Book{
	String author;
	String name;
}



public class HashCode extends Object {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		ticket.number = 123;
		Book book = new Book();
		book.author = "Karnegy";
		book.name = "How to find friends";
		Map<Ticket, Book> library = new HashMap<>();
		library.put(ticket, book);
		
		Ticket ticket2 = new Ticket();
		ticket2.number = 123;
		
		Book KarnegyBook = library.get(ticket2);
		System.out.println(KarnegyBook.author);
	}

}
