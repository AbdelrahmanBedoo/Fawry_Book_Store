public class Testing {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        store.addBook(
                BookSystem.createPaperBook("ISBN001", "How to get your first internship?", "Abderlahman Abdelbaky",
                        2025, 10, 5));
        store.addBook(BookSystem.createEBook("ISBN002", "How to switch from C++ to Java in one week and half",
                "Ahmed El Shazly", 2018, 10000, "pdf"));
        store.addBook(BookSystem.createDemoBook("ISBN003", "Design Patterns", "Someone Famous", 1994, 0));

        store.addBook(
                BookSystem.createPaperBook("ISBN004", "Intersting Title", "Omar El Araby ",
                        1990, 596, 2));

        // a user with a budget, email, and address
        User Abdelrahman = new User("Abdelrahman", "abderahmanmohammed88@gmail.com", "123 Cairo St", 300.00);

        // clean outdated books (older than 20 years)
        // I assumed that demo books are usually not purchased and usually are kept and
        // used for anohter purpose,
        // so I decided that they should not be removed using the removeOutdatedBooks
        // method
        store.removeOutdatedBooks(20);

        try {
            store.buyBook(Abdelrahman, "ISBN001", 1);
        } catch (OutOfStock | InsufficientFunds e) {
            System.err.println("Quantum book store: ERROR - " + e.getMessage());
        }

        try {
            store.buyBook(Abdelrahman, "ISBN002", 2);
        } catch (OutOfStock | InsufficientFunds e) {
            System.err.println("Quantum book store: ERROR - " + e.getMessage());
        }
        try {
            store.buyBook(Abdelrahman, "ISBN003", 2);
        } catch (OutOfStock | InsufficientFunds e) {
            System.err.println("Quantum book store: ERROR - " + e.getMessage());
        }
        try {
            store.buyBook(Abdelrahman, "ISBN004", 2);
        } catch (OutOfStock | InsufficientFunds e) {
            System.err.println("Quantum book store: ERROR - " + e.getMessage());
        }
    }
}