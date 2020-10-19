package decorate;

public class Coco extends Food {
    protected Drink drink;

    public Coco(Drink drink) {
        this.drink = drink;
        this.descriptions.addAll(drink.descriptions);
        this.descriptions.add("coco");
        this.size= drink.size;
    }

    @Override
    public double cost() {
        return drink.cost() + (drink.getSize() == Type.SMALL ? 0.2 : 2.0);
    }
}
