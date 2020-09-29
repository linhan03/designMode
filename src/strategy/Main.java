package strategy;

/**
 * 策略模式 定义了算法族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
 * 设计原则：
 * 1.独立出应用中需要变化的部分 对应 Flyable 和 Quackable
 * 2.多用组合，少用继承
 * 3.
 */
public class Main {

    public static void main(String[] args) {
        BlackDuck blackDuck = new BlackDuck();
        blackDuck.performFly();
        blackDuck.setFlyable(new FlyNoWay());
        blackDuck.performFly();
        System.out.println("-----------");
        blackDuck.performQuack();
        blackDuck.setQuackable(new Zizi());
        blackDuck.performQuack();
    }
}
