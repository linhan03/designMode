package template;


public class Main {

    /**
     * 原则：让搞错调用低层，尽量不让低层调用形成明显的循环
     * 和策略模式的区别：
     * 策略模式： 组合 委托完整算法
     * 模板方法模式： 继承 有算法骨架，替换部分算法细节
     * @param args
     */
    public static void main(String[] args) {
        TeaProcess teaProcess = new TeaProcess();
        teaProcess.makeDrink();
        CoffeeProcess coffeeProcess = new CoffeeProcess();
        coffeeProcess.makeDrink();
    }
}
