package strategy;

public class BlackDuck extends Duck{

    // 定义自己的策略
    public BlackDuck() {
        flyable = new FlyWing();
        quackable = new Momo();
    }

    @Override
    public void display() {
        System.out.println("black duck");
    }
}
