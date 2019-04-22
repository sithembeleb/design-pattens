package za.personal.singleton;

/*
 This approach will always create this object on load even if its not used
 */
public class MySingletonImp3 {

    private static MySingletonImp3 mySingletonImp3 = new MySingletonImp3();

    private MySingletonImp3() {
    }

    public static synchronized MySingletonImp3 createMySingleton() {

        return mySingletonImp3;
    }
}
