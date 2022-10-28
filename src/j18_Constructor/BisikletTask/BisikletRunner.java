package j18_Constructor.BisikletTask;

public class BisikletRunner {
    public static void main(String[] args) {
        Bisiklet binici= new Bisiklet(2,2);

        System.out.println("binici başlangıç hiz = " + binici.hiz+" birim");
        System.out.println("binici başlangıç vites = " + binici.vites);

        binici.işlemYap();

        binici.durumGöster();

    }





}
