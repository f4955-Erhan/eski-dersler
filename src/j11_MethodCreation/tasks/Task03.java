package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("bir saat giriniz : ");
        int saat = scan.nextInt();

        System.out.println("bir uzunluk olarak mil giriniz : ");
        int mil = scan.nextInt();

        System.out.println("bir kg giriniz : ");
        int kg = scan.nextInt();

        çevir(saat, mil, kg);
    }
    private static void çevir(int s, int m, int kg) {

        int saniye = s * 3600;
        double km = m * 1.609344;
        int gram = kg * 1000;

        System.out.println(s + " saat = " + saniye + " saniyedir. " + m + " mil = " + km + " km dir." + kg + " kg = " + gram + " gramdır.");


    }


}
