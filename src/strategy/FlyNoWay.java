package strategy;

public class FlyNoWay implements Flyable{
    @Override
    public void fly() {
        System.out.println("fly no way");
    }
}
