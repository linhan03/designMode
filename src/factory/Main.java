package factory;

public class Main {
    public static void main(String[] args) {
        NKStore nkStore = new NKStore();
        nkStore.orderPizza(Pizza.Type.EAST);
        System.out.println("--------");
        nkStore.orderPizza(Pizza.Type.WEST);
        System.out.println("***********");
        UKStore ukStore = new UKStore();
        ukStore.orderPizza(Pizza.Type.NORTH);
        System.out.println("--------");
        ukStore.orderPizza(Pizza.Type.SOUTH);
    }
}
