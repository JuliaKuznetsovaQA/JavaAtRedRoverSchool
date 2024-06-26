package HW7.employees;

public class Manager extends Employee {
    public int bonus;

    public Manager(String name, int age, String gender, int salary, int bonus) {
        super(name, age, gender, salary);
        this.bonus = bonus;
    }
}
