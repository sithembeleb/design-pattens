package za.personal.singleton;

/*
-- This approach only synchronises only when mySingletonImp4 is null
-- This addresses all the potential issues but the keyword synchronized should be avoided since it comes with performance issues
 */

public class MySingletonImp4 {

    private static MySingletonImp4 mySingletonImp4 = null;

    private MySingletonImp4() {
    }

    public static MySingletonImp4 createMySingleton() {
        if(mySingletonImp4 == null) {
            synchronized (MySingletonImp4.class){
                return new MySingletonImp4();
            }

        } else{
            return mySingletonImp4;
        }
    }
}
