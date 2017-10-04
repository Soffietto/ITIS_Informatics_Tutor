package oop.human;

public class Human {
    private String name;
    private Head head;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void easyHeadSetter228(String hairColor, int eyeCount) {
        Head head = new Head();
        head.setHairColor(hairColor);
        head.setEyeCount(eyeCount);
        this.head = head;
    }
}
