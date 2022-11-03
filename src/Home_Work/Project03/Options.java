package Home_Work.Project03 ;

public class Options {
        Urun obj = new Urun();


    //Parametre olarak Urun classından oluşturulan bir obje alınarak, ilgili ürünlere göre
    // seçim yapması beklenir.
   // Kullanıcı seçim yapabilmek için öncelikle ürünleri görmelidir.
    public void select(Urun produck){
        System.out.println(obj.toString());

    }

    //Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş bir obje alınarak
    // satın alınmak istenen ürünün fiyatı kullanıcının bakiyesinden az ise ekleme yapmasına olanak
    // sağlayan ve ya ekleme yapmak istemiyorsa programdan çıkışını sağlayabilecek bir metot oluşturunuz.
    public void balance(double price, double accountBalance, Urun product){


    }

// Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş bir obje alınarak,
// bakiye satın alınmak istenen üründen daha fazla ve ya eşit ise satın alınma işlemi yapılmalı,
// kullanıcıya kalan bakiye gösterilmeli ve başka bir ürün alınıp alınmak istenmediği sorularak
// ilgili aksiyonlar alınmalıdır.  Kullanıcı başka bir ürün satın almak istiyorsa tekrardan ürünlerin
// gösterildiği metoda gitmelidir.
   public void purchase(double price, double accountBalance, Urun product){


    }




}
