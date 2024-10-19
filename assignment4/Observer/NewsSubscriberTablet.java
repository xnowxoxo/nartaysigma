package Assignment3.assignment4.Observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String message) {
        System.out.println("Tablet Subscriber: " + message); // Получает все уведомления
    }
}
