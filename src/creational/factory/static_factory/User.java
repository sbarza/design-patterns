package creational.factory.static_factory;

public class User {
    private String name;

    private User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public static User of(String name) {
        return new User(name);
    }
}
