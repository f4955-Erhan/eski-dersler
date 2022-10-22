package j11_MethodCreation;

public class C04_MethodDepo {

    //main method olmayacak.

    public static void gecmeNotu(int not){

        if (not>=85){

            System.out.println("aagam tebtik");
        }else if (not>=70){

            System.out.println("başarılı");
        } else if (not>=60) {
            System.out.println("geçtin");

        }else if (not>=45){
            System.out.println("ucuz yırttın");

        }else System.out.println("kaldın = "+not);

    }


}
