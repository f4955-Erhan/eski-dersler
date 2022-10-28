package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate tarih1= LocalDate.of(1923,10,29);
        LocalTime time1= LocalTime.of(23,10,29);

        LocalDateTime ldt1= LocalDateTime.of(tarih1,time1);// birleştirme
        System.out.println("ldt1 = " + ldt1);

        System.out.println("ldt1.getHour() = " + ldt1.getHour());
        System.out.println("ldt1.getMonth() = " + ldt1.getMonth());
        System.out.println("ldt1.getSecond() = " + ldt1.getSecond());
    }
}
