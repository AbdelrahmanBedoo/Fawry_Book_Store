public class DeliveryByEmail implements Delievery {
    @Override
    public void deliver(Book book, String email) {
        System.out.println("Quantum book store: Emailing '" + book.getTitle() + "' to " + email);
    }
}