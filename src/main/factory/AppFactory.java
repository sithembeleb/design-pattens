package factory;

public class AppFactory {

    public static App createApp(AppType type) {
        App app;
        switch (type) {
            case IOS:
                app = new IOSApp();
                break;
            case TV:
                app = new TVApp();
                break;
            case GLASS:
                app = new GlassApp();
                break;
            default:
               throw new RuntimeException("Please provide implementation for type " + type.name());
        }
        return app;
    }
}
