package decorate;

/**
 * 装饰者模式
 * 设计模式：
 * 1.类应该对扩展开放，对修改关闭
 */
public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk(Drink.Type.MID);
        System.out.println(milk.getDescription() +"   "+milk.cost());
        Coco coco = new Coco(milk);
        System.out.println(coco.getDescription() + "  "+coco.cost());
        Mumu mumu = new Mumu(coco);
        System.out.println(mumu.getDescription() + "  "+ mumu.cost());
        Mumu mumu2 = new Mumu(mumu);
        System.out.println(mumu2.getDescription() + "  "+ mumu2.cost());
    }
}
