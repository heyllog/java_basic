package app;

import app.GenericItem.Category;

class GenericItem {
    public int ID;
    public String name;
    public float price;
    public Category category = Category.GENERAL;

    public enum Category {
        FOOD, PRINT, DRESS, GENERAL
    }

    GenericItem(int id, String name, float price) {
        this.ID = id;
        this.name = name;
        this.price = price;
    }

    GenericItem(int id, String name, float price, Category category) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void printAll() {
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%5.2f\n", ID, name, category, price);
    }
}

public class Main {
    public static void main(final String[] args) throws Exception {
        GenericItem first = new GenericItem(1, "go", 199.99f);
        GenericItem second = new GenericItem(10, "python", 199.99999f, Category.DRESS);
        GenericItem third = new GenericItem(1234, "ruby", 179f, Category.PRINT);
        first.printAll();
        second.printAll();
        third.printAll();
    }
}
