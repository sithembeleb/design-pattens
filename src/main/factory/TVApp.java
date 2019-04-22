package factory;

public class TVApp implements App{
    @Override
    public void develop() {
        System.out.println("TVApp develop");
    }

    @Override
    public void test() {
        System.out.println("TVApp test");
    }

    @Override
    public void debug() {
        System.out.println("TVApp debug");
    }

    @Override
    public void deliver() {
        System.out.println("TVApp deliver");
    }
}
