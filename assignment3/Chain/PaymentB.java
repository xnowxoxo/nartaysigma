package Assignment3.assignment3.Chain;

public class PaymentB extends PaymentHandler {
    private float dollars = 300;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment B: You have enough money!");
            dollars -= money;
            return true;
        } else {
            System.out.println("Payment B: You don't have enough money!");
            if (next != null) {
                return next.handle(money);  // Передаем запрос следующему обработчику
            }
        }
        return false;
    }
}
