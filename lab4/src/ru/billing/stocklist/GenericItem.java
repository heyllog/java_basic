package ru.billing.stocklist;


public class GenericItem implements Cloneable {
    private int ID;
    private String name;
    private float price;
    private GenericItem analog;
    private Category category = Category.GENERAL;

    static int currentID = 0;

    public enum Category {
        FOOD,
        PRINT,
        DRESS,
        GENERAL
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public void printAll() {
        System.out.println(this.toString());
    }

    public String toString() {
        String analog_name = "No analogues";
        if (analog != null) {
            analog_name = analog.name;
        }
        return String.format("ID: %-6d Name: %-10s Category: %-11s Price: %-10.2f Analogue: %-18s",
                ID, name, category, price, analog_name);
    }

    public boolean equals(GenericItem item) {
        return this.ID == item.ID &&
                this.name == item.name &&
                this.price == item.price &&
                this.category == item.category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
