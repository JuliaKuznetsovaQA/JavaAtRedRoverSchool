package HW7;

import HW7.employees.Employee;
import HW7.employees.Manager;

public class Main {
    public static void main(String[] args) {

        Person Julia = new Person("Julia", 50, "female");

        Person Oleg = new Person("Oleg", 60, "male");

        Person alian = new Person("Roger Smith", 150, "x");

        System.out.println(Oleg.getName());
        System.out.println(Julia.getName());
        System.out.println(alian.getName());

        Employee oleg = new Employee("Oleg", 60, "male", 1000);

        Employee kuzya = new Employee("Oleg", 60, "male", 800);

        Employee julia = new Employee("Julia", 50, "female", 1500);

        System.out.println(kuzya.name);
        System.out.println(julia.name);

        System.out.println(oleg.isSameName(kuzya));
        System.out.println(julia.isSameName(oleg));

        Employee[] employeeArray = {oleg, kuzya, julia};
        System.out.println(Salary.getSum(employeeArray));

        Manager nastya = new Manager("Nastya", 32, "female", 2000, 500);
        System.out.println(nastya.salary + nastya.bonus);

    }
}
