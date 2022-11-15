package j32_Abstract.Abstract02.Örnek01;

public class İdariPersonel extends Personel{
    @Override
    public void maaşHesapla() {//implement(zorunlu abstract parentten)
        System.out.println("agam senin maaş eydürür 500 ün altına düşmen");
    }



    @Override
    public void maaşBilgisi() {//implement(zorunlu abstract parentten)
        System.out.println("agam sen işin bilirsin ");


    }

    @Override// isteğe bağlı
    public void sigorta() {// Personel parent class tan override conc. method
        super.sigorta();
    }

}
