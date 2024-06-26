package HW7;

public class Person {
    public String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getName() {
        if (gender.equals("male")) {
            return "Mr." + name;
        } else if (gender.equals("female")) {
            return "Mrs." + name;
        } else {
            return name;
        }
    }

    void setName(String name) {
        this.name = name;
    }
}
