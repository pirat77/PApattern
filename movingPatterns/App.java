package org.example.aniamalModels.movingPatterns;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Human());
        animals.add(new Lion());
        animals.add(new Piranha());
        animals.add(new Raven());
        for (Animal animal: animals){
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.breathing());
            System.out.println(animal.moves());
            System.out.println();
        }
    }
}
