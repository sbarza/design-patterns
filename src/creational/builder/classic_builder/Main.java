package creational.builder.classic_builder;

public class Main {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();

        director.build(builder);

        Product product = builder.getResult();
        System.out.println(product);
    }
}
