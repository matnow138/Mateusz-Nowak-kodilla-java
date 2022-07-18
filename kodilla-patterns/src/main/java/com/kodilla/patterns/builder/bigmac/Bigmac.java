package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final Sauce sauce;
    private final List<Ingredients> ingredients;
    private final int burgers;

    private Bigmac(final Bun bun, final int burgers, final Sauce sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Your Bigmac consists of:\n" + "Bun: " + bun + "\n" + "Quantity of burgers: " + burgers + "\n" + "Sauce: " + sauce + "\n" + "Ingredients: " + ingredients;
    }

    public static class BigmacBuilder {
        private final List<Ingredients> ingredients = new ArrayList<>();
        private Bun bun;
        private int burgers;
        private Sauce sauce;

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(Ingredients ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

}
