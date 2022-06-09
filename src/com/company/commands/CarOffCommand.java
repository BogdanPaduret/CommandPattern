package com.company.commands;

import com.company.models.Car;

public class CarOffCommand implements Command {

    Car car;

    public CarOffCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stopEngine();
    }

    @Override
    public void undo() {
        car.startEngine();
    }
}
