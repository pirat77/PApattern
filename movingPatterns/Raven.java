package org.example.aniamalModels.movingPatterns;

public class Raven extends Bird {

    Raven(){
        super();
        this.movingPattern="Fru fru!";
    }

    @Override
    public String moves() {
        return fly();
    }

    public String fly(){
        return this.movingPattern;
    }

}
