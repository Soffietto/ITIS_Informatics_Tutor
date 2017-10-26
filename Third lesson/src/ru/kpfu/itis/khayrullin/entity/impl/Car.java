package ru.kpfu.itis.khayrullin.entity.impl;

import ru.kpfu.itis.khayrullin.entity.Transport;

public class Car extends Transport {
    public Car(String color, int power, String name, int wheelsCount) {
        super(color, power, name, wheelsCount);
    }

    @Override
    public void bip() {
        System.out.println("Beep from car");
    }
}
