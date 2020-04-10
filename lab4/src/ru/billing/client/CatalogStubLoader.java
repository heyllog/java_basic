package ru.billing.client;

import ru.billing.stocklist.*;

import java.util.Date;


public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) {
        GenericItem item1 = new GenericItem("Sony TV", 23000, GenericItem.Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, (short) 10, null, new Date());
        catalog.addItem(item1);
        catalog.addItem(item2);
    }
}
