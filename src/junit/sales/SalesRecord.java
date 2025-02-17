package junit.sales;

public record SalesRecord(String productId,
                          String productName,
                          int productPrice,
                          int itemsSold) {

    public SalesRecord(String productId, int productPrice, int itemsSold) {
        this(productId, productId, productPrice, itemsSold);
    }
}
