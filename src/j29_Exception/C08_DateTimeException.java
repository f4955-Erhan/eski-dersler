package j29_Exception;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {


        try {
            LocalDate date=LocalDate.of(2022,4,33);

            System.out.println("agam denedik sıkıntı yok çalışıyor");

        }catch (DateTimeException e){

            System.out.println(e.getMessage()+" hataaa yakalandı....");

        }

    }
}
