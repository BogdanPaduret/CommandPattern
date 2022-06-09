package com.company.commands;

import com.company.models.Laptop;

public class LaptopOffCommand implements Command {

    Laptop laptop;

    public LaptopOffCommand(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void execute() {
        laptop.shutdown();
    }
}
