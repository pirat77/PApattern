package org.example.aniamalModels.movingPatterns;

public class Raven extends Bird {

    @Override
    public String moves() {
        return fly();
    }

    public String fly(){
        return "Fru fru!";
    }

}
