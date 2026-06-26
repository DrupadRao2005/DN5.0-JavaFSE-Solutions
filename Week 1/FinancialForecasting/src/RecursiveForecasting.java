public class RecursiveForecasting {

    public static double calculateAmount(double currentAmount, double interestRate, int yearsLeft) {

        if (yearsLeft == 0) {
            return currentAmount;
        }

        double nextAmount = currentAmount * (1 + interestRate);
        return calculateAmount(nextAmount, interestRate, yearsLeft - 1);
    }
}