package HW7;

public class Employee {
    String name;
    int age;
    String gender;
    int salary;

    boolean isSameName(Employee employee) {
        return employee.name.equals(name);
    }
}
