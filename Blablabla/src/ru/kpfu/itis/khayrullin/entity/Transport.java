package ru.kpfu.itis.khayrullin.entity;

public class Transport extends Tehnika {

    private String name;
    private int wheelsCount;

    public Transport(String color, int power,
                     String name, int wheelsCount) {
        super(color, power);
        this.name = name;
        this.wheelsCount = wheelsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void bip() {
        System.out.println("Beep from transport");
    }
}
