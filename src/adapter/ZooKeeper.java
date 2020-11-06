package adapter;

public class ZooKeeper {
    private Duck duck;
    private Pig pig;

    public ZooKeeper(Duck duck, Pig pig) {
        this.duck = duck;
        this.pig = pig;
    }

    public void crawl(){
        duck.gaga();
        pig.keke();
    }

    public void move(){
        duck.fly();
        pig.climbTree();
    }
}
