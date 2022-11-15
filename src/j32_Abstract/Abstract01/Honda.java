package j32_Abstract.Abstract01;

public abstract class Honda {

    public abstract void motor();
     void sunroof(){
         System.out.println("ağam keyfin hoştur fiyat++ ");
     }

     // abs classta veriable tanımlanabilir mi
    String name="gülsüm hanım Team Lead";
     // veriablelar abs tanımlanırmı--- kesinlikle hayır



    abstract void koltuk();
    abstract void kapı();

    // final void finalMethod(); -- concrete method bodysiz olamaz
    // final abstract void finalMethod(); -- abs method final olamaz

    // private void privateMethod(); -- concrete method bodysiz olamaz
    // private abstract void privateMethod(); -- abs method private olamaz

   //  Honda obj =new Honda ();//melekler obj almaz



}
