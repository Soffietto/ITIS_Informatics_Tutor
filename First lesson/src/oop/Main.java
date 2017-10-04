package oop;

import oop.human.Head;
import oop.human.Human;

public class Main {

    public static void main(String[] args) {
        Human azat = new Human();
        Human danil = new Human();

        Head azatsHead = new Head();
//        azatsHead.setHairColor("Black");
//        azatsHead.setEyeCount(2);

        azat.setHead(azatsHead);
        azat.getHead().setHairColor("Black");
        azat.getHead().setEyeCount(2);
        azat.setName("Azat");
        danil.setName("Danil Daun");
        azat.setAge(20);
        danil.setAge(2);
        System.out.println(azat.getName());  //Azat
        System.out.println(azat.getAge());   //20
        System.out.println(azat.getHead().getHairColor());  //Black
        System.out.println(azat.getHead().getEyeCount());   //2
        System.out.println(danil.getName()); //Danil Daun
        System.out.println(danil.getAge()); //2
        System.out.println(danil.getHead()); //null
        System.out.println(danil.getHead().getHairColor()); //NullPointerException и выйдет из программы
        System.out.println(danil.getHead().getEyeCount()); //если закомментить строку выше, то NullPointerException и выйдет из программы
        //Если закомментить 2 строки выше, то выполнится то, что внизу
        danil.easyHeadSetter228("White", 2);
        System.out.println(danil.getHead().getHairColor()); //White
        System.out.println(danil.getHead().getEyeCount()); //2
    }
}
