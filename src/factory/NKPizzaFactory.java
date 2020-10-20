package factory;

public class NKPizzaFactory implements PizzaFactory {
    @Override
    public OtherA createOtherA() {
        return new OtherAa();
    }

    @Override
    public OtherB createOtherB() {
        return new OtherBa();
    }

    @Override
    public OtherC createOtherC() {
        return new OtherCa();
    }
}
