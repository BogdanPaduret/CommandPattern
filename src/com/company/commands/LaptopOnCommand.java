package com.company.commands;

import com.company.models.Laptop;

public class LaptopOnCommand implements Command {

    Laptop laptop;

    public LaptopOnCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.powerOn();
    }
}
