package Assignment3.Chain;

public class PaymentC extends PaymentHandler {
    private float dollars = 1000;

    @Override
    public boolean handle(float money) {
        if (dollars >= money) {
            System.out.println("Payment C: You have enough money!");
            dollars -= money;
            return true;
        } else {
            System.out.println("Payment C: You don't have enough money!");
            if (next != null) {
                return next.handle(money);  // Передаем запрос следующему обработчику
            }
        }
        return false;
    }
}
