
public class PaperBook extends AbstractBook {
    private final Delievery deliveryMethod;

    public PaperBook(String isbn, String title, String author, int yearPublished, double price, int initialStock) {
        super(isbn, title, author, yearPublished, price, initialStock);
        this.deliveryMethod = new ShippingDelivery();
    }

    @Override
    public Delievery getDeliveryMethod() {
        return deliveryMethod;
    }
}