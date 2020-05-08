package ru.billing.stocklist;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private Short expires;

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public Short getExpires() {
        return expires;
    }

    public void setExpires(Short expires) {
        this.expires = expires;
    }

    public boolean equals(Object o) {
        if (!(o instanceof FoodItem)) {
            return false;
        }
        return this == o;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    @Override
    public String toString() {
        String formatted_date = new SimpleDateFormat("dd.MM.yyyy").format(dateOfIncome);
        return super.toString() + String.format("Expires: %-6d Date Of Income: %s", expires, formatted_date);
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, null, new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, 100, null, new Date(), (short) 2);
    }
}
