package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece =  LocalTime.of(01,20);
        LocalTime ogle =  LocalTime.of(13,30);


        Duration fark=Duration.between(gece,ogle); //ogle ile gece zamanı arsındaki fark atandı.

        System.out.println("fark = " + fark);//fark = PT-9H-50M

        System.out.println("fark.toHours() = " + fark.toHours());

        System.out.println("fark.toMinutes() = " + fark.toMinutes());// fark bilgisi dakikaya çevirildi.

        System.out.println("fark.getSeconds() = " + fark.getSeconds());//saniye bilgisi getirildi

        System.out.println("fark.getNano() = " + fark.getNano());

    }
}
