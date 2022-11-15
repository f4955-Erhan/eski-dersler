package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task_HomeWork {

    /*
Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
edip mainde kontrol ediniz.

Trick->
sicaklikKontrol(int sıcaklık){
 throw new IOException();

}

main(){
Scanner ...
try{
 sicaklikKontrol(int sıcaklık);
}
catch (IOException e) {
}

*/
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(Y + "Dikkat sıcaklık kontrolü için lütfen bir derece Celcius(C) değeri giriniz : ");

        try {

            sıcaklıkKontrol();
            System.out.println(G + "hava hojdır. Sen çık dışarı gez...!!");

        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (Exception e) {
            System.out.println("hatalı giriş lütfen tekrar giriniz : " + e.getMessage());
        }
    }
    private static void sıcaklıkKontrol() throws IOException {
        double C = scanner.nextDouble();
        if (C < 10) {
            throw new IOException(R + "lütfen dikkat ediniz dışarıda ayaz var !!! ");
        }

    }
}


