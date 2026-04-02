package creational.factory.static_factory;

public class Main {
    public static void main(String[] args) {
        User me = User.of("Sérgio");
        System.out.println(me);

    }
}
