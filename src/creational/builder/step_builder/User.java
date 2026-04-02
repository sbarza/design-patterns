package creational.builder.step_builder;

public class User {
    private String name;
    private String email;
    private int age;

    private User() {}

    public static NameStep builder() {
        return new Builder();
    }

    public interface NameStep {
        EmailStep name(String name);
    }

    public interface EmailStep {
        AgeStep email(String email);
    }

    public interface AgeStep {
        AgeStep age(int age);
        User build();
    }

    private static class Builder implements NameStep, EmailStep, AgeStep {
        private final User user = new User();

        @Override
        public EmailStep name(String name) {
            user.name = name;
            return this;
        }

        @Override
        public AgeStep email(String email) {
            user.email = email;
            return this;
        }

        @Override
        public AgeStep age(int age) {
            user.age = age;
            return this;
        }

        @Override
        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
