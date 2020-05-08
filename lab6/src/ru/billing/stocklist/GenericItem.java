package ru.billing.stocklist;

import java.util.Objects;


public class GenericItem implements Cloneable {
    private int ID;
    private static int currentID;
    private String name;
    private float price;
    private GenericItem analog = null;
    private Category category = Category.GENERAL;

    public void printAll() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        return Float.compare(that.getPrice(), price) == 0 &&
                name.equals(that.getName()) &&
                analog.equals(that.getAnalog()) &&
                category == that.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, analog, category);
    }

    public Object clone() throws
            CloneNotSupportedException {
        GenericItem item = (GenericItem) super.clone();
        item.analog = (GenericItem) analog.clone();
        item.category = category;
        return item;
    }

    public Object analogClone() throws CloneNotSupportedException {
        return this.analog.clone();
    }

    public String toString() {
        String analog_name = "No analogues";
        if (analog != null) {
            analog_name = analog.name;
        }
        return String.format("ID: %-6d Name: %-10s Category: %-11s Price: %-10.2f Analogue: %-18s",
                ID, name, category, price, analog_name);
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, Category category, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
        this.analog = analog;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
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
