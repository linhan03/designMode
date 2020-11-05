package command;

import command.receiver.Fan;
import command.receiver.Light;

import java.util.ArrayList;

public class main {

    /**
     * light和fan对象应每一盏灯一个light对象，每一个风扇一个fan对象
     * 每一次press的动作都需要new一个新的command对象(除了NoCommand对象可以复用)
     * @param args
     */
    public static void main(String[] args) {
        Machine machine = new Machine(7);
        Light bedroomLight = new Light("bedroom");
        Fan livingRoomFan = new Fan("livingRoom", Fan.LEVEL.OFF);

        ArrayList<Command> commands1 = new ArrayList<>();
        commands1.add(new LightOnCommand(bedroomLight));
        commands1.add(new FanHighCommand(livingRoomFan));
        MixCommand onHighCommand = new MixCommand(commands1);

        ArrayList<Command> commands2 = new ArrayList<>();
        commands2.add(new LightOffCommand(bedroomLight));
        commands2.add(new FanMidCommand(livingRoomFan));
        MixCommand offMidCommand = new MixCommand(commands2);

        NoCommand noCommand = new NoCommand();

        System.out.println(machine);
        machine.setCommand(0,new LightOnCommand(bedroomLight),new LightOffCommand(bedroomLight));
        machine.setCommand(1,new FanOffCommand(livingRoomFan),new FanLowCommand(livingRoomFan));
        machine.setCommand(2,new FanMidCommand(livingRoomFan),new FanHighCommand(livingRoomFan));
        machine.setCommand(3,onHighCommand,noCommand);
        machine.setCommand(4,noCommand,offMidCommand);
        System.out.println(machine);
        machine.leftPress(0);
        machine.rightPress(0);
        machine.leftPress(1);
        machine.rightPress(1);
        machine.leftPress(2);
        machine.rightPress(2);
        machine.leftPress(3);
        machine.rightPress(3);
        machine.leftPress(4);
        machine.rightPress(4);
        System.out.println(machine);
        for (int i = 0; i < 10; i++) {
            machine.back();
        }
    }
}
