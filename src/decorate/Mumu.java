package decorate;

public class Mumu extends Drink {

    protected Drink drink;

    public Mumu(Drink drink) {
        this.drink = drink;
        this.descriptions.addAll(drink.descriptions);
        this.descriptions.add("mumu");
        this.size= drink.size;
    }

    @Override
    public double cost() {
        return (drink.getSize() == Type.SMALL ? 0.5 : 5.0) + drink.cost();
    }
}
