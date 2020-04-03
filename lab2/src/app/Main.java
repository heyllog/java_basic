package app;

import java.util.Date;

class GenericItem implements Cloneable {
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

    void printAll() {
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%5.2f\n", ID, name, category, price);
    }

    public String toString() {
        return this.name;
    }

    public Boolean equals(GenericItem item) {
        return this.ID == item.ID &&
                this.name == item.name &&
                this.price == item.price &&
                this.category == item.category;
    }

    @Override
    public GenericItem clone() throws CloneNotSupportedException {
        return (GenericItem) super.clone();
    }
}

class FoodItem extends GenericItem {
    Date dateOfIncome; // дата производства
    short expires; // срок годности

    FoodItem(int id, String name, float price, Date date, short expires) {
        super(id, name, price);
        this.category = Category.FOOD;
        this.expires = expires;
        this.dateOfIncome = date;
    }

    @Override
    void printAll() {
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%-10.2f Expires: %-10d Date Of Income:%s \n", ID,
                name, category, price, expires, dateOfIncome);
    }

    public Boolean equals(FoodItem item) {
        return super.equals(item) &&
                this.dateOfIncome == item.dateOfIncome &&
                this.expires == item.expires;
    }

    @Override
    public FoodItem clone() throws CloneNotSupportedException {
        return (FoodItem) super.clone();
    }
}

class TechnicalItem extends GenericItem {
    short warrantyTime;

    TechnicalItem(int id, String name, float price, short warrantyTime) {
        super(id, name, price);
        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll() {
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%-10.2f Warranty: %d\n", ID, name, category,
                price, warrantyTime);
    }

    public Boolean equals(TechnicalItem item) {
        return super.equals(item) &&
                this.warrantyTime == item.warrantyTime;
    }

    @Override
    public TechnicalItem clone() throws CloneNotSupportedException {
        return (TechnicalItem) super.clone();
    }
}

public class Main {
    public static void main(final String[] args) throws Exception {
        // task1
        System.out.println("\n------------------------------------Task1------------------------------\n");
        GenericItem first = new GenericItem(1, "java", 199.99f);
        GenericItem second = new GenericItem(10, "python", 199.99999f);
        GenericItem third = new GenericItem(1234, "ruby", 179f);
        first.printAll();
        second.printAll();
        third.printAll();

        // task2
        System.out.println("\n------------------------------------Task2------------------------------\n");
        Date date = new Date();
        FoodItem food1 = new FoodItem(10, "food1", 123.03f, date, (short) 1);
        FoodItem food2 = new FoodItem(11, "food2", 165.03f, date, (short) 4);
        TechnicalItem tech1 = new TechnicalItem(12, "tech1", 354.1f, (short) 100);
        TechnicalItem tech2 = new TechnicalItem(13, "tech2", 1354.1f, (short) 365);
        GenericItem[] items = {food1, food2, tech1, tech2};

        for (GenericItem genericItem : items) {
            genericItem.printAll();
        }

        // tasks 2-2
        System.out.println("\n------------------------------------Task2.2----------------------------\n");
        System.out.println("Food1 == Food2 - " + food1.equals(food2));
        System.out.println("Food1 == Food1 - " + food1.equals(food1));

        TechnicalItem tech1_clone = tech1.clone();
        System.out.println("Tech1 == Tech1_clone - " + tech1.equals(tech1_clone));

        System.out.println(food1);
    }
}
