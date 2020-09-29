package observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Report implements Observer, DisplayElement {
    private Observable observable;
    private int param1;
    private int param2;
    private String name;

    public Report(Observable observable, String name) {
        this.observable = observable;
        this.name = name;
        this.observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DataCenter) {
            DataCenter dataCenter = (DataCenter) o;
            //观察者主动拉
//            this.param1 = dataCenter.getParam1();
//            this.param2 = dataCenter.getParam2();
//            display();
            // 主题主动推
            if (arg instanceof ArrayList) {
                ArrayList<Integer> list = (ArrayList<Integer>) arg;
                this.param1 = list.get(0);
                this.param2 = list.get(1);
                display();
            }

        }
    }

    @Override
    public void display() {
        System.out.println(name + " -> param1: " + param1 + ",param2: " + param2);
        System.out.println("------------------------------------");
    }
}
