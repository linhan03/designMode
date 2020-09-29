package observer;

import java.util.ArrayList;
import java.util.Observable;

public class DataCenter extends Observable {

    private int param1;
    private int param2;

    public DataCenter() {
    }

    public void setData(int param1, int param2){
        this.param1 = param1;
        this.param2 = param2;
        measureData();
    }

    public void measureData() {
        setChanged();
        //观察者主动拉
//        notifyObservers();
        // 主题主动推
        ArrayList<Integer> list = new ArrayList<>();
        list.add(param1);
        list.add(param2);
        notifyObservers(list);
    }

    public int getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }
}
