package creational.builder.classic_builder;

public interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
