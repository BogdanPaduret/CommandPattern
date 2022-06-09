package com.company.commands;

import com.company.models.Car;

public class CarOnCommand implements Command {

    Car car;

    public CarOnCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.startEngine();
    }

    @Override
    public void undo() {
        car.stopEngine();
    }
}
