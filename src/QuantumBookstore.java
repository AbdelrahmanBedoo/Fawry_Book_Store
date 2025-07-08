import java.util.List;

public class QuantumBookstore {
    private final Inventory inventory;

    public QuantumBookstore() {
        this.inventory = new Inventory();
    }

    public void addBook(Book book) {
        inventory.addBook(book);
    }

    public List<Book> removeOutdatedBooks(int years) {
        return inventory.removeOutdated(years);
    }

    public double buyBook(User user, String isbn, int quantity) throws OutOfStock, InsufficientFunds {
        Book book = inventory.findByIsbn(isbn);
        book.reduceStock(quantity);
        double total = book.getPrice() * quantity;
        user.deductBudget(total);
        String destination = (book instanceof EBook) ? user.getEmail() : user.getAddress();
        book.getDeliveryMethod().deliver(book, destination);
        System.out.println("Fawry book store: Purchase complete. Ordered: " + quantity + " book(s). Total paid: $"
                + total + ". Remaining budget: $" + user.getBudget());
        return total;
    }
}