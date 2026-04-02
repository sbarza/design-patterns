package creational.prototype;

public class Main {

    public static void main(String[] args) {
        Person original = new Person("Sérgio", 39);
        Person copy = original.clone();
        copy.setName("John");

        System.out.println(original);
        System.out.println(copy);
    }
}
