package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.println("월을 입력하세요: ");
        int month = sc.nextInt();


        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        LocalDate ld = LocalDate.of(year, month, 1);
        LocalDate last = ld.plusMonths(1);
        int offsetWeekDays = ld.getDayOfWeek().getValue() % 7;

        for(int i = 0; i < offsetWeekDays; i ++) {
            System.out.println("    ");
        }

        LocalDate dayIterator = ld;
        while (dayIterator.isBefore(last)) {
            System.out.printf("%2d  ", dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }





    }
}
