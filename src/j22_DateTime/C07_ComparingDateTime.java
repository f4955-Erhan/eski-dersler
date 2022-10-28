package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugün = LocalDate.now();
        LocalDate flaanGün = bugün.minusDays(2);
        LocalDate fesmekanGün = bugün.plusDays(2);
        LocalDate yasım=LocalDate.of(1993,4,3);

        System.out.println("bugün = " + bugün);
        System.out.println("flaanGün = " + flaanGün);
        System.out.println("fesmekanGün = " + fesmekanGün);

        //is ile yapılan methodalar boolean değer döndürür

        System.out.println("bugün.isBefore(flaanGün) = " + bugün.isBefore(flaanGün));
        System.out.println("bugün.isBefore(fesmekanGün) = " + bugün.isBefore(fesmekanGün));
        System.out.println("bugün.isAfter(fesmekanGün) = " + bugün.isAfter(fesmekanGün));
        System.out.println("bugün.isAfter(flaanGün) = " + bugün.isAfter(flaanGün));
        System.out.println("bugün.isEqual(flaanGün) = " + bugün.isEqual(flaanGün));
        System.out.println("bugün.isLeapYear() = " + bugün.isLeapYear());

        int fark= bugün.compareTo(fesmekanGün);
        System.out.println("fark = " + fark);// en büyük farkı yazar()

        int yas=bugün.compareTo(yasım);
        System.out.println("yas = " + yas);// en büyük farkı yazar (yıl)


    }

}
