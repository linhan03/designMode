package command;

import command.receiver.Fan;

public class FanLowCommand implements Command {
    private Fan fan;
    private Fan.LEVEL preLevel;

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preLevel = fan.getLevel();
        fan.setLevel(Fan.LEVEL.LOW);
    }

    @Override
    public void rollback() {
        fan.setLevel(preLevel);
    }
}
