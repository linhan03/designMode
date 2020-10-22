package singleton;

public class SingleTon3 {
    private volatile static SingleTon3 singleTon3;

    private SingleTon3() {
    }

    public static SingleTon3 getInstance() {
        if (singleTon3 == null) {
            synchronized (SingleTon3.class) {
                if (singleTon3 == null) {
                    singleTon3 = new SingleTon3();
                }
            }
        }
        return singleTon3;
    }
}
