public class Investment {
    private double initialAmount;
    private double interestRate;

    public Investment(double initialAmount, double interestRate) {
        this.initialAmount = initialAmount;
        this.interestRate = interestRate;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }
}