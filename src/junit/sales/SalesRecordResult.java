package junit.sales;

public record SalesRecordResult(String productId,
                                String productName,
                                int total) {

    public SalesRecordResult(String productId, int total) {
        this(productId, productId, total);
    }
}
