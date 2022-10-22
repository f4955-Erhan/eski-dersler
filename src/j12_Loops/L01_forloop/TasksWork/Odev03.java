package j12_Loops.L01_forloop.TasksWork;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *kendisine ve 1 e bölünen sayılar = asal sayı
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("lütfen bir tam sayı giriniz");
        int sayi = scan.nextInt();
        asalKontrol(sayi);

        System.out.println(sayi+" sayısı asal mıdır = "+asalKontrol(sayi));
    }
    private static boolean asalKontrol(int sayi) {
        boolean sonuc =true;
        int bolunmeSayisi = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                bolunmeSayisi++;
                sonuc = bolunmeSayisi == 0 ? true : false;
            }
        }
        return sonuc;
    }


}







