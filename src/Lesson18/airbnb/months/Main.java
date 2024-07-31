package Lesson18.airbnb.months;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Month> winter = List.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);

        for (Month month: winter) {
            System.out.println(month.name() + ": " + month.getDays());
        }

        System.out.println(Arrays.toString(Month.values()));

        System.out.println(Month.valueOf("MARCH"));
    }
}
