package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate ld = LocalDate.of(year, month, 1);
        DayOfWeek date = ld.getDayOfWeek();
        DayOfWeek last = ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDatOfWeek = " + date);
        System.out.println("lastDayOfWeek = " + last);
    }
}
