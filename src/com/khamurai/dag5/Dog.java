package com.khamurai.dag5;

public class Dog {
    String name;
    String call;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        setBreed(breed);
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void setBreed(String breed) {
        this.breed = breed;
        if(breed.equalsIgnoreCase("labrador")) {
            setCall("Woof");
        } else if(breed.equalsIgnoreCase("poodle")) {
            setCall("Vov");
        } else {
            setCall("Mjau");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " " + call);
    }
}
