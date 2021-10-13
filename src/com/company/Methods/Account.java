package Methods;

public class Account{
    private double amount = 0;

    public void addMoney(double sum){
        amount+=sum;
    }

    public double getAmount() {
        return amount;
    }
}
