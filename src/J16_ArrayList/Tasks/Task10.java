package J16_ArrayList.Tasks;


import java.util.*;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        Scanner scan =new Scanner(System.in);

        System.out.println("kaç adet sayı gireceksiniz");
        Integer sayilar[]= new Integer[scan.nextInt()];

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i+". index için sayı giriniz : ");
            sayilar[i]= scan.nextInt();
        }
        ArrayList<Integer> listSayilar= new ArrayList<>(Arrays.asList(sayilar));

        for (int i = 0; i < listSayilar.size(); i++) {
            for (int j = 0; j < listSayilar.size(); j++) {

               if (listSayilar.get(i)==listSayilar.get(j)){

                   listSayilar.remove(listSayilar.get(j));
               }
            }
        }

        System.out.println(listSayilar);

    }

}
