package observer;

/**
 * 观察者模式
 * 设计原则：
 * 1.为了交互对象之间的松耦合设计而努力
 * 2.针对接口编程，不针对实现编程
 * 3.多用组合，少用继承
 */
public class Main {


    public static void main(String[] args) throws InterruptedException {
        DataCenter dataCenter = new DataCenter();
        Report report = new Report(dataCenter,"A");
        Report report1 = new Report(dataCenter,"B");
        Report report2 = new Report(dataCenter,"C");

        dataCenter.setData(1,2);
        Thread.sleep(1000);
        dataCenter.setData(3,4);
        Thread.sleep(2000);
        dataCenter.setData(5,6);
    }
}
