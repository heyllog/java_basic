package app;

import java.util.Date;


public class FoodItem extends GenericItem {
    Date dateOfIncome; // дата производства
    short expires; // срок годности

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.category = Category.FOOD;
        this.expires = expires;
        this.dateOfIncome = date;
    }

    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.FOOD);
        this.expires = expires;
    }

    public FoodItem(String name) {

    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Expires: " + expires);
        System.out.println("Date Of Income: " + dateOfIncome);
    }

    public Boolean equals(FoodItem item) {
        return super.equals(item) &&
                this.dateOfIncome == item.dateOfIncome &&
                this.expires == item.expires;
    }

    @Override
    public FoodItem clone() throws CloneNotSupportedException {
        FoodItem item = (FoodItem) super.clone();
        if (this.analog != null) {
            item.analog = this.analog.clone();
        }
        return item;
    }
}
