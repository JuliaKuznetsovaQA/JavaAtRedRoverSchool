package HW9.employees;

import HW9.months.Month;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private double dailySalary;

    public Employee(String name, int age, String gender, double dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].getWorkDays() * this.getDailySalary();
        }
        return salary;
    }
}
