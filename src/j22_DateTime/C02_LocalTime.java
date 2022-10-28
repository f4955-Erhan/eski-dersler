package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        /*
        saat dakika ve saniye ve salise tutar.
         */

        LocalTime suAn=LocalTime.now();

        System.out.println("suAn = " + suAn);

        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());

        LocalTime time1=LocalTime.of(20,43,34,57);//belirli bir saat dakika saniyesi olan
        System.out.println("time1.plusHours(4).minusMinutes(20) = " + time1.plusHours(4).minusMinutes(20));
        System.out.println("time1.plusMinutes(150).minusHours(2) = " + time1.plusMinutes(150).minusHours(2));

        System.out.println("time1 = " + time1);

        //belirli bir zamanda ileri geri zaman gidilebilir.
        LocalTime ForBaşi=LocalTime.now();
        System.out.println("ForBaşi.getNano() = " + ForBaşi.getNano());
        int sayı=0;
        for (int i = 0; i < 1000; i++) {
            sayı+=i;

        }
        LocalTime ForSonu=LocalTime.now();
        System.out.println("ForSonu.getNano() = " + ForSonu.getNano());

        System.out.println("ForSonu-ForBaşi = " + (ForSonu.getNano()-ForBaşi.getNano()));


    }
}
