package factory;

public class IOSApp implements App{
    @Override
    public void develop() {
        System.out.println("IOSApp develop");
    }

    @Override
    public void test() {
        System.out.println("IOSApp test");
    }

    @Override
    public void debug() {
        System.out.println("IOSApp debug");
    }

    @Override
    public void deliver() {
        System.out.println("IOSApp deliver");
    }
}
