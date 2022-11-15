package j32_Abstract.Abstract02.Örnek01;

public class Runner {

    public static void main(String[] args) {

        Isci maraba1 = new Isci();
        maraba1.maaşBilgisi();
        maraba1.maaşHesapla();
        maraba1.name="Maraba Erhan";
        System.out.println("maraba1.name = " + maraba1.name);
        maraba1.sigorta();

        İdariPersonel müdür= new İdariPersonel();

        müdür.name="Müdür Erhan";
        müdür.maaşBilgisi();
        müdür.maaşHesapla();
        müdür.sigorta();





    }


}
