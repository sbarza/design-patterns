package creational.builder.step_builder;

public class Main {

    public static void main(String[] args) {
        User user = User.builder()
                .name("Sérgio")
                .email("sergio@email.com")
                .age(39)
                .build();

        System.out.println(user);
    }
}
