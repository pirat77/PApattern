package org.example.aniamalModels.movingPatterns;

public abstract class Animal {
    protected String movingPattern;
    protected String breathingPattern;
    public String breathing(){
        return this.breathingPattern;
    };
    public String moves(){
        return this.movingPattern;
    };
}
