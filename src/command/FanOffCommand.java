package command;

import command.Command;
import command.receiver.Fan;

public class FanOffCommand implements Command {
    private Fan fan;
    private Fan.LEVEL preLevel;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.preLevel = fan.getLevel();
        fan.setLevel(Fan.LEVEL.OFF);
    }

    @Override
    public void rollback() {
        fan.setLevel(preLevel);
    }
}
