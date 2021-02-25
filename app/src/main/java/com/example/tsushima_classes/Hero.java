package com.example.tsushima_classes;

public class Hero {
    String heroName;
    int herolvl=0;
    int baseHealth=0;
    int baseMana=0;
    Double agility=0.0;
    Double strength=0.0;
    Double intelligence= 0.0;
    Double armor= 0.0;


    int totalHealth (){

        return (int)(strength*20)+ baseHealth;
    }

    void executeAttack(double strength){

    }
    public Hero(String heroName, double strength, double agility, double intelligence, int herolvl, int baseHealth, int baseMana, double armor){
        this.heroName = heroName;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.herolvl = herolvl;
        this.baseHealth = baseHealth;
        this.baseMana = baseMana;
        this.armor = armor;
    }

    public Hero(double strength, double agility, double intelligence){
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public Hero(){

    }

}
