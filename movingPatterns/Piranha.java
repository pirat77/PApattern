package org.example.aniamalModels.movingPatterns;

public class Piranha extends Fish {
    Piranha(){
        super();
        this.movingPattern = "plum arrghhh plum";
    }

    public String move(){
        return swim();
    }

    public String swim(){
        return this.movingPattern;
    }
}
