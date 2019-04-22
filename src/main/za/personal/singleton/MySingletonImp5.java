package za.personal.singleton;

public class MySingletonImp5 {

    private MySingletonImp5() {
    }

    private static class LazyInit{
        private static MySingletonImp5 mySingletonImp1 = new MySingletonImp5();
    }

    public static MySingletonImp5 createMySingleton() {
        return LazyInit.mySingletonImp1;
    }

}
