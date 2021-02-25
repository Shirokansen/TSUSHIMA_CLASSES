package com.example.tsushima_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = findViewById(R.id.txtDisplay);

        Hero clockwerk = new Hero(26, 13, 18);
        Hero bloodseeker = new Hero("Stygwyr", 15,15,15,1,200,100,1);
        Monster Witch = new Monster();
        Monster SkeletonKnight = new Monster();

        clockwerk.heroName = "Rattletrap";
        clockwerk.herolvl = 1;
        clockwerk.baseHealth = 200;
        clockwerk.baseMana = 75;
        clockwerk.armor = 0.0;



        Hero taps = new Hero();
        taps.herolvl = 99;
        taps.heroName = "Adrian Chadpenit";
        taps.baseHealth = 99999;
        taps.baseMana = 99999;

        display.setText(String.valueOf(clockwerk.totalHealth()));

        bloodseeker.heroName = "Stygwyr";
        clockwerk.executeAttack(56.4);



        SkeletonKnight.monsterName = "Witch";
        SkeletonKnight.armor = 1.0;
        SkeletonKnight.magicResistance = 15.5;
        SkeletonKnight.physicalResistance = 3.5;



        Witch.monsterName = "Skeleton Knight";
        Witch.armor = 15.0;
        Witch.magicResistance = 5.2;
        Witch.physicalResistance = 7.5;


    }

}