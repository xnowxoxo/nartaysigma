package Assignment3.assignment4.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price + (price * 0.02); // Комиссия 2%
    }
}
