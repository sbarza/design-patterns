package creational.factory.abstract_factory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void execute() {
        button.paint();
        checkbox.check();
    }
}
