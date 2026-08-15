package entities;

public class Individual extends TaxPrayer{
    private Double healthExpenditure;

    public Individual() {
        super();
    }
     public Individual(String name, Double anualIncome, Double healthExpenditure) {
        super(name, anualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpendicture(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }
    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00) {
            return getAnualIncome() * 0.15 - healthExpenditure * 0.5;

        } else {
            return getAnualIncome() * 0.25 - healthExpenditure * 0.5;
        }
    }
}
