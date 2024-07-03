package HW9.months;

public class MonthUtils {

    private MonthUtils(){}

    public final static Month JANUARY = new Month("January", 31, 21);
    public final static Month FEBRUARY = new Month("February", 29, 20);
    public final static Month MARCH = new Month("March", 31, 21);
    public final static Month APRIL = new Month("April", 30, 22);
    public final static Month MAY = new Month("May", 31, 22);
    public final static Month JUNE = new Month("June", 30, 19);
    public final static Month JULY = new Month("July", 31, 22);
    public final static Month AUGUST = new Month("August", 31, 22);
    public final static Month SEPTEMBER = new Month("September", 30, 20);
    public final static Month OCTOBER = new Month("October", 31, 22);
    public final static Month NOVEMBER = new Month("November", 30, 19);
    public final static Month DECEMBER = new Month("December", 31, 21);

    public static Month[] ALL_MONTHS = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER,
            NOVEMBER, DECEMBER };

    public static Month[] SUMMER = {
            JUNE, JULY, AUGUST
    };

    public final static Month[] getQuarter1() {
        return new Month[]{JANUARY, FEBRUARY, MARCH};
        }

    public final static Month[] getQuarter2() {
        return new Month[]{APRIL,MAY,JUNE};
    }

    public final static Month[] getQuarter3() {
        return new Month[]{JULY, AUGUST, SEPTEMBER};
    }

    public final static Month[] getQuarter4() {
        return new Month[]{OCTOBER, NOVEMBER, DECEMBER};
    }

    public final static Month[] getHalfYear1() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
    }

    public final static Month[] getHalfYear2() {
        return new Month[]{JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    public final static Month[] getYear() {
        return new Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }
    }
