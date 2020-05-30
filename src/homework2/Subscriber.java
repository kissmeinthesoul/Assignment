package homework2;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handle(List<String> magazines) {
        System.out.println("Dear "+name+"\nWe sent you our magazines:\n"+magazines);
    }
}
