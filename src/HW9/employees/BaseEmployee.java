package HW9.employees;

import HW9.months.Month;

public abstract class BaseEmployee {
    private final String name;
    private final int age;
    private final String gender;
    private final double dailySalary;

    public BaseEmployee(String name, int age, String gender, double dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public abstract double getSalary(Month[] monthArray);

    protected double getBaseSalary(Month[] monthArray) {
        double result = 0;
        for (Month month: monthArray) {
            result += month.getWorkingDays() * getDailySalary();
        }
        return result;
    }
}
