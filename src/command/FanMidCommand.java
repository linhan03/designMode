package command;

import command.receiver.Fan;

public class FanMidCommand implements Command {
    private Fan fan;
    private Fan.LEVEL preLevel;

    public FanMidCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preLevel = fan.getLevel();
        fan.setLevel(Fan.LEVEL.MID);
    }

    @Override
    public void rollback() {
        fan.setLevel(preLevel);
    }
}
