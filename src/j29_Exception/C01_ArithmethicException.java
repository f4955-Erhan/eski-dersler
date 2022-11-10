package j29_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_ArithmethicException {
    public static void main(String[] args) {
        String str = "";

        // str.charAt(2); //rte StringIndexOutOfBoundsException

        Scanner scan = new Scanner(System.in);
        System.out.println("agam 1.sayi gir : ");
        int sayi1 = scan.nextInt();

        System.out.println("agam 2.sayi gir : ");
        int sayi2 = scan.nextInt();


        try {// hata ihtimali olan code bloğu buraya yazılır
            /*
          1-) try -catch kullanıldığında try blok çalşırsa catch e uğramaz
            try blok exception yakalarsa catch e atlar
          2-) try blok catch veya Finaly olmadan cte verir try block tan sonra birden fazla catch block tanımlanabilir
          aynı anda bir catch blok çalışabilir yahut hiç biri çalışmaz
             */
            int oran = sayi1 / sayi2;
            System.out.println(oran);
        } catch (ArithmeticException matha) {// tüm excpetionların hz adem i
            //hata yakalayıp handle eden code blok
            System.out.println("aritmetic ex."+matha.getMessage());
            matha.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException falanFilan) {// tüm excpetionların hz adem i
            //hata yakalayıp handle eden code blok
            System.out.println("array ex.");
        } catch (Exception e) {// tüm excpetionların hz adem i
            //hata yakalayıp handle eden code blok
            System.out.println("ex.");
        }
        finally {
            //catch blocklardan sonra istenirse finally block kullanılır
            /*
            try- catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally tanımlanır
            hata durumunda catch çalışmazsa pr sonlanır ama finaly tanımlanırsa catch çalışmazsa bile pr akışı devam eder,
            finaly block hsts olsa da olmasa da çalışır.
            cloud database ortamlarında ortamlarında bağlantı kesmek için kullanılır.
            cloud ile connection yazdığınızda

             */

            System.out.println("finally...");
        }
        System.out.println("program sorunsuz çalıştı.. ");
    }
}




