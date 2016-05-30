package ddct;

import java.math.BigDecimal;

public class Item {
    private BigDecimal cost;
    private Integer offerCount;
    private Integer count;

    public Item(BigDecimal cost, Integer offerCount) {
        this.cost = cost;
        this.offerCount = offerCount;
        this.count = new Integer("0");
    }

    public BigDecimal registerItemAndGetCost() {
        // count the number of items
        count++;
        return (count % offerCount == 0) ? BigDecimal.ZERO: this.cost;
    }

}
