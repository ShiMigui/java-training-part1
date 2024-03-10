package entities;

public final class Individual extends Payer {
    private Double medicalCosts;

    public Individual(String name, Double income, Double medicalCosts) {
        super(name, income);
        setMedicalCosts(medicalCosts);
    }

    @Override
    public Double getTax() {
        Double tax = (income >= 20000) ? .25 : .15;
        return income * tax;
    }

    @Override
    public Double getDiscount() {
        return super.getDiscount() + medicalCosts * .5;
    }

    public Double getMedicalCosts() {
        return medicalCosts;
    }

    public void setMedicalCosts(Double medicalCosts) {
        this.medicalCosts = (medicalCosts == null || medicalCosts < 0) ? 0 : medicalCosts;
    }
}
