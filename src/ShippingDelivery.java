public class ShippingDelivery implements Delievery {
    @Override
    public void deliver(Book book, String address) {
        System.out.println("Fawry book store: Shipping '" + book.getTitle() + "' to " + address);
        // Strategy allows adding new shipping providers later without changing Book classes
    }
} 