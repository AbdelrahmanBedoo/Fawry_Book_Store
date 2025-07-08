public class EBook extends AbstractBook {
    private final Delievery deliveryStrategy;
    private final String fileType;

    public EBook(String isbn, String title, String author, int yearPublished, double price, String fileType) {
        super(isbn, title, author, yearPublished, price, Integer.MAX_VALUE);
        this.fileType = fileType;
        this.deliveryStrategy = new DeliveryByEmail();
    }

    @Override
    public void reduceStock(int quantity) {
        // eBooks will no never run out, so override as no-op
    }

    @Override
    public Delievery getDeliveryMethod() {
        return deliveryStrategy;
    }
}