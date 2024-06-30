package HW10;

public class Manager extends Worker{

    int numberOfSubordinates;

    public Manager(String name, double salary, int numberOfSubordinates) {
        super(name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public Manager(String name, double salary) {
        this(name, salary, 0);
    }

    public Manager(String name) {
        this(name, 0, 0);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + super.getSalary() * getNumberOfSubordinates() / 100 * 3;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nSubordinates: " + numberOfSubordinates;
    }
}
