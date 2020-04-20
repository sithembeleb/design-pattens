package za.personal.factory;

import java.util.Arrays;

public class TestFactory {

    public static void main(String[] args) {

        Arrays.stream(AppType.values()).forEach( appType -> {

            try {
                App app = AppFactory.createApp(appType);
                app.develop();
                app.test();
                app.debug();
                app.deliver();
            } catch (Exception e){
                e.printStackTrace();
            }


        });

    }
}
