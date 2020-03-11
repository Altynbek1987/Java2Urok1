package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik ", "Dvor ", Color.BLACK,new Shelter("Bish ","Chue "));
        Dog dog2 = new Dog(Color.BROWN,new Shelter("Manas ", "Kiev "),"Tuzik ", "Alabai ","Sidet ");
        Dog dog3 = new Dog("Rex ", "Buldog ", Color.GRAY,new Shelter("Talas ","Mos "));
        System.out.println(dog1.getInfo());
        System.out.println(dog3.getInfo());
        dog2.printInfo();
        dog1.makeVoice(3);
        dog2.makeVoice("auuuu");
        dog3.makeVoice("gav", 4);


    }
}
