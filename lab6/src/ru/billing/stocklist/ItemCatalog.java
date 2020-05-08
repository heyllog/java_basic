package ru.billing.stocklist;

import ru.billing.exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    public void setALCatalog(ArrayList<GenericItem> ALCatalog) {
        this.ALCatalog = ALCatalog;
    }

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {
        for (Map.Entry<Integer, GenericItem> entry : catalog.entrySet()) {
            if (entry.getValue().equals(item)){
                throw new ItemAlreadyExistsException("Item Already Exists in HashMap");
            }
        }
//        IN CASE IF AL CHECK WILL BE REQUIRED
//        for (GenericItem entry : ALCatalog) {
//            if (entry.equals(item)) {
//                throw new ItemAlreadyExistsException("Item Already Exists in HashMap");
//            }
//        }
        catalog.put(item.getID(), item);
        ALCatalog.add(item);
    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        return catalog.getOrDefault(id, null);
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + this.getALCatalog().size();
    }
}
