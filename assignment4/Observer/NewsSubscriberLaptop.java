package Assignment3.assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String message) {
        if ("Наука".equals(category)) {
            System.out.println("Laptop Subscriber: " + message);
        }
    }
}
