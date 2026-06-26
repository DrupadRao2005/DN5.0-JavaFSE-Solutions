public class ForecastingTest {

    public static void main(String[] args) {

        Investment investment = new Investment(1000, 0.05);

        System.out.println("Initial Amount: $" + investment.getInitialAmount());
        System.out.println("Interest Rate: " + (investment.getInterestRate() * 100) + "%\n");

        System.out.println("=== Recursive Forecasting ===");

        for (int year = 1; year <= 5; year++) {
            double amount = RecursiveForecasting.calculateAmount(
                    investment.getInitialAmount(),
                    investment.getInterestRate(),
                    year);
            System.out.println("Year " + year + ": $" + String.format("%.2f", amount));
        }
    }
}