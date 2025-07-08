import java.util.*;

public class Inventory {
    private final Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Added '" + book.getTitle() + "' to inventory");
    }

    /**
     * Removes and returns books older than maxAgeYears, but keeps demo books even
     * if they are outdated.
     * I thought that Demo books can be kept for reference, display, or historical
     * purposes.
     */
    public List<Book> removeOutdated(int maxAgeYears) {
        List<Book> removed = new ArrayList<>();
        for (Iterator<Book> it = books.values().iterator(); it.hasNext();) {
            Book book = it.next();
            // Exclude demo books from being removed, even if outdated
            if (!(book instanceof DemoBook) && book.isOutdated(maxAgeYears)) {
                removed.add(book);
                it.remove();
                System.out.println("Quantum book store: Removed outdated '" + book.getTitle() + "'");
            }
        }
        return removed;
    }

    public Book findByIsbn(String isbn) throws OutOfStock {
        Book book = books.get(isbn);
        if (book == null)
            throw new OutOfStock("Book with ISBN " + isbn + " not found");
        return book;
    }
}