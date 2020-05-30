package homework2;

public interface Observed {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void sendAll();
}
