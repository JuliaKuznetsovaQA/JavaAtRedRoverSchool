package HW10;

public abstract class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBaseSalary() {
        return salary;
    }

    public void setBaseSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "===========================" +
                "\nname: " + getName() +
                "\nsalary: " + getSalary();
    }
}
