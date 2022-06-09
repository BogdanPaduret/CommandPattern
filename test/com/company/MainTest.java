package com.company;

import com.company.commands.*;
import com.company.models.Car;
import com.company.models.Invoker;
import com.company.models.Laptop;
import com.company.models.Light;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void clientTest() {
        Invoker invoker = new Invoker();

        Light light = new Light();
        Car car = new Car();
        Laptop laptop = new Laptop();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command carOn = new CarOnCommand(car);
        Command carOff = new CarOffCommand(car);
        Command laptopOn = new LaptopOnCommand(laptop);
        Command laptopOff = new LaptopOffCommand(laptop);

        invoker.addCommand(lightOn);
        invoker.addCommand(lightOff);
        invoker.addCommand(carOn);
        invoker.addCommand(carOff);
        invoker.addCommand(laptopOn);
        invoker.addCommand(laptopOff);

        invoker.actionAll();
    }

}