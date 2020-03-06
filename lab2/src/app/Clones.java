package app;

class GenericItem2 implements Cloneable {
    public int ID;
    public String name;
    public float price;
    public Category category = Category.GENERAL;
    public GenericItem2 analogue;

    public enum Category {
        FOOD, PRINT, DRESS, GENERAL
    }

    GenericItem2(int id, String name, float price) {
        this.ID = id;
        this.name = name;
        this.price = price;
    }

    void printAll() {
        System.out.printf("ID: %-10d Name: %-10s Category: %-10s price:%5.2f\n", ID, name, category, price);
    }

    @Override
    public GenericItem2 clone() throws CloneNotSupportedException {
        GenericItem2 item = (GenericItem2) super.clone();
        // item.analogue = (GenericItem2) this.analogue.clone();
        if (this.analogue != null) {
            item.analogue = (GenericItem2) this.analogue.clone();
        }
        return item;
    }
}

public class Clones {
    public static void main(final String[] args) throws Exception {
        System.out.println("\n------------------------------------Task2.3----------------------------\n");
        GenericItem2 item = new GenericItem2(10, "item", 2141.12f);
        GenericItem2 analogue = new GenericItem2(11, "analogue", 2141.12f);
        item.analogue = analogue;
        System.out.println(item.analogue);
        GenericItem2 item_clone = item.clone();
        System.out.println(item_clone.analogue);
    }
}
