package command;

import command.receiver.Fan;

public class FanHighCommand implements Command {
    private Fan fan;
    private Fan.LEVEL preLevel;

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preLevel = fan.getLevel();
        fan.setLevel(Fan.LEVEL.HIGH);
    }

    @Override
    public void rollback() {
        fan.setLevel(preLevel);
    }
}
