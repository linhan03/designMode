package factory;

public abstract class Store {



    public Pizza orderPizza(Pizza.Type type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.step1();
        pizza.step2();
        pizza.step3();
        return pizza;
    }

    protected abstract Pizza createPizza(Pizza.Type type);


}
