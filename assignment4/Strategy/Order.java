package Assignment3.assignment4.Strategy;

public class Order {
    private double price;
    private PaymentStrategy paymentStrategy;

    public Order(double price, PaymentStrategy paymentStrategy) {
        this.price = price;
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateFinalPrice() {
        return paymentStrategy.calculateFinalPrice(price);
    }
}
