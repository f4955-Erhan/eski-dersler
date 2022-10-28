package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        // iki tarih arasında geçen tekrarlanan zamanı tutar

        LocalDate bugün= LocalDate.now();

        LocalDate erhBirthDay= LocalDate.of(1988,10,1);

        Period fark= Period.between(erhBirthDay,bugün);

        System.out.println("fark = " + fark);

        Period period5Gun=Period.ofDays(5);//5 gün
        Period period7Ay=Period.ofMonths(7);//7 ay
        Period periodx=Period.ofMonths(3).ofDays(25);// period da sondaki tanımlama geçerli olur diğerleri ezilir.

        bugün=bugün.plus(period7Ay);//
        System.out.println("bugün = " + bugün);

        bugün=bugün.minus(period5Gun);
        System.out.println("bugün = " + bugün);

        bugün=bugün.plus(periodx);
        System.out.println("bugün = " + bugün);

        LocalDate başlaKurs= LocalDate.of(2022,9,5);

        System.out.println("başlaKurs = " + başlaKurs);






    }
}
