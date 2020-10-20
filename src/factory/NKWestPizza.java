package factory;

public class NKWestPizza extends Pizza{

    private PizzaFactory factory;

    public NKWestPizza(PizzaFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("prepare nk west");
        otherA = factory.createOtherA();
        otherB = factory.createOtherB();
        otherC = factory.createOtherC();
        System.out.println(otherA.getName() + " "+otherB.getName() + " " + otherC.getName());
    }

    @Override
    public void step1() {
        super.step1();
        System.out.println("nk west");
    }

    @Override
    public void step2() {
        super.step2();
    }

    @Override
    public void step3() {
        super.step3();
    }
}
