package ddct;

import java.math.BigDecimal;
import java.util.List;

public class Till {

    public BigDecimal calculateTotalCost(List<String> itemList) {
        BigDecimal total = BigDecimal.ZERO;
        for (String itemName: itemList) {
            Item item = Item.getItem(itemName);
            total = total.add(Item.getItem(itemName).getCost());
        }
        return total;
    }
}
