package decorate;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink {

    public Type getSize() {
        return size;
    }

    public void setSize(Type size) {
        this.size = size;
    }

    protected Type size;

    protected List<String> descriptions = new ArrayList<>();

    public String getDescription() {
        String[] array = descriptions.toArray(new String[descriptions.size()]);
        return String.join(",",array);
    }
    public abstract double cost();



    enum Type{
        SMALL,MID,BIG
    }
}
