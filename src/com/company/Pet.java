package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random r = new Random();
        return (int) (Math.random() * 10 + 5);
    }

    public final String getInfo() {
        return "Возраст:" + age + " Цвет:" + color + " Назавние приюта:" + shelter.getName()+ " Адресс приюта:"+ shelter.getAddress();
    }

    public Pet() {
    }
}
