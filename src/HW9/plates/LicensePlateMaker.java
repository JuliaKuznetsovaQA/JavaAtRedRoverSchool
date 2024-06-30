package HW9.plates;

public class LicensePlateMaker {
    private String prefix;
    private int lastNumber;

    public LicensePlateMaker(String prefix, int lastNumber) {
        this.prefix = prefix;
        this.lastNumber = lastNumber;
    }

    public LicensePlate makeNextPlate() {
        int nextNumber = lastNumber + 1;
        lastNumber = nextNumber;
        return new LicensePlate(prefix + "-" + nextNumber);
    }
}
