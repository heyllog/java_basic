package app;


public class TechnicalItem extends GenericItem {
    short warrantyTime;

    TechnicalItem(int id, String name, float price, short warrantyTime) {

        this.warrantyTime = warrantyTime;
    }

    @Override
    void printAll() {
        super.printAll();
        System.out.println("Warranty Time: " + warrantyTime);
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
