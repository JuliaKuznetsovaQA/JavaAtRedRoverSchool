package HW10;

public final class Manager extends AbstractManager{

    int coefficientValue = 3;

    public Manager(String name, double salary, int numberOfSubordinates) {
        super(name, salary, numberOfSubordinates);
    }

    public Manager(String name, double salary) {
        this(name, salary, 0);
    }

    public Manager(String name) {
        this(name, 0, 0);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + super.getSalary() * getNumberOfSubordinates() / 100 * coefficientValue;
    }

    @Override
    protected double getBonus() {
        return getBaseSalary() * getNumberOfSubordinates() / 100 * coefficientValue;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nSubordinates: " + numberOfSubordinates;
    }
}
