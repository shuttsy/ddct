package ddct;

import java.math.BigDecimal;

public enum Item {
    APPLE(new BigDecimal("0.60")),
    ORANGE(new BigDecimal("0.25"));

    private BigDecimal cost;

    Item(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public static Item getItem(String name) {
        return Item.valueOf(name.toUpperCase());
    }
}
