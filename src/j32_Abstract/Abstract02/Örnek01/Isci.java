package j32_Abstract.Abstract02.Örnek01;

public class Isci extends  Personel {

    @Override //personel parent classtan implement
    public void maaşHesapla() {
        System.out.println("agam marabalara en çok yevmiye 300 gayme");
    }

    @Override//personel parent classtan implement
    public void maaşBilgisi() {
        System.out.println("agam marabalar çay cugara hariç günde 8 saat kürek mahkumu..");
    }


}
