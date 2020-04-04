package app;


public class GenericItem implements Cloneable {
    public int ID;
    public String name;
    public float price;
    public Category category = Category.GENERAL;
    public GenericItem analog;

    public enum Category {
        FOOD, PRINT, DRESS, GENERAL
    }

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    public GenericItem() {

    }

    void printAll() {
//        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%5.2f\n", ID, name, category, price);
        System.out.println();
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
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
        GenericItem item = (GenericItem) super.clone();
        if (this.analog != null) {
            item.analog = this.analog.clone();
        }
        return item;
    }
}