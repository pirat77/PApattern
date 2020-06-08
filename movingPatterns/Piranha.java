package org.example.aniamalModels.movingPatterns;

public class Piranha extends Fish {

    @Override
    public String moves() {
        return swim();
    }

    public String swim(){
        return "plum arrghhh plum";
    }
}
