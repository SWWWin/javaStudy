package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
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

        LocalDate thisMonth = LocalDate.of(year, month, 1);
        LocalDate nextMonth = thisMonth.plusMonths(1);

        //0 = sunday, 1 = monday, ...
        int da = thisMonth.getDayOfWeek().getValue() % 7;

        LocalDate ld = thisMonth;

        for(int i = 0; i < da; i ++) {
            System.out.print("  ");
        }


        while(ld.isBefore(nextMonth)) {
            System.out.printf("%2d  ", ld.getDayOfMonth());
            if(ld.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            ld = ld.plusDays(1);
        }
    }
}
