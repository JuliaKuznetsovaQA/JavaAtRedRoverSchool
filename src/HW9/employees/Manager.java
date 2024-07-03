package HW9.employees;

import HW9.months.Month;

public final class Manager extends BaseEmployee {
    private final int numberOfSubordinates;

    public Manager(String name, int age, String gender, int dailySalary, int numberOfSubordinates) {
        super(name, age, gender, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        return getBaseSalary(monthArray) * (1 + numberOfSubordinates * 0.01);
    }
}
