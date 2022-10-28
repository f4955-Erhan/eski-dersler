package j18_Constructor.BisikletTask;

import java.util.Scanner;

public class Bisiklet {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
    Scanner scan = new Scanner(System.in);
    int hiz;
    int vites;

    int yeniHiz;

    public Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    public void işlemYap() {
        System.out.println("yapmak istediğiniz işlem vites için 'v' hız için 'h' ayzınız");
        char secim = scan.next().toLowerCase().charAt(0);

        switch (secim) {
            case 'v':
                System.out.println("vites artırmak için '+' vites düşürmek için '-' yazınız");
                char vitesSecim = scan.next().toLowerCase().charAt(0);
                if (vitesSecim == '+') {
                    vitesArt();

                } else vitesAzal();

                break;

            case 'h':
              hizdeğiş();
                }
        }
    public void hizdeğiş() {
        System.out.println("hız  artırmak için '+' düşürmek için '-' yazınız");
        char hızSecim = scan.next().toLowerCase().charAt(0);
        switch (hızSecim) {
            case '+':
                yeniHiz = hiz + 1;

                break;
            case '-':
                yeniHiz = hiz - 1;

                break;
        }
        if (this.yeniHiz > hiz) {
            vitesArt();

        } else if (this.yeniHiz < hiz && this.yeniHiz > 0) {
            vitesAzal();
        } else {
            System.out.println("girilen değer hatalıdır = " + this.yeniHiz);
            hizdeğiş();
        }
    }
    public void vitesArt() {
        if (vites < 5) {
            vites++;
             hiz++;
        } else System.out.println("vitesiniz maxta");

        işlemYap();
    }

    public void vitesAzal() {
        if (vites > 0) {
            vites--;
            hiz--;
        } else System.out.println("vitesiniz minimumda");

        işlemYap();

    }

    public void durumGöster() {
        System.out.println(" hiz = " + this.hiz + " vites = " + this.vites);
    }


}
