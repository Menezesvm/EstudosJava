package entities;


public class SavingsAccount extends Account {
    private double interestRate;

    private SavingsAccount() {
        super();
    }
    private SavingsAccount(int number, String holder, double interestRate) {
        super(number, holder,interestRate);
    }
    private double getInterestRate (){
        return interestRate;
    }
    private void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public void updateBalance(double balance){
        balance = balance * interestRate;
    }

    @Override
    public void withdraw (double amount) {
        balance -= amount;
    }
}