package j18_Constructor.Task;

import java.util.Scanner;

public class ElektrikHesabi {
    Scanner scan = new Scanner(System.in);
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan, tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    int toplamTuketimEnerji;

    double oran = 0.7;
    double fatura;



    public void tüketimEkle() {

        for (int i = 1; i <= 8; i++) {

            System.out.println("lütfen " + i + ". haftanın tüketilen enerji miktarını giriniz : ");
            toplamTuketimEnerji += scan.nextInt();
        }

    }

    public void ödenecekTutar() {

        this.fatura = toplamTuketimEnerji * oran;
        System.out.println("toplam ödeme miktarınız = " + this.fatura + " tl dir.");

    }


    public static void main(String[] args) {
        ElektrikHesabi müşteri1 = new ElektrikHesabi();
        müşteri1.tüketimEkle();
        müşteri1.ödenecekTutar();



    }

}
