package singleton;

public class Main {

    public static void main(String[] args) {
        SingleTon1 instance = SingleTon1.getInstance();
        SingleTon2 instance1 = SingleTon2.getInstance();
        SingleTon3 instance2 = SingleTon3.getInstance();
    }
}
