package j08_ifstatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        int eryas = 33;
        int mlkyas = 40;

        if (eryas == mlkyas) {
            System.out.println("aynı yaştasınız güzel insanlar ");
            System.out.println("ikiz misiniz mi");
        }
        if (eryas >= mlkyas)
            System.out.println("tatlısın");// if blokda{} kullanmazsak ; e kadar çalışır sonra çalışmaz.
        System.out.println("dnjdsjvbsd");


        if (mlkyas + eryas > 80) {
            System.out.println("muck");
        }

        /*
        bağımsız if statement yapıları sadece kendi scop(kapsamlarını)  run edr.
        birden fazla bağımısz if statement yapıları body çalışacağı gibi hiç birisi body de çalışmaz.
         */


    }
}
