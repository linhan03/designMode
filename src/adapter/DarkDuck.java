package adapter;

public class DarkDuck implements Duck{
    @Override
    public void gaga() {
        System.out.println("dark scare");
    }

    @Override
    public void fly() {
        System.out.println("fly cloud");
    }
}
