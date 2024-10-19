package Assignment3.assignment4.Observer;

public interface NewsPublisher {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers(String category, String message);
}
