package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugün = LocalDate.now();

        System.out.println(bugün);

        System.out.println(bugün.getDayOfYear());//yılın kaçıncı günü
        System.out.println(bugün.getMonthValue());//ay değeri
        System.out.println(bugün.getDayOfMonth());//ayın günü
        System.out.println(bugün.getDayOfWeek());//haftanın günü
        System.out.println(bugün.getMonth());//hangi ay


        LocalDate date1=LocalDate.of(1923,10,29);
        LocalDate date2=LocalDate.of(1923, Month.JUNE,29);


        //minus tarihte geriye plus ileri tarihe götürür.

        System.out.println("bugün.plusDays(5) = " + bugün.plusDays(5));//5 gün sonra
        System.out.println("bugün.minusDays(5) = " + bugün.minusDays(5));//5 gün önce

        System.out.println("date1.plusMonths(2).minusDays(8) = " + date1.plusMonths(2).minusDays(8));


    }
}
