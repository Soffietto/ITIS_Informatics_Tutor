package ru.kpfu.itis.khayrullin.entity;

public class Tehnika {
    private String color;
    private int power;

    public Tehnika(String color, int power) {
        this.color = color;
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void bip() {
        System.out.println("Beep from tehnika");
    }
}
