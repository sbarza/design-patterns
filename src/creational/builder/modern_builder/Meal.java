package creational.builder.modern_builder;

import java.util.Objects;

public class Meal {

    // Required
    private final Burger burger;

    // Optional
    private final Drink drink;
    private final Fries fries;

    // Private Meal constructor used only by the Builder
    private Meal(Builder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.fries = builder.fries;
    }


    // Static inner Builder for constructing Meal objects
    public static class Builder {

        private final Burger burger;
        private Drink drink;
        private Fries fries;

        public Builder(Burger burger) {
            this.burger = Objects.requireNonNull(burger, "burger must be not be null");
        }

        // Setter for optional drink
        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        // Setter for optional fries
        public Builder fries(Fries fries) {
            this.fries = fries;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }

    // Returns a string representation of the Meal
    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", fries=" + fries +
                '}';
    }
}
