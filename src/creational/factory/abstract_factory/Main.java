package creational.factory.abstract_factory;

public class Main {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory);

        app.execute();
    }
}
