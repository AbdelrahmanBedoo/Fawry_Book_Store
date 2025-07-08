public abstract class AbstractBook implements Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final int yearPublished;
    private final double price;
    protected int stock;

    protected AbstractBook(String isbn, String title, String author,
            int yearPublished, double price, int initialStock) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.stock = initialStock;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void reduceStock(int quantity) throws OutOfStock {
        if (quantity <= 0 || quantity > stock) {
            throw new OutOfStock("ISBN " + isbn + " has only " + stock + " copies");
        }
        stock -= quantity;
    }
}