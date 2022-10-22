package j12_Loops.L01_forloop.TasksWork;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("3 ün kuvveti mi? lütfen bir tam sayı giriniz :");
        int sayi = scan.nextInt();


        üçünKuvvetiMi(sayi);
        System.out.println(sayi+" sayısı üçün kuvveti mi ? = "+üçünKuvvetiMi(sayi)+"/"+(üçünKuvvetiMi(sayi)==true?"evet":"hayır"));

    }

    private static boolean üçünKuvvetiMi(int sayi) {

        boolean sonuc =true;

        for (int i = 3; i <=sayi; i*=3) {

            if (sayi%i==0){ sonuc = true;


            }else sonuc =false;

        }
return sonuc;
    }

}
