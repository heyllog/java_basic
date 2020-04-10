package app;

import java.util.Date;
import java.text.SimpleDateFormat;


public class FoodItem extends GenericItem {
    Date dateOfIncome; // дата производства
    short expires; // срок годности

    public FoodItem(String name, float price, short expires, FoodItem analog, Date dateOfIncome) {
        super(name, price, analog);
        this.category = Category.FOOD;
        this.expires = expires;
        this.dateOfIncome = dateOfIncome;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, expires, null, new Date());
    }

    public FoodItem(String name) {
        this(name, 0.0f, (short) 0, null, new Date());
    }

    @Override
    public String toString() {
        String formatted_date = new SimpleDateFormat("dd.MM.yyyy").format(dateOfIncome);
        return super.toString() + String.format("Expires: %-6d Date Of Income: %s", expires, formatted_date);
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
