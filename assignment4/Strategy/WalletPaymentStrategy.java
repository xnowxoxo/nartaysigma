package Assignment3.assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price; // Без комиссии
    }
}
