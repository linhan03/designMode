package command.receiver;

public class Fan {

    private String name;

    private LEVEL level;

    public Fan(String name,LEVEL level) {
        this.name = name;
        this.level = level;
    }

    public void setLevel(LEVEL level) {
        this.level = level;
        System.out.println("==> current level is "+level.name());
    }

    public LEVEL getLevel() {
        return level;
    }

    public enum LEVEL{
        OFF,LOW,MID,HIGH
    }
}
