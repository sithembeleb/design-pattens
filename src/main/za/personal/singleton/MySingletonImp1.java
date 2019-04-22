package za.personal.singleton;


/*
    -- This should be used on a single threaded application
    -- Potential problem will happen if 2 Threads are running at the same time and mySingletonImp1 is still null
        2 instances of this class will be created
 */
public class MySingletonImp1 {

    private static MySingletonImp1 mySingletonImp1 = null;

    private MySingletonImp1() {
    }

    public static MySingletonImp1 createMySingleton() {
        if(mySingletonImp1 == null) {
            return new MySingletonImp1();
        } else{
            return mySingletonImp1;
        }
    }
}
