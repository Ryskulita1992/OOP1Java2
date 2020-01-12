package com.company;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class Dog extends pet {

    String name;
    String breed;
    String  commands ;

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

    public Dog(){};

    public Dog(String name, String breed, String color, String shelter) {
        this.name = name;
        this.breed = breed;
        this.color=getColor();
        this.shelter =getShelter();

    }
    public Dog(String name, String breed, String color, String shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.color=getColor();
        this.shelter =getShelter();
        this.commands = commands;
    }

    public static void makeVoice(){
        System.out.println("gav gav");

    }
    public static  void makeVoice ( String voice){
        System.out.println( " gav gav ");
    };
    public static void makeVoice (int num){
        System.out.println( " 5 ");
    };


    @Override
    public String getInfo(){
        return "return \"pet  {\" +\n" +
                "                \"age =\" + age +\n" +
                "                \",shelter = \" + shelter.getName() + \" \" + shelter.getAddress() +\", color = \" + color + \"}\" ;\n ";
    };



}
