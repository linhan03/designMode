package factory;

public abstract class Pizza {


    protected OtherA otherA;
    protected OtherB otherB;
    protected OtherC otherC;


    public abstract void prepare();

    public void step1() {
        System.out.println("step1:");
    }

    public void step2() {
        System.out.println("step2:");
    }

    public void step3() {
        System.out.println("step3:");
    }

    enum Type{
        EAST,NORTH,WEST,SOUTH
    }
}
