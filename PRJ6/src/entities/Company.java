package entities;

public final class Company extends Payer {
    private Integer qtEmployees;

    public Company(String name, Double income, Integer qtEmployees) {
        super(name, income);
        setQtEmployees(qtEmployees);
    }

    @Override
    public Double getTax() {
        Double tax = (qtEmployees > 10) ? .14 : .16;
        return income * tax;
    }

    public Integer getQtEmployees() {
        return qtEmployees;
    }

    public void setQtEmployees(Integer qtEmployees) {
        this.qtEmployees = (qtEmployees == null || qtEmployees < 0) ? 0 : qtEmployees;
    }
}
