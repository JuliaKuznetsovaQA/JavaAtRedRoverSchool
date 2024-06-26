package HW7.employees;

import HW7.Person;


public class Employee extends Person {

    public int salary;

    public Employee(String name, int age, String gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }


    public boolean isSameName(Employee employee) {
        return employee.name.equals(name);
    }
}
