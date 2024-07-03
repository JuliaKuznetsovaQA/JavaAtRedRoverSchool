package HW10;

public abstract class AbstractManager extends Employee {
    int numberOfSubordinates;

    public AbstractManager(String name, double salary, int numberOfSubordinates) {
        super(name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return super.getBaseSalary() + getBonus();
    }

    protected abstract double getBonus();
}
