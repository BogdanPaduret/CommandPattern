package com.company.models;

import com.company.commands.Command;

import java.util.ArrayList;

public class Invoker {

    ArrayList<Command> commands = new ArrayList<>();

    public Invoker() {}

    public void setCommand(int index, Command command) {
        commands.set(index, command);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void action(int index) {
        commands.get(index).execute();
    }

    public void actionAll() {
        for (Command c : commands) {
            c.execute();
        }
    }

}
