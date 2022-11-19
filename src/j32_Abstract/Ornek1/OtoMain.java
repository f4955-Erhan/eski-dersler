package j32_Abstract.Ornek1;

public class OtoMain {
    public static void main(String[] args) {
        Ford ford1 = new Ford();
        ford1.setUretimYili(2020);
        ford1.setVitesAdedi(-3);

        System.out.println(ford1.getMarka());
        System.out.println(ford1.getUretimYili());
        System.out.println("ford1.getVitesAded() = " + ford1.getVitesAded());
    }
}
