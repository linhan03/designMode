package observer;

public class ControlCenter {


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
