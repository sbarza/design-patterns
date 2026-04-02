package creational.builder.classic_builder;

public class Director {

    public Product build(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
