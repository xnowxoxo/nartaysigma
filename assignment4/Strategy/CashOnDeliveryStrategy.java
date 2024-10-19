package Assignment3.assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalPrice(double price) {
        return price + 300; // Дополнительная плата за доставку
    }
}
