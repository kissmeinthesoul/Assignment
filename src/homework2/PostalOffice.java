package homework2;

import java.util.ArrayList;
import java.util.List;

public class PostalOffice implements Observed{

    List<String> magazines = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addMagazines(String magazine) {
        magazines.add(magazine);
        sendAll();
    }

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void sendAll() {
        for(Observer observer: subscribers) {
            observer.handle(magazines);
        }
    }
}
