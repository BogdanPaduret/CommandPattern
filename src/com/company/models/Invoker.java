package com.company.models;

import com.company.commands.Command;

import java.util.ArrayList;

public class Invoker {

    ArrayList<Command> commands = new ArrayList<>();
    ArrayList<Command> undoCommands = new ArrayList<>();

    public Invoker() {}

    public void setCommand(int index, Command command) {
        commands.set(index, command);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void action(int index) {
        Command command = commands.get(index);
        command.execute();
        undoCommands.add(command);
    }

    public void actionAll() {
        for (Command c : commands) {
            c.execute();
            undoCommands.add(c);
        }
    }

    public void undo() {
        undoCommands.get(undoCommands.size() - 1).undo();
        undoCommands.remove(undoCommands.size() - 1);
    }

    public void undo(int clicks) {
        int size = undoCommands.size();

        if (clicks > size) {
            clicks = size;
        }

        for (int i = 0; i < clicks; i++) {
            undo();
        }
    }

}
