package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.naming.Name;

public class Main {


    public static void main(String[] args) {
        Dog dog1 = new Dog() {
        };
        dog1.makeVoice("Gav Gav");
        System.out.println("__________________________________________________________________");

        Dog dog2 = new Dog("Caesar", "Pit bull", "white ", "HOMELESS IN BISHKEK ");
        {

            System.out.println("Name" + "- " + "Caesar ");
            System.out.println("breed" + "- " + "Pit bull ");
            System.out.println("color" + "- " + "white ");
            System.out.println("Shelter" + "- " + "HOMELESS IN BISHKEK ");
            dog2.makeVoice("Gav gav");
            System.out.println("_________________________________________________________________");
        }


        Dog dog3 = new Dog("Caesar", "Pit bull", "white ", "HOMELESS IN BISHKEK ", "Barking") {
        };
        System.out.println("commands" + " -" + "Barking");
        dog3.makeVoice("Gav gav ");

        
    }






























}
