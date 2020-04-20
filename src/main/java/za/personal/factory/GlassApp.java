package za.personal.factory;

public class GlassApp implements App{
    @Override
    public void develop() {
        System.out.println("GlassApp develop");
    }

    @Override
    public void test() {
        System.out.println("GlassApp test");
    }

    @Override
    public void debug() {
        System.out.println("GlassApp debug");
    }

    @Override
    public void deliver() {
        System.out.println("GlassApp deliver");
    }
}
