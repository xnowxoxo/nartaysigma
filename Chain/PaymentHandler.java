package Assignment3.Chain;

public abstract class PaymentHandler {
    protected PaymentHandler next;  // Ссылка на следующий обработчик

    // Метод для установки следующего обработчика в цепочке
    public PaymentHandler setNext(PaymentHandler nextHandler) {
        this.next = nextHandler;
        return this;  // Возвращаем текущий объект для цепочки вызовов
    }

    // Абстрактный метод для обработки платежа
    public abstract boolean handle(float money);
}
