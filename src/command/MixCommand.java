package command;

import java.util.List;

public class MixCommand implements Command{
    private List<Command> commands;

    public MixCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        System.out.println("[[[");
        for (Command command : commands) {
            command.execute();
        }
        System.out.println("]]]");
    }

    @Override
    public void rollback() {
        System.out.println("[[[");
        for (Command command : commands) {
            command.rollback();
        }
        System.out.println("]]]");
    }
}
