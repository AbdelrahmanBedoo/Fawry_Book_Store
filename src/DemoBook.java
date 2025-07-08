public class DemoBook extends AbstractBook {
    private final Delievery deliveryStrategy;

    public DemoBook(String isbn, String title, String author, int yearPublished, double price) {
        super(isbn, title, author, yearPublished, price, 0);
        this.deliveryStrategy = new NoDelivery();
    }

    @Override
    public void reduceStock(int quantity) throws OutOfStock {
        throw new OutOfStock("Demo book '" + getTitle() + "' is not purchasable. Sorry for this ");
    }

    @Override
    public Delievery getDeliveryMethod() {
        return deliveryStrategy;
    }
}