package HW9.employees;

import HW9.months.Month;

public final class Employee extends BaseEmployee{

    public Employee(String name, int age, String gender, double dailySalary) {
        super(name, age, gender, dailySalary);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        return getBaseSalary(monthArray);
    }
}
