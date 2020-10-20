package factory;

public class UKStore extends Store{

    // 工厂方法
    @Override
    protected Pizza createPizza(Pizza.Type type) {
        Pizza pizza;
        UKPizzaFactory ukPizzaFactory = new UKPizzaFactory();
        switch (type){
            case NORTH:
                // 简单工厂
                pizza = new UKNorthPizza(ukPizzaFactory);
                break;
            case SOUTH:
                pizza = new UKSouthPizza(ukPizzaFactory);
                break;
            default:
                pizza = new UKNorthPizza(ukPizzaFactory);
                break;
        }
        return pizza;
    }
}
