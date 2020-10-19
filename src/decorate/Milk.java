package decorate;

public class Milk extends Drink{

    public Milk(Type size){
        this.size = size;
        this.descriptions.add("milk");
    }



    @Override
    public double cost() {
        return size==Type.SMALL?0.2:2.0;
    }
}
