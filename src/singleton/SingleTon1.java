package singleton;

public class SingleTon1 {

    private static SingleTon1 singleTon1;

    private SingleTon1() {
    }

    public static synchronized SingleTon1 getInstance() {
        if (singleTon1 == null) {
            singleTon1 = new SingleTon1();
        }
        return singleTon1;
    }

    public void out() {
        System.out.println("complete");
    }


}
