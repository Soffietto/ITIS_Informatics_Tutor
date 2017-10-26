package ru.kpfu.itis.khayrullin.entity.impl;

import ru.kpfu.itis.khayrullin.entity.Transport;

public class Lorry extends Transport{

    public Lorry(String color, int power, String name, int wheelsCount) {
        super(color, power, name, wheelsCount);
    }

    @Override
    public void bip() {
        super.bip();
        System.out.println("Beep from lorry");
    }
}
