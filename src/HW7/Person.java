package HW7;

public class Person {
    String name;
    int age;
    String gender;

    String getName() {
        if (gender.equals("male")) {
            return "Mr." + name;
        } else if (gender.equals("female")) {
            return "Mrs." + name;
        } else {
            return name;
        }
    }
}
