package app;


public class GenericItem implements Cloneable {
    static int currentID = 0;

    public enum Category {
        FOOD,
        PRINT,
        DRESS,
        GENERAL
    }

    public int ID;
    public String name;
    public float price;
    public Category category = Category.GENERAL;
    public GenericItem analog = null;

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

    void printAll() {
//        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%5.2f\n", ID, name, category, price);
//        System.out.println("ID: " + ID);
//        System.out.println("Name: " + name);
//        System.out.println("Category: " + category);
//        System.out.println("Price: " + price);
//        if (analog != null)
//            System.out.println("Analogue: " + analog);
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