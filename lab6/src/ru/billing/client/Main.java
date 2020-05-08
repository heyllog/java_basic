package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;
import sync.*;


public class Main {
    public static void main(String[] args) throws CatalogLoadException {
        String filename = "D:\\Work\\java_basic\\lab6\\static\\items.txt";
        ItemCatalog catalog = new ItemCatalog();
        CatalogFileLoader fileLoader = new CatalogFileLoader(filename);
        fileLoader.load(catalog);
        System.out.println(catalog);
        catalog.printItems();
    }
}
