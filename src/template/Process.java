package template;

public abstract class Process {

    public void makeDrink(){
        boil();
        poll();
        if (verify()) {
            add();
        }
        drink();
    }

    protected abstract void drink();

    protected abstract void add();


    final void boil(){
        System.out.println("boil water");
    }

    final void poll(){
        System.out.println("poll water");
    }

    protected boolean verify() {
        return true;
    }
}
