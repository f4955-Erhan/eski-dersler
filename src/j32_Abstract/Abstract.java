package j32_Abstract;

public class Abstract {
    /*
    Bazı durumlarda child classlar parent classtaki methodların genellikle bodylerini değiştirerek override ederler
    bu gibi durumlarda parent classtaki methoda body tanımlamak ram ve memory açısından gereksizdir.
    Çözüm olarak java parent class a bodysiz abstract methodlar tanımlamıştır

    2-Parent class taki abstract methodlar app güvenliği açısından child calss ta override edilmelk zorundadır
    eğer parent classtaki child class ın mutlaka kullanılması gereken method vasa abstract tanımlanmalı motor()
    her araçta olmalı

    3- abstract method tanımlamak için

    a) {} body olmaz
    b) access modifier sonrası abstract keyword kullanılmalı
    abstract class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı
    4- abstract method sadece abs class da tanımlanabiir kesinlikle concrete class da abs method tanımlanamaz
     ama abs class ta concrete method tanımlanabilir.
     5-abs class içinde hem abs method hem de concrete method tanımlanabilir
     6- bir concrete child class abstract class extends edilirse ıplementler zorunlu override concrete methodlar isteğe bağlı
     7-parent child ilişkisi olan abs claslar ımplement yapmak zorunda değildir
     8- parent olan abs class birden çok concerete veya abs child class extends edebilir
      ancak child class birden çok abs parent clastan extends edemez
     9- abs classta final ve abs method tanımlanamaz -- 9-10-11--- override edilemeyeceği için olmaz
     10- abs class ta static ve abs method tanımlanamaz
     11- abs class ta private ve abs method
     12- ****abstract class kesinlikle obj üretemez!!!!!
       Trick--- abstact Class lar referansı child Class ın obj sini tutabilir(poliformizm)





         */
}
