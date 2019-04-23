package decorator;

public class SimpleDecorator implements App{

    private final App delegate;


    public SimpleDecorator(App delegate) {
        this.delegate = delegate;
    }

    @Override
    public void developApp() {
        System.out.println("Preparing extra content...");
        this.delegate.developApp();
        System.out.println("Fine-tuning the app to be more perfect...");
    }
}
