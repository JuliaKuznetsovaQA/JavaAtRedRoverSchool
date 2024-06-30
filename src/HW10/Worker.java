package HW10;

public class Worker extends Employee{


    public Worker(String name, double salary) {
        super(name, salary);
    }

    public double getSalary() {
        return super.getBaseSalary();
    }

}
