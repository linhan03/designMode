package adapter;

public class DuckTranslation implements Duck{

    private Pig pig;

    public DuckTranslation(Pig pig) {
        this.pig = pig;
    }

    @Override
    public void gaga() {
        pig.keke();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            pig.climbTree();
        }
    }
}
