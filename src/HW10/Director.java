package HW10;

public class Director extends Manager{

    public Director(String name, double salary, int numberOfSubordinates) {
        super(name, salary, numberOfSubordinates);
    }

    public Director(String name, double salary) {
        super(name, salary);
    }

    public Director(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + super.getSalary() * getNumberOfSubordinates() / 100 * 9;
    }
}
