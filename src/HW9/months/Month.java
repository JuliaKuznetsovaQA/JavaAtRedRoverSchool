package HW9.months;

public class Month {

    private String month;
    private int days;
    private int workDays;

    public Month(String month, int days, int workDays) {
        this.month = month;
        this.days = days;
        this.workDays = workDays;
    }

    public String getMonth() {
        return month;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }
}
