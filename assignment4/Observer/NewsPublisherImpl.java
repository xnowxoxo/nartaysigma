package Assignment3.assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String category, String message) {
        for (Observer observer : subscribers) {
            observer.update(category, message);
        }
    }

    public void publishNews(String category, String message) {
        System.out.println("Publishing news in category: " + category);
        notifySubscribers(category, message);
    }
}
