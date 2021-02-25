package com.example.tsushima_classes;

public class Monster {

    String monsterName = "";
    int health = 0;
    int mana = 0;
    int damage = 0;
    Double armor = 0.0;
    Double magicResistance = 0.0;
    Double physicalResistance = 0.0;
    boolean berserkON;
    double strengthADD = 0.0;


    public void regen(){
        berserkON = true;
        strengthADD = strengthADD *5.2;
    }
    public void regen(int i){
        strengthADD++;
    }

    public Monster(int health, int mana, int damage){
        this.health = health;
        this.mana = mana;
        this.damage = damage;

    }

    public Monster(){
    }



}
