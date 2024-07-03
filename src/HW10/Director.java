package HW10;

public final class Director extends AbstractManager{

    int coefficientValue = 9;

    public Director(String name, double salary, int numberOfSubordinates) {
        super(name, salary, numberOfSubordinates);
    }

    public Director(String name, double salary) {
        super(name, salary, 0);
    }

    @Override
    protected double getBonus() {
        return getBaseSalary() * getNumberOfSubordinates() / 100 * coefficientValue;
    }
}
