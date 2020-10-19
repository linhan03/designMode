package decorate;

public class Juice extends Drink {

    public Juice(Type size) {
        this.size = size;
        this.descriptions.add("juice");
    }

    @Override
    public double cost() {
        return size == Type.SMALL?0 :10;
    }
}
