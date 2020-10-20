package factory;

/**
 * 抽象工厂
 */
public interface PizzaFactory {

    OtherA createOtherA();

    OtherB createOtherB();

    OtherC createOtherC();
}
