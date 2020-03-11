package com.company;

public final class Dog extends Pet{
   private String name;
   private String breed;
   private String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog() {
    }

    public Dog(String name, String breed, Color color,Shelter shelter) {
        super(color,shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(Color color, Shelter shelter, String name, String breed, String commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }
    public void makeVoice(String voice,int number){
        for (int i = 0; i < number; i++) {
            System.out.println(voice);

        }
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public void makeVoice(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Gav gav");
        }
    }

    public void printInfo(){
        System.out.println( "Имя собака: " + name + " Парода собака: " + breed +" Команда: " + commands);
    }

}
