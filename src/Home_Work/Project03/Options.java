package Home_Work.Project03;

import java.util.Scanner;

public class Options {
    Scanner scan = new Scanner(System.in);
    Urun obj = new Urun();


    //Parametre olarak Urun classından oluşturulan bir obje alınarak, ilgili ürünlere göre
    // seçim yapması beklenir.
    // Kullanıcı seçim yapabilmek için öncelikle ürünleri görmelidir.
    public void select(double accountBalance, Urun produck) {

        System.out.println(obj.toString());
        switch (scan.nextInt()) {
            case 1:
                balance(obj.kraker, accountBalance, obj);
                break;
            case 2:
                balance(obj.cips, accountBalance, obj);
                break;
            case 3:
                balance(obj.cocaCola, accountBalance, obj);
                break;
            case 4:
                balance(obj.fanta, accountBalance, obj);
                break;
            case 5:
                balance(obj.su, accountBalance, obj);
                break;
            case 6:
                balance(obj.cay, accountBalance, obj);
                break;
            case 7:
                balance(obj.filtreKahve, accountBalance, obj);
                break;

            case 8:
                System.out.println("lütfen eklemek istediğiniz para miktarını giriniz");
                accountBalance += scan.nextDouble();
                select(accountBalance, obj);
                break;
            case 0:
                System.out.println("Allah bereket versin, çıkış yaptınız ....! kalan bakieniz : " + accountBalance + " tl iade ediliyor iade bölümünden alınız.");
                break;
            default:
                System.out.println("hatalı giriş yaptınız bir önceki menüye yönlendiriliyorsunuz...");
                select(accountBalance, obj);
        }

    }

    //Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş bir obje alınarak
    // satın alınmak istenen ürünün fiyatı kullanıcının bakiyesinden az ise ekleme yapmasına olanak
    // sağlayan ve ya ekleme yapmak istemiyorsa programdan çıkışını sağlayabilecek bir metot oluşturunuz.
    public void balance(double price, double accountBalance, Urun product) {
        //eksiklik giderici


        if (price > accountBalance) {
            System.out.println(price + " tl lik ürün seçtiniz yetersiz bakiye !!! bakiyeniz : " + accountBalance + " tl dir.\n bakiye eklemek için ->(1)<- para iadesi için ->(0)<-'ı tuşlayınız");

            switch (scan.nextInt()) {
                case 0:
                    System.out.println("çıkış yaptınız bakiyeniz = " + accountBalance + " tl iade ediliyor..!!!");
                    break;

                case 1:
                    System.out.println("lütfen yükleyeceğiniz bakiyeyi giriniz...");
                    accountBalance += scan.nextDouble();
                    System.out.println("bakiyeniz : " + accountBalance + " ₺");
                    select(accountBalance, obj);
            }
        } else {
            purchase(price, accountBalance, obj);
        }


    }

    // Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş bir obje alınarak,
// bakiye satın alınmak istenen üründen daha fazla ve ya eşit ise satın alınma işlemi yapılmalı,
// kullanıcıya kalan bakiye gösterilmeli ve başka bir ürün alınıp alınmak istenmediği sorularak
// ilgili aksiyonlar alınmalıdır.  Kullanıcı başka bir ürün satın almak istiyorsa tekrardan ürünlerin
// gösterildiği metoda gitmelidir.
    public void purchase(double price, double accountBalance, Urun product) {
//satın alınan method

        System.out.println("işleminiz başarıyla gerçekleştirilmiştir ürününüzü alınız!!\nkalan bakiyeniz : " + (accountBalance - price));
        select(accountBalance - price, obj);
    }


}
