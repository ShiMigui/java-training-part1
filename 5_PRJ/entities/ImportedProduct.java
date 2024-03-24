package entities;

import util.Formatter;

public class ImportedProduct extends Product {
    private Double customFee;

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        setCustomFee(customFee);
    }

    @Override
    public StringBuilder priceTag() {
        StringBuilder sb = super.priceTag();
        sb.append(" (IMPORTED, fee: ");
        sb.append(Formatter.currency(getCustomFee()));
        sb.append(")");
        return sb;
    }

    @Override
    public Double totalPrice() {
        return super.totalPrice() + getCustomFee();
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
}
