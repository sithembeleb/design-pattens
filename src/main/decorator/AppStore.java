package decorator;

public class AppStore {

    public static void main(String[] args) {
//        final App app = new IOSApp();
//        app.developApp();

        final App tvApp = new TVAppDecorator(new IOSApp());
        tvApp.developApp();

        System.out.println("------");

        final App watchApp = new WatchAppDecorator(new IOSApp());
        watchApp.developApp();
    }
}
