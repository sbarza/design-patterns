package creational.builder.classic_builder;

public class ConcreteBuilder implements Builder {

    private final Product product = new Product();

    @Override
    public void buildPartA() {
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
