package HW9.months;

public final class Month {

    private final String name;
    private final int totalDays;
    private final int workingDays;

    public Month(String name, int totalDays, int workingDays) {
        this.name = name;
        this.totalDays = totalDays;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }
}
