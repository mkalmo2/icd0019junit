package junit.sales;

public class TopSalesFinder {

    public void registerSale(SalesRecord record) {

        // store sales record for later analyses by findItemsSoldOver()

    }

    public SalesRecord[] getAllRecordsPaged(int start, int count) {

        // return a slice of all stored records

        return new SalesRecord[0];
    }

    public SalesRecordResult[] findItemsSoldOver(int amount) {

        // find ids of records that sold over specified amount.

        return new SalesRecordResult[0];
    }

    public void removeSalesRecordsFor(String id) {

        // removes records with specified id
    }

}


