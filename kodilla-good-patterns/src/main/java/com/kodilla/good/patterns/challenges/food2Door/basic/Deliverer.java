package com.kodilla.good.patterns.challenges.food2Door.basic;

public class Deliverer {
    private String name;

    public Deliverer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean process(Order order){
        return true;
    }
}
