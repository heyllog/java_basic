package ru.billing.stocklist;


public class TechnicalItem extends GenericItem implements Cloneable {
    private short warrantyTime;

    public TechnicalItem(String name, float price, short warrantyTime) {
        super(name, price, Category.GENERAL);
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

    public short getWarrantyTime() {
        return warrantyTime;
    }
    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
}
