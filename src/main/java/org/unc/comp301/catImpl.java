package org.unc.comp301;

public class catImpl implements Cat{
    private static String name;
    private int age;
    private boolean happyness;
    private int hunger;

    public catImpl(String name, int age, boolean happyness, int hunger){
        this.name = name;
        this.age = age;
        this.happyness = happyness;
        this.hunger = hunger;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getHappyness(){
        return happyness;
    }

    public int getHunger(){
        return hunger;
    }

    public void meow(){
        System.out.println("Meow");
    }


}
