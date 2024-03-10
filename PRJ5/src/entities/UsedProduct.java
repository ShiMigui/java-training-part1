package entities;

import java.time.LocalDate;
import util.Formatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        setManufactureDate(manufactureDate);
    }

    public UsedProduct(String name, Double price, String date) {
        super(name, price);
        setManufactureDate(date);
    }

    @Override
    public StringBuilder priceTag() {
        StringBuilder sb = super.priceTag();
        sb.append(" (");
        sb.append("USED, manufacture: ");
        sb.append(Formatter.fromDate(manufactureDate));
        sb.append(")");
        return sb;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setManufactureDate(String date) {
        setManufactureDate(Formatter.toDate(date));
    }
}
