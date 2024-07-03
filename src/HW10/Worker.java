package HW10;

public class Worker extends Employee{


    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary();
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }

}
