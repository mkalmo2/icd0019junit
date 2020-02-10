package junit.sales;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.emptyArray;

public class TopSalesFinderTests {

    @Test
    public void findTopSales() {
        assertThat(getItemsSoldOver(10), arrayContainingInAnyOrder("p1", "p2", "p3"));

        assertThat(getItemsSoldOver(39), arrayContainingInAnyOrder("p2", "p3"));
        assertThat(getItemsSoldOver(40), arrayContainingInAnyOrder("p3"));

        assertThat(getItemsSoldOver(50), emptyArray());
    }

    private String[] getItemsSoldOver(int amount) {
        SalesRecord[] records = {
                new SalesRecord("p1", 20, 1),
                new SalesRecord("p2", 20, 1),
                new SalesRecord("p2", 20, 1),
                new SalesRecord("p1", 10, 1),
                new SalesRecord("p3", 50, 1)
        };

        return new TopSalesFinder().findItemsSoldOver(amount, records);
    }


}
