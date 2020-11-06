package adapter;

public class Main {

    /**
     * 设计原则： 最少知识原则，只和你的密友谈话
     * 对象只调用：1.该对象本身，2.被当做方法参数传递进来的对象，3此方法所创建货实例化的任何对象，4.对象的任何组件
     * 错误示例； station.getThermometer().getTemperature()
     * 争取示例： station.getTemperature() 此方法由station本身提供
     * 利：减少对象的依赖，不必要认识更多的对象
     * 弊：导致更多的代码需要编写，提升复杂度和时间成本，降低运行性能
     *
     * 装饰者模式：增强接口
     * @param args
     */
    public static void main(String[] args) {
        DarkDuck darkDuck = new DarkDuck();
        HandsomePig handsomePig = new HandsomePig();
        darkDuck.fly();
        darkDuck.gaga();
        handsomePig.climbTree();
        handsomePig.keke();
        // 适配器模式：转化接口
        DuckTranslation duck = new DuckTranslation(handsomePig);
        duck.fly();
        duck.gaga();

        // 外观模式：简化接口
        ZooKeeper zooKeeper = new ZooKeeper(darkDuck, handsomePig);
        zooKeeper.crawl();
        zooKeeper.move();
        ZooKeeper keeper = new ZooKeeper(duck, handsomePig);
        keeper.crawl();
        keeper.move();
    }
}
