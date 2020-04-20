package za.personal.decorator;

public class WatchAppDecorator extends AppDecorator  {

    public WatchAppDecorator(App delegate) {
        this.delegate = delegate;
    }

    @Override
    public void developApp() {
        this.delegate.developApp();
        System.out.println("Adding Watch extension...");
    }
}
