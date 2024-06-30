package HW9.employees;

import HW9.months.Month;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int age, String gender, int dailySalary, int numberOfSubordinates) {
        super(name, age, gender, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].getWorkDays() * this.getDailySalary();
        }
        double bonus = 0.01 * this.numberOfSubordinates;
        salary += salary * bonus;
        return salary;
    }
}
