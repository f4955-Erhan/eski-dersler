package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("saatlik ücret giriniz :");
        double saUc = scan.nextDouble();

        System.out.println("iş başlama saati giriniz :");
        double baSa = scan.nextDouble();

        System.out.println("iş bitiş saati giriniz :");
        double biSa = scan.nextDouble();

        System.out.println("fazla mesai katsayısı giriniz :");
        double mesaiKS = scan.nextDouble();


        mesaiHesapla(saUc, baSa, biSa, mesaiKS);
        System.out.println("ücretiniz = "+mesaiHesapla(saUc, baSa, biSa, mesaiKS)+" Tl dir.");
    }

    private static double mesaiHesapla(double saUc, double baSa, double biSa, double kSay) {

        double sonuç= (biSa <= 17 && biSa >= 9)? ((biSa - baSa) * saUc):(((biSa - 17) * saUc * kSay )+ ((17 - baSa) * saUc));

        return sonuç;


      // if (bisa <= 17 && bisa >= 9) {
      //     double mesaisiz = (bisa - basa) * sUc;
      //     System.out.println("Ücretiniz = " + mesaisiz + " tl dir.");

      // } else {
      //     double mesaili = ((bisa - 17) * sUc * kS )+ ((17 - basa) * sUc);
      //     System.out.println("Ücretiniz = " + mesaili + " tl dir.");


      // }


    }


}



