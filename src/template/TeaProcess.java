package template;

public class TeaProcess extends Process{
    @Override
    protected void drink() {
        System.out.println("drink tea");
    }

    @Override
    protected void add() {
        System.out.println("add lemon");
    }
}
