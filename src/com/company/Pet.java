package com.company;

import java.util.Random;

class pet<Color> {
    int age = generateDefaultAge();


    Color color;
    Shelter shelter;

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
        int i = r.nextInt(20);
        return i;
        // return ((int) (Math.random() * 10 + 5));


    }

    public String getInfo() {

        return "pet  {" +
                "age =" + age +
                ",shelter = " + shelter.getName() + " " + shelter.getAddress() +", color = " + color + "}" ;

    }



}


