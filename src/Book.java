import java.time.Year;

public interface Book {
    String getIsbn();

    String getTitle();

    String getAuthor();

    int getYearPublished();

    double getPrice();

    int getStock();

    void reduceStock(int quantity) throws OutOfStock;

    Delievery getDeliveryMethod();

    default boolean isOutdated(int maxAgeYears) {

        int age = Year.now().getValue() - getYearPublished();
        return age > maxAgeYears;
    }
}