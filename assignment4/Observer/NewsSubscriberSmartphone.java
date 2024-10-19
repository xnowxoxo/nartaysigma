package Assignment3.assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String message) {
        if ("Спорт".equals(category)) {
            System.out.println("Smartphone Subscriber: " + message);
        }
    }
}
