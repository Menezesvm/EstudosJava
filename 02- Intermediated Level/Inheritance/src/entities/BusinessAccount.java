package entities;

public class BussinessAccount extends Account {
    private double loanLimit;

    public BussinessAccount() {
        super();
    }
    public BussinessAccount(Integer number, String name, double balance, double loanLimit) {
        super(number, name, balance);
        this.loanLimit = loanLimit;
    }
    public double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
