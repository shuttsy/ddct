package ddct;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Till {

    private Map<String,Item> itemMap;

    public Till() {
        itemMap = new HashMap<String,Item>();
        // each 2nd apple is free
        itemMap.put("APPLE", new Item(new BigDecimal("0.60"),Integer.valueOf("2")));
        // each 3rd orange is free
        itemMap.put("ORANGE", new Item(new BigDecimal("0.25"),Integer.valueOf("3")));
    }

    public BigDecimal calculateTotalCost(List<String> itemList) {
        BigDecimal total = BigDecimal.ZERO;
        for (String itemName: itemList) {
            Item item = itemMap.get(itemName.toUpperCase());
            if(null != item) {
                total = total.add(item.registerItemAndGetCost());
            }
            else {
                // item not registered on till so must be free!!!
            }
        }
        return total;
    }
}
