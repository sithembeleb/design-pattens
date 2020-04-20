package za.personal.singleton;

/*
 This approach has performance implication on multi-threaded application
*/

public class MySingletonImp2 {

    private static MySingletonImp2 mySingletonImp2;

    private MySingletonImp2() {
    }

    public static synchronized MySingletonImp2 createMySingleton() {
        if(mySingletonImp2 == null) {
            return new MySingletonImp2();
        } else{
            return mySingletonImp2;
        }
    }
}
