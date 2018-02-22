package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();
    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingriedent(String ingriedent) {
            ingredients.add(ingriedent);
            return this;
        }
        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }
    private Bigmac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
        }
    public String getRoll() {
        return roll;
    }
    public int getBurgers() {
        return burgers;
    }
    public String getSauce() {
        return sauce;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
}
