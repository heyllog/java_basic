package app;


import java.text.SimpleDateFormat;

public class TechnicalItem extends GenericItem {
    short warrantyTime;

    TechnicalItem(int id, String name, float price, short warrantyTime) {

        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Warranty Time: %d", warrantyTime);
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
