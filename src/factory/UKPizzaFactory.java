package factory;

public class UKPizzaFactory implements PizzaFactory{
    @Override
    public OtherA createOtherA() {
        return new OtherAb();
    }

    @Override
    public OtherB createOtherB() {
        return new OtherBb();
    }

    @Override
    public OtherC createOtherC() {
        return new OtherCb();
    }
}
