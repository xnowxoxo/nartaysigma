package Assignment3.assignment3.Chain;

public class PaymentA extends PaymentHandler {
    private float dollars = 100;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment A: You have enough money!");
            dollars -= money;
            return true;
        } else {
            System.out.println("Payment A: You don't have enough money!");
            if (next != null) {
                return next.handle(money);  // Передаем запрос следующему обработчику
            }
        }
        return false;
    }
}
