package factory;

public class NKStore extends Store {
    @Override
    protected Pizza createPizza(Pizza.Type type) {
        Pizza pizza;
        NKPizzaFactory nkPizzaFactory = new NKPizzaFactory();
        switch (type){
            case EAST:
                pizza = new NKEastPizza(nkPizzaFactory);
                break;
            case WEST:
                pizza = new NKWestPizza(nkPizzaFactory);
                break;
            default:
                pizza = new NKEastPizza(nkPizzaFactory);
                break;
        }
        return pizza;
    }
}
