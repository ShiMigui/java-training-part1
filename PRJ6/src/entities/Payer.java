package entities;

import util.Formatter;

public abstract class Payer {
    protected String name;
    protected Double income;

    public Payer(String name, Double income) {
        setName(name);
        setIncome(income);
    }

    public abstract Double getTax();

    public final Double getTotalTax() {
        Double total = getTax() - getDiscount();
        return (total < 0) ? 0.0 : total;
    }

    public Double getDiscount() {
        return 0.0;
    }

    public final StringBuilder generateNFE() {
        return generateNFE(new StringBuilder());
    }

    public final StringBuilder generateNFE(StringBuilder sb) {
        sb.append(name);
        sb.append("\nIncome: ");
        sb.append(Formatter.currency(income));
        sb.append("\nTax: ");
        sb.append(Formatter.currency(getTax()));
        sb.append("\nDiscount: ");
        sb.append(Formatter.currency(getDiscount()));
        sb.append("\n  TOTAL: ").append(Formatter.currency(getTotalTax()));
        return sb;
    }

    @Override
    public final String toString() {        
        return generateNFE().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = (income == null || income < 0) ? 0 : income;
    }

}
