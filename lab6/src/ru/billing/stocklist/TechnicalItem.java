package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private Short warrantyTime;

    public Short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(Short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Warranty Time: %d", warrantyTime);
    }

    public boolean equals(Object o) {
        if (!(o instanceof TechnicalItem)) {
            return false;
        }
        return this == o;
    }
}
