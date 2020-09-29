package strategy;

public abstract class Duck {

    protected Flyable flyable;
    protected Quackable quackable;

    public Duck(){}

    public abstract void display();

    public void performFly(){
        flyable.fly();
    }

    public void performQuack(){
        quackable.quack();
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
