package org.example.aniamalModels.movingPatterns;

public class Piranha extends Fish {
    Piranha(){
        super();
        this.movingPattern = "plum arrghhh plum";
    }

    @Override
    public String moves(){
        return swim();
    }

    public String swim(){
        return this.movingPattern;
    }
}
