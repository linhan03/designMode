package command;

import java.util.Arrays;
import java.util.Stack;

public class Machine {
    private int size;
    private Command[] leftCommands;
    private Command[] rightCommands;
    private Stack<Command> preCommands;

    public Machine(int size) {
        this.size = size;
        this.leftCommands = new Command[size];
        NoCommand noCommand = new NoCommand();
        Arrays.fill(this.leftCommands, noCommand);
        this.rightCommands = new Command[size];
        Arrays.fill(this.rightCommands, noCommand);
        this.preCommands = new Stack<>();
    }

    public void setCommand(int slot, Command leftCommand, Command rightCommand) {
        leftCommands[slot] = leftCommand;
        rightCommands[slot] = rightCommand;
    }

    public void leftPress(int slot) {
        leftCommands[slot].execute();
        preCommands.push(leftCommands[slot]);
    }

    public void rightPress(int slot) {
        rightCommands[slot].execute();
        preCommands.push(rightCommands[slot]);
    }

    public void back() {
        if (!preCommands.empty()) {
            Command pop = preCommands.pop();
            pop.rollback();
        }else {
            System.out.println("no command");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=====================\n");
        for (int i = 0; i < size; i++) {
            sb.append("slot " + i + " : [leftCommand = " + leftCommands[i].getClass().getSimpleName()
                    + "]  [rightCommand = " + rightCommands[i].getClass().getSimpleName() + "]\n");
        }
        sb.append("=====================\n");
        sb.append("preCommands: \n");
        for (Command preCommand : preCommands) {
            sb.append(" "+preCommand.getClass().getSimpleName()+" ");
        }
        sb.append("=====================");
        return sb.toString();
    }
}
